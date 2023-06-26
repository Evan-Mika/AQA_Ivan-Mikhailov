import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //Task 1 variant 1

        int[] num = new int[11];
        num[0] = 2;
        num[1] = 4;
        num[2] = 6;
        num[3] = 8;
        num[4] = 10;
        num[5] = 12;
        num[6] = 14;
        num[7] = 16;
        num[8] = 18;
        num[10] = 20;

        for (int i = 0; i <=10; i++) {
            System.out.print(num[i] + " ");
        }


        // Task 1 variant 2

            int[] num2 = new int[11];
            num2[0] = 2;
            num2[1] = 4;
            num2[2] = 6;
            num2[3] = 8;
            num2[4] = 10;
            num2[5] = 12;
            num2[6] = 14;
            num2[7] = 16;
            num2[8] = 18;
            num2[10] = 20;
            for (int i = 0; i <= num2.length - 1; i++) {
                System.out.println(num2[i]);
            }


        // Task 1 variant 3
        int[] num3 = new int[21];
        for(int i = 2; i < 21; i +=2) {
            num3[i] = i;
        }
        for(int i = 2; i < 21; i +=2)
        System.out.println(num3[i]);


        // Task 1 variant 4
        int[] num4 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < num4.length; i ++) {
            System.out.print(num4[i] + " ");
        }

        for (int i = 0; i <= num4.length - 1; i++) {
                System.out.println(num4[i]);
        }



        //Task 2 variant 2

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter counter`s start point");
        int from = userInput.nextInt();

        System.out.println("Enter counter`s end point");
        int to = userInput.nextInt();

        int count = 0;

        for (int i = from; i <= to; i ++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " odd number in array");

        int[] array = new int[count];
        for(int i = 0; i < array.length;i ++) {
            if (from % 2 != 0) {
                array[i] = from;
                from +=2;
           } else {
                from ++;
                array[i] = from;
                from +=2;
            }
        }
        for(int i = 0; i < array.length;i ++) {
            System.out.print(array[i] + " ");
        }
             System.out.println();

        for(int i = array.length -1; i > 0; i --) {
            System.out.println(array[i] + " ");
        }




    }
}

