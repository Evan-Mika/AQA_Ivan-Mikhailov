import java.util.Scanner;

public class Main {


     public static void main(String [] args) {


         // task 1
         double d = 2.54;
         d = 10 / d;
         System.out.println(d);
         double d1 = 2.54;
         d1 = d1 * 25;
         System.out.println(d1);


         // task 2
         int euro = 28;
         euro = 10000 / euro;
         System.out.println(euro);


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


         // task 6

         Scanner scanner = new Scanner(System.in);
         int x = scanner.nextInt();

         if (x > 0) {
             System.out.println("положительное");
         }
         if (x < 0) {
             System.out.println("отрицательное");
         }
         if (x == 0) {
             System.out.println("ноль"); }


         // task 7
         Scanner scanner = new Scanner(System.in);
         int x = scanner.nextInt();

         if (x <= 100) {
             int result = --x;
             System.out.println(result); }


         // task 8
         Scanner scanner = new Scanner(System.in);
         int a = scanner.nextInt();

         if (a > 9 && a < 100) {
             int ed = a % 10;
             int result = ed * (a / 10);
             System.out.println(result);
             if (a > result) {
                 System.out.println("a больше");
             } else {
                 System.out.println("a меньше"); }
         }
      }
    }
