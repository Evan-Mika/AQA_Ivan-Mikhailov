package lesson_5;

import java.io.IOException;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


        System.out.println("Enter the number");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        System.out.println("result = " + result);


    }
}





