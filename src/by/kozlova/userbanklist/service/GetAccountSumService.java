package by.kozlova.userbanklist.service;

import java.util.List;

import by.kozlova.userbanklist.bean.Account;
import by.kozlova.userbanklist.dao.AccountDao;
import by.kozlova.userbanklist.dao.DaoException;

public class GetAccountSumService {
	public int getAccountSum() throws ServiceException {
		AccountDao accountDao = new AccountDao();

		List<Account> accountlist;
		try {
			accountlist = accountDao.getAll();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

		int allAccountSum = 0;

		for (Account account : accountlist) {
			allAccountSum += account.getAmount();

		}

		return allAccountSum;
	}
}
