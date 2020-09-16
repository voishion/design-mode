package my.exercise.designmode.adapter.interfaceadapter;

//应用场景
//当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可
public class Main {

	public static void main(String[] args) {

		SourceSub1 sub1 = new SourceSub1();
		SourceSub2 sub2 = new SourceSub2();
		sub1.method1();
		sub2.method2();
	}

}
