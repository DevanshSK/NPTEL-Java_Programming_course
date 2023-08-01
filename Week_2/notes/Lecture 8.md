# **Lecture Notes - Encapsulation and Constructor Overloading**

## **Encapsulation**

- Encapsulation is an important object-oriented paradigm that helps in hiding the internal details of an object from the outside world.
- It allows us to group data and methods that operate on the data within a class, providing a clear interface for interacting with the object.
- In encapsulation, data members of a class are usually private, and methods are provided to access and modify the data (getters and setters).

### **Creating a Class**

- A class is a blueprint for creating objects with similar attributes and behaviors.
- Syntax to declare a class:

```java
javaCopy code
class ClassName {
    // Data members (attributes)
    type dataMember1;
    type dataMember2;

    // Methods (behaviors)
    returnType methodName(parameters) {
        // Method body
    }
}

```

### **Creating Objects and Accessing Members**

- An object is an instance of a class, and it holds the state and behavior defined in the class.
- To create an object, use the **`new`** operator with the class name:

```java
javaCopy code
ClassName objectName = new ClassName();

```

- Data members of an object are accessed using the object name followed by a dot and the member's name:

```java
javaCopy code
objectName.dataMember1 = value;

```

- Methods of an object are accessed similarly:

```java
javaCopy code
returnType result = objectName.methodName(parameters);

```

## **Constructor**

- A constructor is a special method that is automatically called when an object of a class is created.
- It is used to initialize the object's state or set default values for its data members.
- A constructor has the same name as the class and no return type (not even void).
- Constructor overloading allows multiple constructors with different parameter lists to be defined.

### **Default Constructor**

- If a class does not define any constructor, Java provides a default constructor with no arguments.
- The default constructor initializes data members to their default values (e.g., 0 for numeric types, null for objects, etc.).

### **Parameterized Constructor**

- A parameterized constructor is defined with one or more parameters, allowing objects to be initialized with specific values.
- Example:

```java
javaCopy code
class Circle {
    double x;
    double y;
    double r;

    Circle(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }
}

```

### **Constructor Overloading**

- Constructor overloading allows defining multiple constructors within a class with different parameter lists.
- This allows flexibility in initializing objects using different sets of parameters.
- Java can distinguish between constructors based on the number and types of arguments passed.
- Example:

```java
javaCopy code
class Circle {
    double x;
    double y;
    double r;

    Circle(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }

    Circle(double c) {
        x = 0.0;
        y = 0.0;
        r = c;
    }

    Circle(Circle c) {
        x = c.x;
        y = c.y;
        r = c.r;
    }
}

```

## **"this" Keyword**

- The **`this`** keyword refers to the current instance of the class.
- It can be used to refer to the current object's data members or methods, resolving namespace collisions.
- Example:

```java
javaCopy code
class Student {
    int rollNumber;
    String name;
    String course;
    float key;

    Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }
}

```

- **`this`** can also be used to call one constructor from another (constructor chaining).
- Example:

```java
javaCopy code
class A {
    A() {
        // Some initialization code
    }

    A(int x) {
        this(); // Call the default constructor first
        // Initialize with x
    }
}

```

Overall, encapsulation and constructor overloading provide flexibility and maintainability in Java programming by allowing objects to be created with different initializations and ensuring proper access control for data members.