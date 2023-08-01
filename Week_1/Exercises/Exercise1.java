package Week_1.Exercises;

import java.util.Scanner;

public class Exercise1 { // Find perimeter and Area of a circle
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;

        // Perimeter
        if (radius <= 0) {
            System.out.println(" please enter non zero positive number ");
            return;
        }
        perimeter = Math.PI * 2 * radius;
        System.out.println("perimeter = " + perimeter);
        area = Math.PI * radius * radius;
        System.out.println("area = " + area);
    }
}