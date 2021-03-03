package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ExitController extends Controller {

	public ExitController(Game game, State state) {
		super(game, state);
	}

	public void accept(ControllerVisitor controllerVisitor) {

	}
}
