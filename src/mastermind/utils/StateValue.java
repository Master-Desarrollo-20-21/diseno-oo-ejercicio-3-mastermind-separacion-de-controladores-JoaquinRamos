package mastermind.utils;

public enum StateValue {
	INITIAL,
	IN_GAME,
	RESUME,
	EXIT,
	NULL;

	public boolean isNull() {
		return this == StateValue.NULL;
	}
}
