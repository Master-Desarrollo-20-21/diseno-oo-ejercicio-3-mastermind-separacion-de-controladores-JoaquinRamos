package mastermind.views.console;

import static mastermind.utils.Messages.PROPOSE_COMBINATION;

import mastermind.controllers.CombinationController;
import mastermind.models.ProposedCombination;
import mastermind.utils.Console;
import mastermind.utils.Error;
import mastermind.views.ErrorView;

public class CombinationsView {

	public ProposedCombination readProposedCombination(CombinationController combinationController) {
		String proposedCombinationCode = "";
		Error error;
		do {
			proposedCombinationCode = Console.getInstance().readString(PROPOSE_COMBINATION.getMessage());
			Console.getInstance().writeln();
			Console.getInstance().writeln();
			error = combinationController.checkIfValidProposedCombination(proposedCombinationCode);
			ErrorView.of(error).writeln();
		} while (!error.isNull());
		return new ProposedCombination(proposedCombinationCode.toCharArray());
	}
}
