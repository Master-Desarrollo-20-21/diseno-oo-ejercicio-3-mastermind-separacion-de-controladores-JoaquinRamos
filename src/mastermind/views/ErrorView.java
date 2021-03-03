package mastermind.views;

import mastermind.utils.Console;
import mastermind.utils.Error;

public class ErrorView {

	protected Error error;

	public ErrorView(Error error) {
		this.error = error;
	}

	public static ErrorView of(Error error) {
		return new ErrorView(error);
	}

	public void writeln() {
		Console.getInstance().writeln(error.getMessage());
	}
}
