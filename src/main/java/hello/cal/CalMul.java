package hello.cal;

public class CalMul implements ICalculator{
    @Override
    public int doOperation(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}
