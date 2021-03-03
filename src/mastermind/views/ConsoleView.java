package mastermind.views;

import mastermind.controllers.Controller;
import mastermind.controllers.CombinationController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.console.GameView;
import mastermind.views.console.ResumeView;
import mastermind.views.console.StartView;

public class ConsoleView extends View {

	private final GameView gameView;
	private final ResumeView resumeView;
	private final StartView startView;

	public ConsoleView() {
		this.gameView = new GameView();
		this.resumeView = new ResumeView();
		this.startView = new StartView();
	}

	public void interact(Controller controller) {
		controller.accept(this);
	}

	public void visit(StartController startController) {
		startView.start(startController);
	}

	public void visit(CombinationController combinationController) {
		gameView.interact(combinationController);
	}

	public void visit(ResumeController resumeController) {
		resumeView.interact(resumeController);
	}
}
