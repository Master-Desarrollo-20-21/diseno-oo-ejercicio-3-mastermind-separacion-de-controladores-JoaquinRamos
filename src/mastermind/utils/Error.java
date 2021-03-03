package mastermind.utils;

public enum Error {
	WRONG_LENGTH("Longitud err�nea"),
	WRONG_COLORS("Colores err�neos, deben estar entre: " + Color.getAllColorKey()),
	DUPLICATE_COLORS("Colores duplicados"),
	NULL("");

	private final String message;

	Error(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public boolean isNull() {
		return this == Error.NULL;
	}
}