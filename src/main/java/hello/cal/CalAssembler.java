package hello.cal;

public class CalAssembler { // 객체 생성 + 주입
    private final MyCalculator calculator;
    private final CalAdd calAdd;
    private final CalSub calSub;
    private final CalMul calMul;
    private final CalDiv calDiv;

    public CalAssembler() { // 객체 생성
        calculator = new MyCalculator();
        calAdd = new CalAdd();
        calSub = new CalSub();
        calMul = new CalMul();
        calDiv = new CalDiv();
    }

    public void assemble() { // 주입
        calculator.calculate(10, 5, calAdd);
        calculator.calculate(10, 5, calSub);
        calculator.calculate(10, 5, calMul);
        calculator.calculate(10, 5, calDiv);
    }
}
