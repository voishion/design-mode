package my.exercise.designmode.factory.simplefactory;

public class Main {
	public static void main(String[] args) {
		Factory f = new Factory();
		f.oneSend().send();
		f.secendSend().send();
	}
}
