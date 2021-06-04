package my.exercise.designmode.strategy2;

/**
 * @author lilu
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2){
        return strategy.operation(num1, num2);
    }

}
