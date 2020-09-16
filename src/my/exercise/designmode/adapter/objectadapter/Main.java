 package my.exercise.designmode.adapter.objectadapter;
//应用场景
//当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
public class Main {

	public static void main(String[] args) {
		Adapter a = new Adapter(new Source());
		a.method1();
		a.method2();

	}

}
