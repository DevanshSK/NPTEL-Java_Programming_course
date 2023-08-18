# Lecture Notes on **Java Programming Insights**

## **Introduction to Java Programming**

In this lecture, we will learn some detailed concepts in Java programming. Java follows certain rules and guidelines that need to be followed when writing Java programs. These rules make it easier to understand different concepts in Java.

### **Main Method**

The main method in Java looks cryptic compared to the main method in C programming. The main method is the entry point of a Java program. It has several components:

```java
javaCopy code
public static void main(String[] args) {
    // Code goes here
}

```

- **`public`**: Access modifier indicating the main method is publicly accessible.
- **`static`**: Keyword that allows the main method to be called without creating an object.
- **`void`**: Return type, indicating the main method does not return any value.
- **`String[] args`**: Argument passed to the main method. It is an array of strings used to pass command-line arguments to the program.

### **Import Statements**

To use classes and methods defined in other packages, we need to use import statements. For example:

```java
javaCopy code
import java.lang.*;

```

Here, we import the **`java.lang`** package, which contains many mathematical calculations related to classes and methods.

### **Scanner Class**

The **`Scanner`** class is used to read input from the user during program execution. It is part of the **`java.util`** package and can be imported using:

```java
javaCopy code
import java.util.Scanner;

```

We can create a **`Scanner`** object to read different types of input, such as integers, floats, and strings, from the keyboard.

### **Data Input Stream**

The **`DataInputStream`** class, part of the **`java.io`** package, is another way to read input from the keyboard. It reads data from an input stream and interprets the data as different data types.

## **Examples**

### **Example 1: Command-line Input**

```java
javaCopy code
public class Echo {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}

```

Run the program with command-line arguments to print the given arguments.

### **Example 2: Reading Numbers Using Scanner Class**

```java
javaCopy code
import java.util.Scanner;

public class MaximumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.println("The larger number is: " + (num1 > num2 ? num1 : num2));

        scanner.close();
    }
}

```

This program reads two floating-point numbers from the keyboard and prints the larger number.

### **Example 3: Reading Numbers Using Data Input Stream**

```java
javaCopy code
import java.io.*;

public class InterestCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the principal amount: ");
        float principalAmount = Float.parseFloat(in.readLine());

        System.out.println("Enter the rate of interest: ");
        float rateOfInterest = Float.parseFloat(in.readLine());

        System.out.println("Enter the number of years: ");
        int numberOfYears = Integer.parseInt(in.readLine());

        float interest = (principalAmount * rateOfInterest * numberOfYears) / 100;

        System.out.println("Interest: " + interest);

        in.close();
    }
}

```

This program calculates the simple interest using the **`DataInputStream`** class to read inputs.

## **Conclusion**

Java programming involves various concepts, such as the main method, import statements, and reading input. By understanding these concepts, you can write Java programs effectively.