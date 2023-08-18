# **Lecture Notes: Information Hiding in Java - Access Modifiers and Packages**

## **Introduction to Information Hiding**

In this module, we will explore the concept of Information Hiding in Java. Information hiding is a crucial and intriguing concept. We'll focus on the ways programmers can control access to class members (methods and fields) using access modifiers.

### **Access Modifiers**

Java provides a set of access modifiers to control the visibility of class members. These access modifiers determine which parts of a class are accessible from other classes and packages.

There are four main access modifiers in Java:

1. **Default (Package-Private):** When no access modifier is specified, the default access modifier is applied. Members with default access are accessible within the same package. No access is granted to members outside the package.
2. **Public:** Members declared as public are accessible from anywhere, including other classes, packages, and sub-classes.
3. **Protected:** Protected members are accessible within the same package and can also be accessed by subclasses, even if they are in different packages.
4. **Private:** Private members are only accessible within the class they are declared in. They are not accessible from outside the class, including subclasses and other packages.

## **Access Modifiers in Detail**

Let's delve into the specifics of each access modifier and understand how they work.

### **Default Access Modifier**

- If no access modifier is explicitly specified, the default access modifier is applied.
- Members with default access are accessible within the same package.
- If two classes are in the same package, they can access each other's default members.
- If two classes are in different packages, they cannot access each other's default members.

### **Public Access Modifier**

- Members declared as public are accessible from anywhere.
- They can be accessed by any class, regardless of the package they belong to.
- Public members are often used for methods that serve as entry points to a class.

### **Protected Access Modifier**

- Protected members are accessible within the same package.
- Subclasses, even those in different packages, can access protected members of their superclass.
- Protected members are often used to provide controlled access to subclass-specific functionality.

### **Private Access Modifier**

- Private members are only accessible within the class where they are declared.
- They are not accessible from outside the class, including subclasses and other packages.
- Private members ensure strict encapsulation and data hiding within the class.

## **Introduction to Packages**

In Java, packages are used to organize classes into namespaces, preventing naming conflicts and providing better modularization. A package is a collection of related classes, interfaces, and sub-packages.

### **Package Structure**

- Packages help avoid naming conflicts by grouping related classes together.
- A package has a hierarchical structure, similar to directories in a file system.
- Packages are used to manage access control, grouping classes with similar functionality, and organizing code.

### **Accessing Classes in Different Packages**

- Two classes with the same name can exist in different packages without conflict.
- To access a class from another package, you need to provide the fully qualified class name or import the class.
- Import statements simplify class references, allowing you to use short class names.

## **Conclusion**

In this lecture, we covered the concept of Information Hiding in Java through the use of access modifiers. These modifiers (default, public, protected, and private) help control the visibility of class members within and outside the class. Additionally, we introduced the concept of packages, which provide a way to organize and manage classes in Java. Packages play a vital role in preventing naming conflicts, improving code organization, and enhancing the reusability of code.