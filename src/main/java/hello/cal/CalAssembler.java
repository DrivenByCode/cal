package hello.cal;

public class CalAssembler { // 객체 생성 + 주입
    private final MyCalculator calculator;
    private final CalAdd calAdd;
    private final CalSub calSub;
    private final CalMul calMul;
    private final CalDiv calDiv;

    public CalAssembler(MyCalculator calculator, CalAdd calAdd, CalSub calSub, CalMul calMul, CalDiv calDiv) { // 객체 생성
        this.calculator = calculator;
        this.calAdd = calAdd;
        this.calSub = calSub;
        this.calMul = calMul;
        this.calDiv = calDiv;
    }

    public void assemble() { // 주입
        calculator.calculate(10, 5, calAdd);
        calculator.calculate(10, 5, calSub);
        calculator.calculate(10, 5, calMul);
        calculator.calculate(10, 5, calDiv);
    }
}
