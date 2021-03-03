package mastermind.controllers;

public interface ControllerVisitor {

	void visit(StartController startController);

	void visit(CombinationController combinationController);

	void visit(ResumeController resumeController);
}
