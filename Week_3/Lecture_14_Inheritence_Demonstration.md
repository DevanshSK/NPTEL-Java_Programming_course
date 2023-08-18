# **Lecture Notes: Inheritance in Java - Recap and Examples**

In this lecture, we will have a quick recap and demonstration of the concepts covered in the previous module, which was based on inheritance in Java.

## **Overview**

- **Recap**: The last module covered inheritance in Java, which is a way to establish a relationship between classes, allowing one class to inherit properties and behaviors from another class.
- **Demo**: In today's demonstration, we will cover various aspects of inheritance, including:
    - Simple Inheritance
    - Multi-level Inheritance
    - Use of the **`super`** keyword
    - Method Overriding
    - Abstract Classes and Methods
    - Final Keyword

## **Simple Inheritance**

Let's start with a demonstration of simple inheritance. We'll create a superclass and a subclass to showcase how inheritance works.

```java
javaCopy code
class A {
    int i, j;

    void showIJ() {
        System.out.println("i: " + i + ", j: " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("Sum: " + (i + j + k));
    }
}

public class Demonstration_6_1 {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 1;
        superOb.j = 2;
        superOb.showIJ();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        subOb.showIJ();
        subOb.showK();
    }
}

```

## **Initialization of Subclass Objects Using Constructors**

We'll now demonstrate how to initialize subclass objects using constructors defined in the superclass.

```java
javaCopy code
class Box {
    double width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Calling superclass constructor
        weight = m;
    }
}

public class Demonstration_6_2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

        System.out.println("Volume of myBox1: " + myBox1.volume());
        System.out.println("Volume of myBox2: " + myBox2.volume());
    }
}

```

## **Using the `super` Keyword to Avoid Name Collision**

We'll now showcase how the **`super`** keyword can be used to avoid name collision between superclass and subclass variables.

```java
javaCopy code
class A {
    int i = 1;
}

class B extends A {
    int i = 2;

    void show() {
        System.out.println("i in B: " + i);
        System.out.println("i in A using super: " + super.i);
    }
}

public class Demonstration_6_5 {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.show();
    }
}

```

## **Dynamic Binding and Polymorphism**

We'll now demonstrate dynamic binding and polymorphism using methods that can be called based on the type of object.

```java
javaCopy code
class Cat {
    void speak() {
        System.out.println("Meow");
    }
}

class PetCat extends Cat {
    void speak() {
        System.out.println("Meow from PetCat");
    }
}

class MagicCat extends Cat {
    boolean noOne;

    void speaks() {
        if (noOne) {
            super.speak();
        } else {
            System.out.println("Hello, Cat");
        }
    }
}

public class Demonstration_6_6 {
    public static void main(String[] args) {
        PetCat c1 = new PetCat();
        MagicCat c2 = new MagicCat();
        c2.noOne = true;

        c1.speak();
        c2.speaks();
        c2.noOne = false;
        c2.speaks();
    }
}

```

## **Multi-level Inheritance**

Let's demonstrate multi-level inheritance where a subclass is derived from another subclass.

```java
javaCopy code
class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Calling superclass constructor
        weight = m;
    }
}

class Shipment extends BoxWeight {
    boolean noOne;

    Shipment(double w, double h, double d, double m, boolean n) {
        super(w, h, d, m); // Calling BoxWeight constructor
        noOne = n;
    }
}

public class Demonstration_6_7 {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, true);
        Shipment shipment2 = new Shipment(3, 6, 9, 12, false);

        System.out.println("Volume of shipment1: " + shipment1.volume());
        System.out.println("Volume of shipment2: " + shipment2.volume());
    }
}

```

## **Abstract Classes and Methods**

Let's explore abstract classes and methods, where an abstract class cannot be instantiated, and an abstract method needs to be overridden in the subclass.

```java
javaCopy code
abstract class Base {
    abstract void fun();
    void nonAbstract() {
        System.out.println("Non-abstract method in Base");
    }
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived's implementation of fun()");
    }
}

public class Demonstration_6_10 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
        d.nonAbstract();
    }
}

```

## **Using the `final` Keyword**

Lastly, let's see how the **`final`** keyword can prevent classes from being inherited and methods from being overridden.

```java
javaCopy code
final class Bike {
    // Class is declared as final, no inheritance allowed
}

// Trying to create a subclass of Bike
class Honda extends Bike {
    // Error: Cannot inherit from final Bike
}

public class Demonstration_6_11 {
    public static void main(String[] args) {
        // Creating objects and demonstrating final class usage
    }
}

```

I hope this recap and the examples provide a clear understanding of inheritance concepts in Java. If you have any questions or doubts, feel free to ask!