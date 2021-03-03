package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class StartController extends Controller {

	public StartController(Game game, State state) {
		super(game, state);
	}

	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public void initGame() {
		game.init();
	}
}
