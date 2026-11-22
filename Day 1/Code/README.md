# ☕ Java Backend Development Journey

> "A journey of a thousand miles begins with a single step." — Tracking my progress in mastering Java for backend development.

## 📖 About This Project
This repository documents my learning journey in Java programming, starting from the absolute basics and progressing towards building robust backend applications. Each day's concepts, notes, and practical exercises are logged here to track my growth and share my learning process.

---

## 📅 Day 1: Java Fundamentals & Variables

### 🧠 Concepts Learned

#### 1. The Java Ecosystem
Understanding the core components that make Java work:

* **🛠️ JDK (Java Development Kit):** Used to develop Java applications. Contains essential development tools such as the Java compiler (`javac`).
* **⚙️ JRE (Java Runtime Environment):** Provides the environment and libraries required to run Java applications. Traditionally includes the JVM.
* **🖥️ JVM (Java Virtual Machine):** Executes Java bytecode. It is the magic behind Java's platform independence, helping Java programs run seamlessly on different operating systems.

#### 2. Java Variables & Data Types
Variables are containers used to store and manage data in a Java program. Today, I learned how to declare and use the following fundamental data types:

| Data Type | Description | Example |
| :--- | :--- | :--- |
| `int` | Stores whole numbers (integers). | `int age = 25;` |
| `String` | Stores text (sequences of characters). | `String name = "Java";` |
| `double` | Stores decimal numbers (floating-point). | `double salary = 75000.50;` |
| `boolean` | Stores logical values (`true` or `false`). | `boolean isActive = true;` |

### 🛠️ Practical Exercises

**1. Hello World!** 🌍
Created and executed my very first Java program: `HelloWorld.java`.

**2. Employee Information System** 👨‍💻
Practiced declaring variables and printing employee information to the console.

```java
public class EmployeeInfo {
    public static void main(String[] args) {
        // Declaring variables based on Day 1 concepts
        int employeeId = 1042;
        String employeeName = "John Doe";
        
        // Printing the information to the console
        System.out.println("--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}
