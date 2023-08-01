# **Lecture Notes - Introduction to Java Applet Programming**

## **Overview**

- Java applet programming is about creating small programs that run within a web browser.
- Applets are a type of Java program used for graphical user interface (GUI) development.
- There are two main types of Java programs: Java applications and Java applets.

## **Java Applet Programming Basics**

- Java applets are small programs written in Java but displayed within a web browser.
- Applets are used for creating graphical user interfaces and can include images, multimedia, text, etc.
- Applets use the **`java.applet`** and **`java.awt`** packages, which need to be imported using the **`import`** statement.

## **Creating a Simple Applet**

- To create a simple applet, we need to define a class that extends the **`java.applet.Applet`** class.
- The **`init()`** method is used to initialize the applet.
- The **`paint()`** method is used to draw graphics on the applet.

## **Running an Applet**

1. Save the applet program with the extension **`.java`**.
2. Compile the applet using the **`javac`** command.
3. Create an HTML file and embed the applet using the **`applet`** tag.
4. Use the **`appletviewer`** command to run the applet.

## **Applet Structure and Methods**

- Applets have a specific structure with predefined methods:
    - **`init()`**: Initializes the applet.
    - **`start()`**: Starts the execution of the applet.
    - **`stop()`**: Stops the execution of the applet.
    - **`destroy()`**: Removes the applet from memory.
    - **`paint(Graphics g)`**: Used to paint graphics on the applet.

## **Controlling Applet Size**

- The applet size can be controlled using the **`resize()`** method in the **`init()`** method.
- By calling **`resize(width, height)`**, the applet will be resized to the specified dimensions.

## **Passing Input to an Applet**

- Applets can receive input from the HTML file using the **`getParameter()`** method.
- Parameters are defined in the HTML file and can be accessed in the **`init()`** method.

## **Differences between Applets and Applications**

- Applets are embedded in HTML pages and run within web browsers, while applications run independently.
- Applets cannot directly receive input; all input must be passed through the HTML file.
- Applets cannot communicate with other applets, browsers, or other machines directly.
- Applets cannot run programs written in other languages or interface with other programming languages.

## **Conclusion**

- Java applet programming involves creating small programs that run in web browsers.
- Applets are used for graphical user interface development and have some differences compared to Java applications.
- Applets can be controlled in terms of size and can receive input through HTML parameters.