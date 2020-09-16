package my.exercise.designmode.factory.staticfactory;

public class Factory {

	public static Send oneSend(){
		return new OneSend();
	}
	public static Send secendSend(){
		return new SecendSend();
	}
}
