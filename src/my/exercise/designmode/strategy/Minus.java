package my.exercise.designmode.strategy;

public class Minus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculator(String exp) {
		int array[] = split(exp, "-");
		return array[0]-array[1];
	}

}
