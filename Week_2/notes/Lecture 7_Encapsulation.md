# **Lecture Notes: Encapsulation in Java**

Today's topic: **Encapsulation in Java**

- Encapsulation is an important object-oriented concept in Java.
- In object-oriented programming, the concept of a class is essential.
- A class is like a blueprint or template for an object.
- To describe an object, we need elements like fields, methods, constructors, blocks, nested classes, and interfaces.
- There are six different items that can be incorporated in a class:
    1. Fields (variables)
    2. Methods (functions)
    3. Constructors (for object initialization)
    4. Blocks (for initializing variables)
    5. Nested classes (class within a class)
    6. Interfaces (for defining method signatures)
- Fields and methods are the two most important components of any class.
- Fields are reference variables or primitive variables that store data.
- Methods are operations that manipulate the data in the fields.

### **Basic Structure of a Class**

A class in Java can be defined as follows:

```java
javaCopy code
class ClassName {
    // Fields (variables)
    // Methods (functions)
}

```

### **Example: Circle Class**

```java
javaCopy code
class Circle {
    float x; // Center's x-coordinate
    float y; // Center's y-coordinate
    float r; // Radius

    // Methods
    float circumference() {
        return 2 * 3.14 * r;
    }

    float area() {
        return 3.14 * r * r;
    }
}

```

### **Creating Objects**

- Objects are instances of a class.
- To create objects, use the **`new`** keyword followed by the class name and constructor (if required).

Example of creating an object of class Circle:

```java
javaCopy code
Circle c = new Circle();

```

### **Multiple Objects and Methods**

- Multiple objects of the same class can be created, each with its own set of fields.
- Objects can access the methods defined in their class.

Example of creating and using multiple objects:

```java
javaCopy code
Circle c1 = new Circle();
c1.x = 3.0;
c1.y = 4.0;
c1.r = 5.0;

Circle c2 = new Circle();
c2.x = -4.0;
c2.y = -8.0;
c2.r = 10.0;

float circumferenceC1 = c1.circumference();
float areaC2 = c2.area();

```

### **Multiple Classes in a Program**

- More than one class can be included in a Java program.
- There should be one class called the **main class** with the **`main`** method, which is the entry point of the program.

Example of using multiple classes in a program:

```java
javaCopy code
class Circle {
    // Class definition for Circle
}

class Box {
    // Class definition for Box
}

public class MulticlassDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Box b = new Box();
        // ... (rest of the code)
    }
}

```

### **Constructors**

- Constructors are special methods used to automatically initialize an object.
- The name of the constructor should be the same as the class name.
- Constructors do not have a return type.
- Multiple constructors can be defined in a class, allowing objects to be initialized in different ways.

Example of a constructor in the Circle class:

```java
javaCopy code
class Circle {
    float x;
    float y;
    float r;

    // Constructor
    Circle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // Other methods
}

```

### **Constructor Overloading**

- Constructor overloading allows creating multiple constructors with different parameters in the same class.
- This helps initialize objects in various ways.

Example of constructor overloading in the Circle class:

```java
javaCopy code
class Circle {
    float x;
    float y;
    float r;

    // Constructor with three parameters
    Circle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // Constructor with one parameter (radius)
    Circle(float r) {
        this(0, 0, r); // Calls the three-parameter constructor with default values
    }

    // Constructor with an object of the same class as a parameter
    Circle(Circle c) {
        this(c.x, c.y, c.r); // Calls the three-parameter constructor using values from another Circle object
    }

    // Default constructor without any parameters
    Circle() {
        this(0, 0, 1); // Calls the three-parameter constructor with default values
    }

    // Other methods
}

```

### **The `this` Keyword**

- The **`this`** keyword is used to refer to the current object.
- It is used to resolve name collisions between instance variables and method parameters.

Example of using the **`this`** keyword:

```java
javaCopy code
class Circle {
    float x;
    float y;
    float r;

    // Constructor with three parameters
    Circle(float x, float y, float r) {
        this.x = x; // Assign the parameter x to the instance variable x
        this.y = y; // Assign the parameter y to the instance variable y
        this.r = r; // Assign the parameter r to the instance variable r
    }

    // Other methods
}

```

Note: The examples provided here are pseudo-code and might not compile or run correctly. They are intended for illustrative purposes only.

### **Conclusion**

- Encapsulation is a fundamental concept in Java that allows us to define classes with fields and methods.
- Objects are instances of classes, and we can create multiple objects and manipulate their data using methods.
- Constructors are special methods used for object initialization.
- Constructor overloading allows us to create multiple constructors with different parameters to initialize objects in various ways.
- The **`this`** keyword is used to refer to the current object and resolve name collisions.