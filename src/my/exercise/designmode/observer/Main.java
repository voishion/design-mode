package my.exercise.designmode.observer;

//观察者模式很好理解，类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS图标，
//就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。其实，简单来讲就一句话：当一个
//对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
public class Main {

	public static void main(String[] args) {
		
		Subject mySubject = new MySubject();
		//Observable able = new Observable();  JDK自带的观察者工具类
		//able.hasChanged();
		//able.notifyObservers();
		//添加观察者
		mySubject.add(new ObserverFei("Alex"));
		mySubject.add(new ObserverFei("John"));
		//更改值
		mySubject.operation("Milk");

		
	}

}
