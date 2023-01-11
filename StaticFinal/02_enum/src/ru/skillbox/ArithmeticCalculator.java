public class ArithmeticCalculator {
    public Operation operation;
    private int num1;
    private int num2;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculate(Operation operation) {
        operation = operation;

        switch(operation) {
            case ADD:
                System.out.println("Сумма: " + (getNum1() + getNum2()));
                break;
            case SUBTRACT:
                System.out.println("Деление: " + (getNum1() / getNum2()));
                break;
            case MULTIPLY:
                System.out.println("Умножение: " + (getNum1() * getNum2()));
                break;
        }
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
