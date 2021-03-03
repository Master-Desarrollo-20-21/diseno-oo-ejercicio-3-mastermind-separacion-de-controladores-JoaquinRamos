package mastermind.views.console;

import mastermind.controllers.CombinationController;
import mastermind.models.Attempt;
import mastermind.models.ProposedCombination;
import mastermind.utils.Console;
import mastermind.utils.Messages;

public class GameView {

	private final CombinationsView combinationsView;

	public GameView() {
		this.combinationsView = new CombinationsView();
	}

	public void interact(CombinationController combinationController) {
		do {
			Console.getInstance().writeln(String.format(Messages.ATTEMPTS_COUNT.getMessage(), combinationController.getAttemptsCount()));
			Console.getInstance().writeln(Messages.SECRET_COMBINATION_HIDDEN.getMessage());
			for (Attempt attempt : combinationController.getPlayedAttempts()) {
				attempt.getResult();
				Console.getInstance().writeln(String.format(Messages.ATTEMPT.getMessage(), attempt.getProposedCombinationCode(), attempt.getWhites(), attempt.getBlacks()));
			}
			ProposedCombination proposedCombination = combinationsView.readProposedCombination(combinationController);
			combinationController.playCombination(proposedCombination);
		} while (combinationController.isContinuePlaying());
		combinationController.finish();
		if (combinationController.isWinnerGame()) {
			Console.getInstance().writeln(Messages.WIN_MESSAGE.getMessage());
		} else {
			Console.getInstance().writeln(Messages.LOST_MESSAGE.getMessage());
			Console.getInstance().writeln(String.format(Messages.SECRET_COMBINATION.getMessage(), combinationController.getSecretCombination().toString()));
		}
	}
}