# **Lecture Notes: Java Programming Environment Setup and Basic Program Execution**

In this lecture, we learned about how to set up the Java programming environment and execute Java programs. Below are the key points discussed in the lecture:

## **Setting up Java Environment**

- Install JDK (Java Development Kit) version 8 or above.
- Set the **`JAVA_HOME`** environment variable to the installation path of JDK.
- Set the **`PATH`** environment variable to include the **`bin`** directory of JDK.

## **Creating a Project Directory**

- Create a directory to store all Java programs to be developed.

## **Writing and Compiling Java Programs**

- Java programs can be written in any text editor, like Notepad++.
- Save the Java program with the **`.java`** extension.
- Compile the Java program using the **`javac`** command, followed by the Java file's name.

## **Executing Java Programs**

- Run the Java program using the **`java`** command, followed by the class name (without the **`.class`** extension).

## **Basic Java Program Example**

```java
javaCopy code
// FirstJavaProgram.java
public class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Congratulations, your first Java program ran successfully!");
    }
}

```

## **Printing Output in Java**

- Output can be printed using **`System.out.println()`** statement.
- Double quotes inside the **`println()`** function enclose the message to be printed.

## **Initializing and Using Arrays**

- Arrays in Java can be initialized and used to store multiple elements of the same type.
- Use **`int[] arrayName = {element1, element2, ...};`** to initialize an integer array.
- Access array elements using index, e.g., **`arrayName[index]`**.

## **Java Array Example**

```java
javaCopy code
// TestArray.java
public class TestArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        float average = sum / a.length;
        System.out.println("\nAverage: " + average);
    }
}

```

## **Initializing and Printing 3D Arrays**

- 3D arrays can be declared and initialized in Java.
- Use nested for loops to initialize and print 3D arrays.

## **Java 3D Array Example**

```java
javaCopy code
// 3DArray.java
public class 3DArray {
    public static void main(String[] args) {
        int[][][] my3DArray = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    my3DArray[i][j][k] = i * j * k;
                    System.out.print(my3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

```

## **Applet Programming**

- Applets are small Java applications that run within web browsers.
- We will cover applet programming in the next lecture.

Note: Properly matching the class name with the file name (excluding the file extension) is essential for successful compilation and execution.