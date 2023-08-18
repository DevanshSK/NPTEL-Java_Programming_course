# **Lecture Notes: Packages and Access Protection in Java**

## **Overview**

In this lecture, we delve into the concepts of packages in Java. We've already introduced the idea of packages and their use in the previous module. Now, we'll explore more details about Java packages, including how to access them, how access specifications work, and how to handle the specification of package locations. We'll also touch on the importance of access protection within packages and discuss examples to illustrate these concepts.

## **Package Access and Location**

- Packages in Java are used to organize and manage classes, preventing naming conflicts and improving code organization.
- API packages are available in the Java JDK, and users can create their own packages for better code management.
- Access to packages is determined by the classpath, which specifies the location of packages.
- Three ways to specify package locations:
    1. Default: Packages are assumed to be under the working directory of the program.
    2. Setting classpath environment variable: Specify the root directories where packages are located.
    3. Explicitly mention package location: Use import statements with full package paths.

## **Access Protection in Packages**

- Access specifiers (public, private, protected, default) control access to members within classes and packages.
- Access protection is significant for interplay between classes within a package and across different packages.
- Four categories of visibility:
    1. Subclasses in the same package.
    2. Non-subclasses in the same package.
    3. Subclasses in a different package.
    4. Non-subclasses in a different package.
- Access rules differ based on access specifiers and whether classes are subclasses or not.

### **Table of Visibility for Different Categories:**

| Visibility Category | Same Class | Same Package Subclass | Same Package Non-Subclass | Different Package Subclass | Different Package Non-Subclass |
| --- | --- | --- | --- | --- | --- |
| Private | Yes | No | No | No | No |
| Default (No Modifier) | Yes | Yes | Yes | No | No |
| Protected | Yes | Yes | Yes | Yes | No |
| Public | Yes | Yes | Yes | Yes | Yes |

## **Examples Illustrating Access Protection**

### **Example: Class X (MyPackage1)**

- Contains members: n (default), p (private), q (protected), r (public).
- Access within the class is straightforward.
- Access within subclasses in the same package depends on access specifiers.

### **Example: Class Y (MyPackage1)**

- Subclass of class X.
- Accesses members of class X using constructors.
- Demonstrates access protection rules in the context of subclasses.

### **Example: Class A (MyPackage1)**

- Accesses members of class X using constructors.
- Interacts with class X and demonstrates different access protection scenarios.

### **Example: Class Z (MyPackage2)**

- Not a subclass of class X.
- Demonstrates how access protection works for non-subclasses in different packages.

### **Example: Class B (MyPackage2)**

- Creates an object of class X.
- Shows how access protection works for different access specifiers in different packages.

## **Conclusion**

This lecture provided an in-depth exploration of Java packages, their access control mechanisms, and access protection rules within and between packages. Understanding these concepts is crucial for designing well-structured, organized, and maintainable Java programs. In the next module, we'll delve into the concepts of multiple inheritances and polymorphism, and how they can be achieved using Java interfaces.