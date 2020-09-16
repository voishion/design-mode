package my.exercise.designmode.chain;

public class MyHandler extends AbstractHandler implements Handler {
	private String name;
	

	public MyHandler(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void operator() {
		System.out.println(name+"operator");
		if(getHadler()!=null){
			getHadler().operator();
		}
	}

}
