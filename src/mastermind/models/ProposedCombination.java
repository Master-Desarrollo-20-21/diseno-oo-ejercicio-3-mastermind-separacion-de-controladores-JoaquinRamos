package mastermind.models;

import mastermind.utils.Color;

public class ProposedCombination extends Combination {

	public ProposedCombination(char[] colors) {
		assert colors != null;
		for (char colorCode : colors) {
			this.getColors().add(Color.of(colorCode));
		}
	}

	public String toString() {
		StringBuilder colorCodes = new StringBuilder();
		for (Color color : super.getColors()) {
			colorCodes.append(color.getColorKey());
		}
		return colorCodes.toString();
	}

}