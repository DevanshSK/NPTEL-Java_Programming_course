package Week_1.Exercises;

import java.util.Scanner;

public class Exercise3 { // Find the sum of even numbers that are divisible by 3 upto n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int digit = 2 * i;
            sum = (digit % 3 == 0) ? sum + digit : sum;
        }
        System.out.print(sum);
    }

}
