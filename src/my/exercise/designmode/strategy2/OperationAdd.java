package my.exercise.designmode.strategy2;

/**
 * @author lilu
 */
public class OperationAdd implements Strategy {

    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }

}
