package mastermind.models;

import mastermind.utils.Result;

public class Attempt {

	private final ProposedCombination proposedCombination;
	private final SecretCombination secretCombination;
	private Result result; 

	public Attempt(ProposedCombination proposedCombination, SecretCombination secretCombination) {
		this.proposedCombination = proposedCombination;
		this.secretCombination = secretCombination;
	}

	public boolean isWinnerAttempt() {
		return secretCombination.isCorrectCombination(proposedCombination);
	}
	
	public Result getResult() {
		this.result = secretCombination.getComparationResult(proposedCombination);
		return this.result;
	}

	public int getWhites() {
		return this.result.getWhites();
	}

	public int getBlacks() {
		return this.result.getBlacks();
	}

	public String getProposedCombinationCode() {
		return proposedCombination.toString();
	}
}
