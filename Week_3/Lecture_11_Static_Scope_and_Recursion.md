# Static Scope Rule and Recursion in Java

## **Static Scope Rule**

The lecture focuses on the concept of the static scope rule in Java programming, emphasizing the importance of scoping in programming languages.

- **Scope Rules Overview:**
    - Scope rules dictate how variables and methods are accessible in different parts of the program.
    - Two main types of scope rules: static scope (lexical scope) and dynamic scope.
- **Static Scope Rule:**
    - In Java, static scope is employed.
    - Both instance variables and methods have scopes.
    - **Example: Class `Box`:**
        - Class **`Box`** with members **`x`**, **`y`**, and method **`area()`**.
        - Scope of **`x`** and **`y`** is within the **`Box`** class only.
        - Objects of **`Box`** class access members using **`b.x`**, **`b.area()`**.
    - **Example: Class `Circle`:**
        - Class **`Circle`** with members **`x`**, **`y`**, and method **`area()`**.
        - **`x`** and **`y`** have scope within the **`Circle`** class.
        - Objects access members using **`c.x`**, **`c.area()`**.
- **Static Scope Resolution:**
    - Static scope resolution is achieved by specifying object names.
    - e.g., **`b.x`**, **`c.area()`**.
    - This method of resolution is known as static scope.
- **Class Variables and Instance Variables:**
    - Class variables: Shared among all instances of a class.
    - Instance variables: Unique to each instance of a class.
    - Using the **`static`** keyword declares a class variable.
- **Static Methods:**
    - Declared with the **`static`** keyword.
    - Can be called without creating an object of the class.
    - Class methods have only one instance shared across all objects.
- **Nested Classes:**
    - Classes defined within other classes.
    - Often used for encapsulation and information hiding.
    - Nested classes can't be accessed outside the containing class.

## **Recursion in Java**

The lecture also delves into the concept of recursion and how it can be applied to solve problems in Java.

- **Recursion Overview:**
    - Recursion is a technique where a function calls itself to solve smaller instances of the problem.
    - Requires a base case to terminate the recursion.
- **Factorial Calculation:**
    - Recursive calculation of factorial.
    - Factorial of n: **`n! = n * (n-1)!`**.
    - Base case: **`0! = 1`**.
- **Fibonacci Series:**
    - A series where each number is the sum of the two preceding ones.
    - Recursive formula: **`F(n) = F(n-1) + F(n-2)`**.
    - Base cases: **`F(0) = 0`** and **`F(1) = 1`**.
- **Greatest Common Divisor (GCD) Calculation:**
    - Recursive calculation of GCD using Euclidean algorithm.
    - Recursive formula: **`GCD(a, b) = GCD(b, a % b)`**.
    - Base case: When **`b`** becomes 0, **`a`** is the GCD.
- **Infinite Recursion:**
    - Code example of infinite recursion.
    - Recursion without a base case leads to stack overflow errors.

## **Conclusion**

The lecture covered the importance of static scope rules in Java, demonstrating how scoping works for variables and methods. It also introduced recursion as a powerful technique for solving problems in a concise and elegant manner. Recursion was exemplified through the calculation of factorials, Fibonacci series, and the GCD. The lecture also warned about potential pitfalls, such as infinite recursion. The next topics to be covered include information hiding and the development of larger Java programs.