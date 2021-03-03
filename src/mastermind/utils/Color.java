package mastermind.utils;

public enum Color {

	RED('r'),
	BLUE('b'),
	YELLOW('y'),
	GREEN('g'),
	ORANGE('o'),
	PINK('p');

	private final char colorKey;

	Color(char colorKey) {
		this.colorKey = colorKey;
	}

	public static Color of(char colorKey) {
		for (Color color : values()) {
			if (color.colorKey == colorKey) {
				return color;
			}
		}
		return null;
	}

	public static boolean isValidColor(char colorKey) {
		for (Color color : values()) {
			if (color.colorKey == colorKey) {
				return true;
			}
		}
		return false;
	}

	public char getColorKey() {
		return colorKey;
	}

	public static String getAllColorKey() {
		String result = "";
		for(Color color : Color.values()) {
			result += color.getColorKey();
		}
		return result;
	}
}