package my.exercise.designmode.observer;

public class MySubject extends AbstractSubject{
	private String data ;

	@Override
	public void operation(Object data) {
		this.data = data.toString();
		notifyObserver();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
