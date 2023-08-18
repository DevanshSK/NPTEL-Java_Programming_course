# Lecture Notes on **Java Programming**

## **Output and Input in Java**

In the last lecture, we learned about detailed aspects of Java Programming, including different return types and input/output operations. Today, we will focus on illustrating output and input in Java, as they are essential activities in any Java application.

### **Output in Java**

Output in Java can be displayed on the screen using the standard output. The common methods for output are **`println()`** and **`print()`**.

- **`println()`**: It prints the specified value and moves the cursor to the next line automatically.
- **`print()`**: It prints the specified value without moving the cursor to the next line.

Output can also be directed to other sources like files, network lines, or databases, which will be discussed later.

Let's see a demonstration of how **`println()`** and **`print()`** work:

```java
javaCopy code
public class DemonstrationFor41 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.print("3");
        System.out.print("4");
    }
}

```

Output:

```
Copy code
1
2
34

```

### **Formatting Output in Java**

Java provides the **`printf()`** method to format the output. It is similar to the **`printf()`** function in C programming. You can specify the format using format specifiers.

```java
javaCopy code
public class DemonstrationFor42 {
    public static void main(String[] args) {
        System.out.printf("This is a formatted number: %d%n", 42);
        System.out.printf("Value of PI: %.2f%n", Math.PI);
        System.out.printf("Floating point number: %.4f%n", 5.2);
        System.out.printf("Another floating point number: %.4f%n", 0.38);
    }
}

```

Output:

```yaml
yamlCopy code
This is a formatted number: 42
Value of PI: 3.14
Floating point number: 5.2000
Another floating point number: 0.3800

```

### **Command Line Input**

You can pass command line arguments while executing a Java program. The arguments are stored in the **`args`** array in the **`main()`** method.

```java
javaCopy code
public class DemonstrationFor43 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments found.");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}

```

Execution:

```
Copy code
java DemonstrationFor43 arg1 arg2 arg3

```

Output:

```
Copy code
arg1
arg2
arg3

```

### **Scanner Class for Input**

The **`Scanner`** class in the **`java.util`** package is used for reading input from the keyboard. It can read integers, floats, strings, and more.

```java
javaCopy code
import java.util.Scanner;

public class DemonstrationFor45 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scnr.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scnr.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        scnr.close();
    }
}

```

### **DataInputStream Class for Input**

The **`DataInputStream`** class in the **`java.io`** package is used for reading data from various input sources. It can read different data types like integers, floats, and strings.

```java
javaCopy code
import java.io.*;

public class DemonstrationFor46 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);

        System.out.print("Enter the principal amount: ");
        String tempString = in.readLine();
        float principal = Float.parseFloat(tempString);

        System.out.print("Enter the rate of interest: ");
        tempString = in.readLine();
        float rateOfInterest = Float.parseFloat(tempString);

        System.out.print("Enter the number of years: ");
        tempString = in.readLine();
        int numberOfYears = Integer.parseInt(tempString);

        float interest = (principal * rateOfInterest * numberOfYears) / 100;
        System.out.println("The total interest is: " + interest);

        in.close();
    }
}

```

Keep in mind that **`try-catch`** or **`throws`** is required when using **`DataInputStream`** to handle possible exceptions.

This concludes the lecture on Java Programming, focusing on output and input in Java. There are many other concepts and aspects to explore in Java, and we will continue discussing them in future lectures.