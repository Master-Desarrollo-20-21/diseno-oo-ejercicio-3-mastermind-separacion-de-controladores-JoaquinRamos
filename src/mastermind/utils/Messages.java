package mastermind.utils;

public enum Messages {
	TITLE("----- MASTERMIND -----"),
	ATTEMPTS_COUNT("%s intentos:"),
	SECRET_COMBINATION_HIDDEN("xxxx"),
	PROPOSE_COMBINATION("Combinaci�n propuesta: "),
	SECRET_COMBINATION("Combinaci�n secreta: %s"),
	ATTEMPT("%s --> %s blancos y %s negros"),
	WIN_MESSAGE("��OK, has ganado!!"),
	LOST_MESSAGE("��Looser, has perdido!!"),
	RESUME("Otra partida"),
	BYEBYE("Bye, bye !!");

	private String message;

	Messages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}