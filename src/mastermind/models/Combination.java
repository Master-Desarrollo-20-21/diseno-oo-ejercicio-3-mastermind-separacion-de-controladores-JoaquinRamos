package mastermind.models;

import java.util.ArrayList;
import java.util.List;

import mastermind.utils.Color;
import mastermind.utils.Properties;

public abstract class Combination {

	public static final int COMBINATION_SIZE = Properties.COMBINATION_SIZE;

	protected List<Color> colors = new ArrayList<>();

	protected List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		assert colors != null && colors.isEmpty();
		this.colors = colors;
	}
}
