package by.kozlova.userbanklist.command;

public class CommandException extends Exception {
	private static final long serialVersionUID = 1L;

	public CommandException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommandException(String message) {
		super(message);
	}

	public CommandException(Throwable cause) {
		super(cause);
	}

}
