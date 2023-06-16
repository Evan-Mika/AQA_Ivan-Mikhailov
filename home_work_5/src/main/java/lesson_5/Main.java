package lesson_5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //task1
        for (int i = 1000; i <= 9999; i = i + 3) {
            System.out.println(i);
        }

        //task2
        for (int i = 10; i > 0; i = i - 4) {
            System.out.println(i + " ");
        }


        //task4 (незавершенная и наверно с неправильной логикой)
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        int answer = userInput.nextInt();
        if (number > 10 && number > 100) {
            int ed = number % 10;
            int des = number / 10;
            int sum = des + ed;
            System.out.print(sum);

        }
    }
}
