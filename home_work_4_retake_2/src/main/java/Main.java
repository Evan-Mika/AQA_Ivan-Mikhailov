import java.util.Scanner;

public class Main {


     public static void main(String [] args) {
            // task 3
            Scanner userInput = new Scanner(System.in);
            int x = userInput.nextInt();

            if (x > 9 && x < 100) {
                int ed = x % 10;
                int des = x / 10;
                System.out.print(ed + " " + des);
            }

            // task 4

            Scanner userInput = new Scanner(System.in);
            int x = userInput.nextInt();

            if (x > 9 && x < 100) {

                int ed = x % 10;
                int des = x - ed;
                System.out.print(des + " + " + ed);

            }

            // task 5

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();

            if (x > 9 && x < 100) {
                int ed = x % 10;
                int weight = ed + (x / 10);
                System.out.println(weight);
            }
        }
    }
