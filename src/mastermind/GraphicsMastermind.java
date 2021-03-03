package mastermind;

import mastermind.views.GraphicsView;
import mastermind.views.View;

public class GraphicsMastermind extends Mastermind {

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

	protected View createView() {
		return new GraphicsView();
	}
}