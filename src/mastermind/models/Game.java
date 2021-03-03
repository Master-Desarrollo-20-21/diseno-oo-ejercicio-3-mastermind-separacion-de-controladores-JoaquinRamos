package mastermind.models;

import java.util.ArrayList;
import java.util.List;
import mastermind.utils.Properties;

public class Game {

	private SecretCombination secretCombination;
	private Attempt currentAttempt;
	private List<Attempt> playedAttempts;

	public void playCombination(ProposedCombination proposedCombination) {
		currentAttempt = new Attempt(proposedCombination, secretCombination);
		playedAttempts.add(currentAttempt);
	}

	public boolean isContinuePlaying() {
		return playedAttempts.size() <= Properties.MAX_ATTEMPS && !currentAttempt.isWinnerAttempt();
	}

	public boolean isWinnerGame() {
		return currentAttempt.isWinnerAttempt();
	}

	public int getAttemptsCount() {
		return playedAttempts.size();
	}

	public List<Attempt> getPlayedAttempts() {
		return playedAttempts;
	}

	public void init() {
		this.playedAttempts = new ArrayList<>();
		this.currentAttempt = null;
		this.secretCombination = new SecretCombination();
	}

	public SecretCombination getSecretCombination() {
		return secretCombination;
	}
}
