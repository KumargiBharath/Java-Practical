# ☕ Java Backend Development Journey

> "A journey of a thousand miles begins with a single step." — Tracking my progress in mastering Java for backend development.

## 📖 About This Project
This repository documents my learning journey in Java programming, starting from the absolute basics and progressing towards building robust backend applications. Each day's concepts, notes, and practical exercises are logged here to track my growth and share my learning process.

**🎯 Ultimate Goal:** Become a Java Backend Developer.

---

## 📅 Day 2: Data Types, Casting, and Operators

### 🧠 Concepts Learned

#### 1. Data Types in Java
Data types define the kind of data a variable can hold. Java categorizes them into two main types:

**🟦 Primitive Data Types** (8 types)  
Used to store basic, single values in memory.

| Data Type | Description | Example |
| :--- | :--- | :--- |
| `byte` | Stores small whole numbers | `byte b = 100;` |
| `short` | Stores short integer values | `short s = 10000;` |
| `int` | Stores whole numbers | `int i = 100000;` |
| `long` | Stores large whole numbers | `long l = 100000L;` |
| `float` | Stores decimal numbers | `float f = 5.75f;` |
| `double` | Stores precise decimal numbers | `double d = 19.99;` |
| `char` | Stores a single character | `char c = 'A';` |
| `boolean`| Stores `true` or `false` values | `boolean isJavaFun = true;` |

**🟩 Non-Primitive Data Types**  
Used to store references to objects. They can have methods and additional functionality.
* **Examples:** `String`, Arrays, Classes, Objects.

---

## 2. Type Casting
Type casting is the process of converting one data type into another.

* **📈 Widening Casting (Automatic):**
  Converts a smaller data type into a larger data type. Done automatically by Java.
  ```java
  int myInt = 10;
  double myDouble = myInt; // Automatic casting: int to double
  ```
* **📉 Narrowing Casting (Manual):**
Converts a larger data type into a smaller data type. Requires explicit casting.

```java
double myDouble = 10.5;
int myInt = (int) myDouble; // Manual casting: double to int (result is 10)
```

| Category   | Operators             | Name / Description                                                                 |
| :--------- | :-------------------- | :--------------------------------------------------------------------------------- |
| **Arithmetic** | `` `+` `-` `*` `/` `%` `` | Addition, Subtraction, Multiplication, Division, Modulus (Remainder)               |
| **Assignment** | `` `=` `+=` `-=` `*=` `/=` `%=` `` | Assign value, Add & assign, Subtract & assign, Multiply & assign, etc.             |
| **Relational** | `` `==` `!=` `>` `<` `>=` `<=` `` | Equal to, Not equal to, Greater/Less than, Greater/Less than or equal to. *(Returns boolean)* |
| **Logical**    |         | Logical AND, Logical OR, Logical NOT. *(Used to combine conditions)*               |

#### 🛠️ Practical Exercises
Today, I applied the concepts by building the following programs:
* 🧮 Simple Calculator: Used arithmetic operators to perform basic math.
* 💰 Employee Salary Calculator: Calculated gross/net pay using variables and math.
* 📊 Monthly Expenses Calculator: Tracked and summed up daily expenses.


#### 🏆 Today's Achievements
* Learned primitive and non-primitive data types.
* Understood widening and narrowing type casting.
* Practised arithmetic operators.
* Practised relational operators.
* Understood logical operators.
* Practised assignment operators.
* Applied operators in practical Java programs.
#### 🔜 Next Learning Goal
Topic: Conditional Statements in Java
* if statement
* if-else statement
* else-if ladder
* Nested if
* switch statement
