package hello.cal;

public class CalDiv implements ICalculator{
    @Override
    public int doOperation(int firstNum, int secondNum) {
        int result = 0;
        try {
            result = firstNum / secondNum;
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
        return result;
    }
}
