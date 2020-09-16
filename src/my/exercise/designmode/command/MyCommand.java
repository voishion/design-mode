package my.exercise.designmode.command;

public class MyCommand implements Command {
	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void excutor() {

		receiver.action();
	}

}
