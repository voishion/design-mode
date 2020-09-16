package my.exercise.designmode.factory.simplefactory;

public class Factory {

	public Send oneSend(){
		return new OneSend();
	}
	public Send secendSend(){
		return new SecendSend();
	}
}
