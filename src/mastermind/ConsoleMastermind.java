package mastermind;

import mastermind.views.ConsoleView;
import mastermind.views.View;

class ConsoleMastermind extends Mastermind {

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

	protected View createView() {
		return new ConsoleView();
	}
}