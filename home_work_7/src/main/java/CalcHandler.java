import java.util.Scanner;

public class CalcHandler {

public static int getInt() {
    System.out.println("Введите число:");
    return new Scanner(System.in).nextInt();
}

public static char getOperation() {
    System.out.println("Введите математическое действие");
    return new Scanner(System.in).next().charAt(0);
}

public static int calc(int num1, int num2, char operation) {
    int result = 0;
    switch (operation) {
        case '+' ->result = num1 + num2;
        case '-' ->result = num1 - num2;
        case '*' ->result = num1 * num2;
        case '/' ->result = num1 / num2;









    }






    return result;






}

















}


