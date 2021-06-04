package my.exercise.designmode.strategy2;

/**
 * @author lilu
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.execute(10, 5));
    }

}
