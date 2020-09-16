package my.exercise.designmode.factory.abstractfactory;

public class OneFactory implements Factory {

	@Override
	public Send getSend() {
		// TODO Auto-generated method stub
		return new OneSend();
	}

}
