# **Lecture Notes: Access Modifiers and Method Overriding in Java**

## **Introduction**

- **Information Hiding** is a crucial aspect of object-oriented programming.
- **Access modifiers** define the visibility and accessibility of classes, members, and methods in Java programs.
- Java supports four access modifiers: **default**, **public**, **private**, and **protected**.
- This lecture focuses on understanding and demonstrating the concepts of access modifiers and method overriding in Java.

## **Access Modifiers Overview**

- Access modifiers control the visibility of classes, members, and methods.
- Four access modifiers: **default**, **public**, **private**, and **protected**.
- **Default (package-private)**: No explicit access modifier; accessible within the same package.
- **Public**: Accessible from anywhere, within or outside the package.
- **Private**: Accessible only within the class.
- **Protected**: Accessible within the same package and subclasses.

## **Default Access Modifier**

- Default access modifier is applied if no access modifier is specified.
- A class with no access modifier is treated as **default class**.
- Members of a default class are accessible within the same package.
- Demonstration of default access modifier and method usage within the same file.

## **Separate Files for Classes**

- Best practice to maintain separate files for different classes.
- Class A stored in a file named **`A.java`**, while main class is in a different file.
- Access to default members works within the same package and directory.

## **Accessing Default Members from Different Directories**

- Attempting to access default members from different directories.
- Result: Compilation error, default members are not accessible outside the package.

## **Public Access Modifier**

- Public access modifier allows access from anywhere.
- Demonstration of public access modifier and method usage within the same file.

## **Private Access Modifier**

- Private access modifier restricts access to within the class.
- Attempting to access private members from outside the class results in a compilation error.

## **Protected Access Modifier**

- Protected access modifier allows access within the same package and subclasses.
- Demonstrating protected access modifier within the same package and inheritance.

## **Method Overriding and Access Modifiers**

- Method overriding involves subclass providing a specific implementation for a method defined in the superclass.
- Overriding method must have equal or less restrictive access modifier compared to the method being overridden.
- Protected method in a subclass can override a protected method in the superclass.

## **Method Overriding Example**

- Defining a base class with methods of different access modifiers.
- Demonstrating method overriding for public, private, and protected methods in a subclass.
- Highlighting the rules for overriding based on access modifiers.

## **Conclusion**

- Access modifiers are vital for controlling access to classes and their members.
- Proper understanding of access modifiers is crucial for creating maintainable and secure programs.
- Access modifiers are checked at compilation time to ensure proper encapsulation and accessibility.

Overall, this lecture provides a comprehensive overview of access modifiers and their impact on class and method visibility, along with practical demonstrations of various scenarios.