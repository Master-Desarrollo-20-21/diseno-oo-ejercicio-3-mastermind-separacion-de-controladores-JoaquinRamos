package mastermind.views;

import mastermind.controllers.Controller;
import mastermind.controllers.CombinationController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.graphics.GameView;
import mastermind.views.graphics.ResumeView;
import mastermind.views.graphics.StartView;

public class GraphicsView extends View {
	
	private final GameView gameView;
	private final ResumeView resumeView;
	private final StartView startView;

	public GraphicsView() {
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
