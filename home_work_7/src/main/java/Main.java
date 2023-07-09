public class Main {
    public static void main(String[]args) {
        int number1 = CalcHandler.getInt();
        char mathOperator = CalcHandler.getOperation();
        int number2 = CalcHandler.getInt();


        int result = CalcHandler.calc(number1, number2, mathOperator);
        System.out.println("Результат вычеслений: " + result);
    }
}
