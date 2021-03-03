package mastermind.controllers;

import mastermind.models.Attempt;
import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.SecretCombination;
import mastermind.models.State;
import mastermind.utils.Color;
import mastermind.utils.Error;

import java.util.ArrayList;
import java.util.List;

public class CombinationController extends Controller {

	public CombinationController(Game game, State state) {
		super(game, state);
	}

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public int getAttemptsCount() {
		return game.getAttemptsCount();
	}

	public List<Attempt> getPlayedAttempts() {
		return game.getPlayedAttempts();
	}

	public void playCombination(ProposedCombination proposedCombination) {
		game.playCombination(proposedCombination);
	}

	public boolean isContinuePlaying() {
		return game.isContinuePlaying();
	}

	public boolean isWinnerGame() {
		return game.isWinnerGame();
	}

	public Error checkIfValidProposedCombination(String proposedCombinationCode) {
		if (proposedCombinationCode.isBlank() || proposedCombinationCode.length() != ProposedCombination.COMBINATION_SIZE) {
			return Error.WRONG_LENGTH;
		}
		if (!isValidColors(proposedCombinationCode)) {
			return Error.WRONG_COLORS;
		}
		if (duplicateColors(proposedCombinationCode)) {
			return Error.DUPLICATE_COLORS;
		}
		return Error.NULL;
	}

	private boolean duplicateColors(String proposedCombination) {
		assert proposedCombination!=null;

		List<Character> uniqueColors = new ArrayList<>();
		for (char colorCode : proposedCombination.toCharArray()) {
			if (uniqueColors.contains(colorCode)) {
				return true;
			}
			uniqueColors.add(colorCode);
		}
		return false;
	}

	private boolean isValidColors(String proposedCombination) {
		assert proposedCombination!=null;

		for (char colorCode : proposedCombination.toCharArray()) {
			if (!Color.isValidColor(colorCode)) {
				return false;
			}
		}
		return true;
	}

	public void finish() {
		super.next();
	}

	public SecretCombination getSecretCombination() {
		return game.getSecretCombination();
	}

}
