package my.exercise.designmode.observer;

public interface Subject {

	/*增加观察者*/
	public void add(Observer observer);
	/*删除观察者*/
	public void del(Observer observer);
	/*通知所有的观察者*/
	public void notifyObserver();
	/*自身的操作*/
	public void operation(Object o);
}
