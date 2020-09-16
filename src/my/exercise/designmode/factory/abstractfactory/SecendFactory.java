package my.exercise.designmode.factory.abstractfactory;

public class SecendFactory implements Factory{

	@Override
	public Send getSend() {
		// TODO Auto-generated method stub
		return new SecendSend();
	}

}
