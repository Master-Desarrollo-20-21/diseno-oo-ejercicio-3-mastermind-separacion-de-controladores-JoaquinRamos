package mastermind.utils;

public class Result {

	private int whites;
	private int blacks;
	protected static int RESULT_SIZE = Properties.COMBINATION_SIZE;
	protected ResultColor[] colores = new ResultColor[RESULT_SIZE];

	public Result(int blancos, int negros) {
		colores = new ResultColor[RESULT_SIZE];
		this.whites = blancos;
		this.blacks = negros;
		for (int i=0; i<negros;i++) {
			colores[i] = ResultColor.obtenerColor('n');
		}
		for (int i=negros; i<blancos+negros;i++) {
			colores[i] = ResultColor.obtenerColor('b');
		}
	}	

	public int getWhites() {
		return whites;
	}

	public void setWhites(int whites) {
		this.whites = whites;
	}

	public int getBlacks() {
		return blacks;
	}

	public void setBlacks(int blacks) {
		this.blacks = blacks;
	}

}
