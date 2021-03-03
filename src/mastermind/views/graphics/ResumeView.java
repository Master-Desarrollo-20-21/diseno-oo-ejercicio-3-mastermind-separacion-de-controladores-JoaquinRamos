package mastermind.views.graphics;

import mastermind.controllers.ResumeController;
import mastermind.utils.Console;
import mastermind.utils.Dialog;
import mastermind.utils.Messages;

public class ResumeView {

	public void interact(ResumeController resumeController) {
		if (new Dialog(Messages.RESUME.getMessage()).read()) {
			resumeController.reset();
		} else {
			resumeController.finish();
			Console.getInstance().writeln(Messages.BYEBYE.getMessage());
		}
	}
}