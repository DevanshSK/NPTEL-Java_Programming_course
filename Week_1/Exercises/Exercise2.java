package Week_1.Exercises;

import java.util.Scanner;

public class Exercise2 { // Find the greatest number among three numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        // Find the largest number of these three numbers
        if (a > b) {
            // A is greater then B
            result = b > c ? a : c;
        } else {
            // A is smaller then B
            result = a > c ? b : c;
        }
        System.out.print(result);
    }
}
