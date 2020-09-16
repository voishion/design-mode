package my.exercise.designmode.decorator;
//装饰类
//和对象适配器模式有点相似，区别在于接口只有一个方法,装饰类的对象为接口，只是在传进来时是被装饰类
//装饰类对被装饰类source方法前后加上处理
public class Decorator implements Sourceable{

	private Sourceable sourceable;
	
	public Decorator(Sourceable sourceable) {
		super();
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		System.out.println("decorator before");
		sourceable.method();
		System.out.println("decorator after");
	}

}
