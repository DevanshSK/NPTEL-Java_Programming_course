package Week_1.Exercises;

import java.util.Scanner;

public class Exercise5 { // Find average and maximum marks of a student.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        // define size of array
        s = input.nextInt();
        // The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Calculate Maximum and average;
        int total = 0;
        result = arr[0];
        for (i = 0; i < arr.length; i++) {
            total += arr[i];
            result = (arr[i] > result) ? arr[i] : result;
        }
        mark_avg = (double) (total) / s;

        System.out.print(result);
        System.out.print(mark_avg);

    }
}