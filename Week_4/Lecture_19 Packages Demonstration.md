# **Lecture Notes: Java Packages and Access Control**

## **Introduction to Java Packages**

- A package is a crucial concept in Java.
- Packages help organize classes, interfaces, and other resources into a hierarchical structure.
- Packages provide namespace management, avoid naming conflicts, and enhance code readability.

## **Accessing API Packages**

- Java has built-in API packages, like **`java.lang`**, which contain fundamental classes.
- To access an API package, use the **`import`** statement followed by the package name.
- For example: **`import java.lang.*;`** imports all classes from the **`java.lang`** package.
- Static classes, like **`Math`**, can be accessed directly without creating an object.

## **Creating Custom Packages**

- You can create your own packages to organize your classes and resources.
- To create a package:
    1. Create a directory with the package name.
    2. Place the Java source files inside this directory.
    3. Use the **`package`** statement at the beginning of the source files.
- A package can contain multiple classes, but each class should be declared as **`public`**.

## **Access Protection in Packages**

- Java provides access modifiers (**`public`**, **`private`**, **`protected`**, and default) to control member visibility.
- Members declared as **`public`** are accessible from anywhere.
- Members declared as **`private`** are accessible only within the class.
- Members declared as **`protected`** are accessible within the class, its subclasses, and other classes in the same package.
- Members without access modifiers (default) are accessible within the same package only.

## **Inheritance and Packages**

- Inheritance allows a class to inherit the properties and methods of another class.
- A class in one package can inherit from a class in another package.
- Access modifiers play a role in inheritance:
    - **`public`** members of the superclass are inherited and accessible.
    - **`protected`** members are inherited and accessible within the package and subclasses.
    - **`default`** members are inherited within the same package only.

## **Importing Multiple Classes**

- You can import multiple classes from the same package using the **`import`** statement followed by the class names.
- Using **`import package.*`** imports all classes from the specified package.

## **Fully Qualified Class Names**

- If two classes with the same name exist in different packages, use fully qualified class names to avoid conflicts.
- For example: **`myPackage1.myClass`** and **`myPackage2.myClass`**.

## **Conclusion**

- Packages are essential for organizing and managing Java code.
- Access modifiers control the visibility of members in different contexts.
- Inheritance allows classes to inherit properties and methods from other classes.
- Properly utilizing packages and access modifiers enhances code structure and maintainability.