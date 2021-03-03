package mastermind.utils;

public enum ResultColor {
	Black('b'),
	White('w');

	private char key;

	ResultColor(char key) {
		this.key = key;
	}

	public static ResultColor obtenerColor(char caracter) {
		for (ResultColor color : ResultColor.values()) {
			if (color.key == caracter) {
				return color;
			}
		}
		return null;
	}

	public static char getClaveEnIndice(int index) {
		return values()[index].key;
	}

	public char getClave() {
		return this.key;
	}

	public String getValor() {
		return this.toString();
	}

	public static String getTodasClaves() {
		String result = "";
		for(ResultColor color : ResultColor.values()) {
			result += color.getClave();
		}
		return result;
	}
}	