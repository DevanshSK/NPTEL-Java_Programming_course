# **Lecture Notes: Inheritance in Java**

## **Introduction to Inheritance**

In this lecture, we will discuss an essential object-oriented programming (OOP) concept called **Inheritance**. We'll cover the basic definition of inheritance, its implementation in Java, and its significance in building modular and reusable code.

### **Understanding Inheritance**

1. **Recap of Encapsulation**: Before diving into inheritance, let's briefly revisit **encapsulation**. Encapsulation involves bundling data and methods within a class to control access and improve code organization.
2. **What is Inheritance?**: Inheritance is a fundamental OOP principle that allows a new class to inherit properties and behaviors from an existing class. The existing class is referred to as the **superclass** or **base class**, and the new class is the **subclass** or **derived class**.
3. **Types of Inheritance**:
    - **Single Inheritance**: A subclass inherits from a single superclass.
    - **Multiple Inheritance**: A subclass inherits from multiple superclasses (not supported in Java).
    - **Multilevel Inheritance**: Subclasses can be derived from other subclasses, creating a hierarchy.
    - **Hybrid Inheritance**: A combination of multiple and multilevel inheritance (not supported in Java).
4. **IS-A Relationship**: Inheritance represents an "IS-A" relationship, where a subclass is a specialized version of its superclass. For example, a **Lion** IS-A **Animal**.

### **Inheritance in Java**

1. **Benefits of Inheritance**: In Java, inheritance serves multiple purposes, including code reusability, extensibility, and maintaining a clear class hierarchy.
2. **Defining Subclasses**: To create a subclass in Java, use the **`extends`** keyword followed by the superclass name. The subclass inherits the fields and methods of the superclass.
3. **Inherited Members**: Subclasses inherit non-private instance variables and methods from the superclass. They can also **override** methods to provide custom implementations.

### **Example: Inheriting from Point2D to Point3D**

Let's explore a simple example to better understand inheritance.

1. **Point2D Class**: We have a class **`Point2D`** representing a 2D point. It contains instance variables **`x`** and **`y`**, along with a **`display`** method.
2. **Point3D Class**: We create a subclass **`Point3D`** that inherits from **`Point2D`**. It adds a new instance variable **`z`** and overrides the **`display`** method to include the **`z`** coordinate.
3. **Method Overriding**: When a subclass defines a method with the same name and signature as its superclass, it's called method overriding. The subclass's version of the method is executed.

### **Types of Inheritance in Java**

1. **Single Inheritance**: A subclass inherits from a single superclass. For instance, a **`Car`** class can inherit from a **`Vehicle`** class.
2. **Multiple Inheritance (Not Supported in Java)**: A subclass inheriting from multiple superclasses can lead to ambiguity and complexity.
3. **Multilevel Inheritance**: A class can inherit from another class, creating a chain of subclasses.
4. **Hybrid Inheritance (Not Supported in Java)**: A combination of multiple and multilevel inheritance is complex and can lead to code maintenance challenges.

### **Using the `super` Keyword**

1. **Referencing Parent Class Members**: The **`super`** keyword helps in distinguishing between parent class and subclass members with the same names. It references variables and methods of the parent class.
2. **Invoking Parent Class Methods**: You can use **`super`** to call methods from the parent class. This is particularly useful when you want to call the overridden method of the parent class.
3. **Invoking Parent Class Constructor**: The **`super`** keyword is used to invoke the constructor of the parent class. It facilitates initializing parent class members in the subclass.

### **Dynamic Method Resolution and Runtime Polymorphism**

1. **Dynamic Method Resolution**: During runtime, the appropriate method to execute is dynamically determined based on the actual type of the object, enabling polymorphism.
2. **Runtime Polymorphism**: When a subclass object is referred to by a superclass reference, the method of the subclass will be executed, reflecting the actual object's behavior.

### **Abstract and Final Classes**

1. **Abstract Classes**: An abstract class is a blueprint that cannot be instantiated. It can have both abstract methods (without implementation) and concrete methods. Subclasses must provide implementations for abstract methods.
2. **Final Classes**: A final class cannot be extended; no subclasses can be created from it. Methods and variables can also be declared as **`final`**, preventing further modifications in subclasses.

## **Conclusion**

Inheritance is a crucial concept in OOP, enabling the creation of well-structured and reusable code. It establishes relationships between classes and promotes code organization. By understanding inheritance and related concepts, you'll be better equipped to design and implement sophisticated Java programs.