package my.exercise.designmode.proxy;

public class Proxy implements Sourceable{
	
	private Source source;

	public Proxy(Source source) {
		super();
		this.source = source;
	}


	@Override
	public void method() {
		System.out.println("before");
		source.method();
		System.out.println("after");
	}

}
