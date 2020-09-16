package my.exercise.designmode.command;

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void action(){
		command.excutor();
	}
	
}
