package Week_1.Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) { // Check if the number is armstrong number or not.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        int temp = 0, original = n;
        while (n > 0) {
            int digit = n % 10;
            temp += digit * digit * digit;
            n /= 10;
        }
        result = temp == original ? 1 : 0;
        System.out.print(result);
    }
}
