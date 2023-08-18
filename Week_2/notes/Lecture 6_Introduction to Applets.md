# **Lecture Notes: Introduction to Java Applet Programming**

In this lecture, we learned about Java Applet programming, a unique aspect of Java programming that allows for interactive and visually appealing applications to be run within a web browser.

## **1. Java Applet Introduction**

- Java Applet programming allows for the creation of interactive applications that can be embedded and executed within a web browser.
- Applets are enjoyable and fun due to their dynamic nature, making Java programming more exciting.

## **2. Writing the First Simple Java Applet**

- Applets require the **`java.applet.Applet`** and **`java.awt`** packages to be imported.
- The applet class must be named and extended with "Applet" (e.g., **`public class MyFirstApplet extends Applet`**).
- The **`paint()`** method is crucial for displaying content in the applet window.

### **Example: MyFirstApplet**

```java
javaCopy code
import java.applet.Applet;
import java.awt.Graphics;

public class MyFirstApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome", 150, 150);
    }
}

```

## **3. Embedding Java Applet using HTML**

- Applets are embedded into HTML files using the **`<applet>`** tag, specifying the class file name and applet size.
- Applets can be run using the applet viewer or within a web browser.

### **Example: HTML_21.html**

```html
htmlCopy code
<applet code="MyFirstApplet.class" width="300" height="300">
</applet>

```

## **4. Configuring Applet Properties**

- The **`init()`** method can be used to initialize applet properties, such as resizing and setting background color.
- The **`init()`** method is essential for setting up the applet before it is displayed.

### **Example: Setting Background Color**

```java
javaCopy code
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class MyAppletWithBackgroundColor extends Applet {
    public void init() {
        resize(300, 300);
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.drawString("Hello World", 150, 150);
    }
}

```

## **5. Passing Input to Applet**

- Applets cannot directly take input from the user or other sources.
- Input can be passed to an applet through parameters defined in the HTML file.

### **Example: Passing Input**

```java
javaCopy code
import java.applet.Applet;
import java.awt.Graphics;

public class MyAppletWithInput extends Applet {
    int x, y;
    String msg;

    public void init() {
        x = Integer.parseInt(getParameter("x_position"));
        y = Integer.parseInt(getParameter("y_position"));
        msg = getParameter("message");
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }
}

```

### **Example: HTML File (parameters for MyAppletWithInput)**

```html
htmlCopy code
<applet code="MyAppletWithInput.class" width="300" height="300">
  <param name="message" value="This is an example message" />
  <param name="x_position" value="50" />
  <param name="y_position" value="50" />
</applet>

```

## **6. Conclusion**

- Java Applet programming allows for creating interactive and visually appealing applications.
- Applets can be embedded into HTML files and run using the applet viewer or web browsers.
- Parameters defined in HTML can be used to pass input to applets.

Note: The examples provided in the lecture were meant for demonstration purposes and may not run correctly without actual Java and HTML files.