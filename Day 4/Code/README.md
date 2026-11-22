# 🚀 Day 4 – Loops in Java

> **🎯 Learning Goal**  
> Understand loops in Java and learn how to execute statements repeatedly using `for`, `while`, and `do-while` loops, along with control flow statements like `break` and `continue`.

---

## 🔄 1. For Loop

Used when we know **exactly how many times** we want to execute a block of code.

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // Code to execute
}
```

## 🔁 2. While Loop

Used when we don't know exactly how many times a loop should execute. The condition is evaluated before executing the loop body.

**Syntax:**
```java
while (condition) {
    // Code to execute
}
```

## 🔂 3. Do-While Loop

Executes the code at least once because the condition is checked after the loop body executes.

**Syntax:**
```java
do {
    // Code to execute
} while (condition);
```

## 🛑 4. Break Statement

Terminates the entire loop immediately when the specified condition is satisfied.

**Example:**
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Loop stops completely when i equals 5
    }
    System.out.println(i);
}
// Output: 1 2 3 4
```

## ⏭️ 5. Continue Statement

Skips the current iteration and moves directly to the next iteration of the loop.

**Example:**
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skips printing 3
    }
    System.out.println(i);
}
// Output: 1 2 4 5
```

## 🪆 6. Nested Loops

A loop placed inside another loop.

* Outer loop: Controls rows.

* Inner loop: Controls columns or repeated operations within each row.

* Note: The inner loop completes all its iterations before the outer loop moves to its next iteration.

**Example:**
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

## 📊 Quick Reference Tables

### 📚 Difference Between Loops

| Loop Type | When to Use |
| :--- | :--- |
| **`for`** | Known number of iterations |
| **`while`** | Condition-based repetition (unknown iterations) |
| **`do-while`** | When the block must execute **at least once** |

<br>

### ⚡ Break vs. Continue

| Feature | `break` | `continue` |
| :--- | :--- | :--- |
| **Action** | Stops the **entire** loop | Skips the **current** iteration |
| **Result** | Exits the loop completely | Moves to the next iteration |


## 💻 Day 4 – Practical Exercises

Test your understanding by completing these coding challenges:

* Print multiplication tables.
  
* Find the factorial of a given number.
  
* Check whether a number is prime.
  
* Print number/star patterns (e.g., pyramids, diamonds).
  
* Practice nested loops with 2D arrays or matrices.

## 🧠 Key Takeaways
* Loops reduce repetitive code and make programs efficient.
  
* for loops are best for known iteration counts.
  
* while loops check the condition before execution.
  
* do-while loops guarantee execution at least once.
  
* break terminates the loop entirely.
  
* continue skips the rest of the current iteration.
  
* Nested loops are powerful for generating patterns and handling multidimensional data.
