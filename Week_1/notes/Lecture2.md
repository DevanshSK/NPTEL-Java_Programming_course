# **Lecture Notes: Introduction to Java Programming**

In this lecture, we learned about writing our own Java programs and how to execute them on our machines. The lecturer discussed the different steps involved in programming in Java and emphasized that it's not difficult to follow, even for beginners. The key points covered in this lecture are as follows:

## **Basic Structure of a Java Program**

A Java program is typically structured as follows:

```java
javaCopy code
import java.util.*;

public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

```

- Java programs begin with the **`import`** statement, which is used to include classes from the Java standard library.
- The **`main`** method is the entry point of the program, where the execution starts.
- The **`System.out.println()`** method is used to print a message to the console.

## **Differences between Java and C Programming**

The lecturer also explained the differences between programming in Java and C:

- In C, the program starts with **`#include`** and has a **`main()`** function, whereas, in Java, the program uses **`import`** and **`public static void main(String[] args)`**.
- Java is an object-oriented programming language, so programs involve defining classes and creating objects.
- Java is case-sensitive, meaning that the capitalization of identifiers matters, unlike C, where it doesn't.

## **Platform Independence in Java**

One of the significant advantages of Java is its platform independence:

- Java programs are compiled into bytecode (**`.class`** files) that target a virtual machine (JVM).
- The JVM interprets the bytecode and executes the program, making it possible to run the same program on different operating systems and architectures.
- This platform independence is achieved through the use of JVM and bytecode.

## **Object-Oriented Programming in Java**

Java is an object-oriented programming language, and to execute a Java program, an object needs to be created from a defined class:

```java
javaCopy code
public class HelloWorldApp {
    // Class definition
}

// To run the program, we need to execute it as an object.
// The name of the class is used to run the program.

```

## **Compiling and Executing Java Programs**

To compile a Java program, use the **`javac`** command followed by the name of the Java file:

```bash
bashCopy code
javac HelloWorldApp.java

```

If there are no errors, the program will be compiled successfully, and a **`.class`** file will be generated.

To execute the program, use the **`java`** command followed by the name of the class (without the **`.class`** extension):

```bash
bashCopy code
java HelloWorldApp

```

## **Differences between Java and C++**

There are several differences between Java and C++:

- Java is more suitable for developing internet and networking-related applications.
- Java has single inheritance and doesn't support multiple inheritances like C++.
- Operator overloading is allowed in C++, but not in Java.
- C++ allows pointer usage, while Java doesn't use pointers directly.

## **Conclusion**

The lecture provided an overview of Java programming, its basic structure, and its differences from C programming. It also discussed platform independence and the role of the JVM in executing Java bytecode. The advantages and differences between Java and C++ were highlighted, and the compilation and execution processes for Java programs were explained. The lecture also hinted at the possibilities of multi-class programs and how browsers can execute Java programs.