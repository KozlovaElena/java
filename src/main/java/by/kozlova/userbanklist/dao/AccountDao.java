package by.kozlova.userbanklist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.kozlova.userbanklist.bean.Account;

public class AccountDao {
	public final static String SELECT_ALL = "SELECT * FROM account";

	public List<Account> getAll() throws DaoException {

		List<Account> allAccountsList = new ArrayList<Account>();

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			throw new DaoException(e);
		}

		try (Connection con = DriverManager.getConnection(DaoConstans.DB_URL, DaoConstans.DB_USERNAME,
				DaoConstans.DB_PASSWORD);
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(SELECT_ALL);) {
			while (rs.next()) {
				Account accountBeanDao = new Account();
				accountBeanDao.setId(rs.getInt(1));
				accountBeanDao.setAmount(rs.getInt(2));
				accountBeanDao.setUserId(rs.getInt(3));
				allAccountsList.add(accountBeanDao);
			}

		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return allAccountsList;
	}
}
