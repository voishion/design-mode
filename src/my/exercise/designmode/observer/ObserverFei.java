package my.exercise.designmode.observer;

public class ObserverFei implements Observer {

	private String name;
	
	public ObserverFei(String name) {
		this.name = name;
	}

	@Override
	public void update(Subject o) {
		MySubject mySubject = (MySubject)o;
		System.out.println("update " + this.name + " " + mySubject.getData());
	}

}
