package mastermind.views.console;

import static mastermind.utils.Messages.TITLE;

import mastermind.controllers.StartController;
import mastermind.utils.Console;

public class StartView {

	public void start(StartController startController) {
		startController.initGame();
		Console.getInstance().write(TITLE.getMessage());
		startController.next();
	}
}
