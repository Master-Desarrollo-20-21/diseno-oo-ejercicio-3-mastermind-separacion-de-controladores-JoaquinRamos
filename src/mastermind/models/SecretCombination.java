package mastermind.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import mastermind.utils.Color;
import mastermind.utils.Result;

public class SecretCombination extends Combination {

	public SecretCombination() {
		this.setColors(getRandomColors());
	}

	private List<Color> getRandomColors() {
		List<Color> colors = Arrays.asList(Color.values());
		Collections.shuffle(colors);
		return colors.subList(0, COMBINATION_SIZE);
	}

	public boolean isCorrectCombination(Combination proposedCombination) {
		return this.getColors().equals(proposedCombination.getColors());
	}

	public Result getComparationResult(Combination cp){
		assert colors!= null;
		assert cp!= null;

		int whites = 0;
		int blacks = 0;
		for (int i = 0; i < COMBINATION_SIZE; i++) {
			for (int j = 0; j < this.getColors().size(); j++) {
				if(cp.getColors().get(i) == colors.get(j)  ) {
					if (i==j) 
						blacks ++;
					else 
						whites ++;
				}
			}
		}
		return new Result(whites, blacks);
	}

	public String toString() {
		String secret = "";
		for (int i = 0; i < COMBINATION_SIZE; i++) {
			secret += this.colors.get(i).getColorKey();
		}
		return secret;
	}
}
