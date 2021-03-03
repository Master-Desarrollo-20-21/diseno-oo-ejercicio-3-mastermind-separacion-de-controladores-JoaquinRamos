package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ResumeController extends Controller {

	public ResumeController(Game game, State state) {
		super(game, state);
	}

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public void reset() {
		this.state.reset();
	}

	public void finish() {
		super.next();
	}
}
