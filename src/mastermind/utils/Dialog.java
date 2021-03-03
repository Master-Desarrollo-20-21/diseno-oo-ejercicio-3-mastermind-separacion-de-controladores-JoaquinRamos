package mastermind.utils;

public class Dialog {
	private static final String MESSAGE_ERROR = "Introduce S o N";
	private String title;

	public Dialog(String title) {
		this.title = title;
	}

	public boolean read() {
		assert title != null;

		char answer;
		boolean ok;
		do {
			answer = Console.getInstance().readChar("¿" + this.title + "? (S/N): ");
			ok = Dialog.isAfirmative(answer) || Dialog.isNegative(answer);
			if (!ok) {
				Console.getInstance().writeln(Dialog.MESSAGE_ERROR);
			}
		} while (!ok);
		return Dialog.isAfirmative(answer);
	}

	private static boolean isAfirmative(char answer) {		
		return 'S' == Character.toUpperCase(answer);
	}

	private static boolean isNegative(char answer) {
		return 'N' == Character.toUpperCase(answer);
	}
}