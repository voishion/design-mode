package my.exercise.designmode.chain;

public abstract class AbstractHandler {

	private Handler hadler;

	public Handler getHadler() {
		return hadler;
	}

	public void setHadler(Handler hadler) {
		this.hadler = hadler;
	}
	
	
}
