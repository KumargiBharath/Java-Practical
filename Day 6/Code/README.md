# ☕ Day 6: Java Strings, StringBuilder & StringBuffer

> **Phase 1** | **Core Java** | **Week 1** | **Day 6**  
> 🧠 *Learning Formula:* **LEARN** → **UNDERSTAND** → **CODE** → **PRACTICE** → **REVISE**

---

## 🎯 Learning Goal
Understand how Java handles strings, string immutability, string manipulation, and mutable string objects.

---

## 1. String Fundamentals
A `String` is a sequence of characters and is a built-in class in Java. It is widely used to store text data.

```java
String name = "Kumar";
```

* ✅ Strings are immutable (cannot be changed after creation).
* ✅ Strings are objects, not primitive data types.

## 2. String Immutability
Once a String object is created, its contents cannot be modified. Any operation that appears to modify a string actually creates a new string object in memory.

```java
String name = "Java";
name.concat(" Backend");

System.out.println(name); // Output: Java
```
To retain the concatenated result, you must reassign the reference:

```java
name = name.concat(" Backend");
System.out.println(name); // Output: Java Backend
```

## 3. Important String Methods


This document provides a quick reference guide for commonly used methods in the Java `String` class.

| Method | Purpose |
| :--- | :--- |
| `length()` | Returns the number of characters |
| `charAt(int index)` | Returns the character at the specified index |
| `toUpperCase()` | Converts all characters to uppercase |
| `toLowerCase()` | Converts all characters to lowercase |
| `concat(String str)` | Joins two strings together |
| `substring(int begin, int end)` | Extracts a part of a string |
| `contains(CharSequence s)` | Checks whether a specific text exists |
| `equals(Object obj)` | Compares the actual contents of two strings |
| `replace(char old, char new)` | Replaces characters or text |
| `trim()` | Removes surrounding whitespace |

## 4. String Comparison

* == Operator

Checks whether two references point to the same object in memory.

* equals() Method

Compares the actual contents (values) of two strings.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false (different objects in memory)
System.out.println(a.equals(b)); // true (same content)
```

## 5. StringBuilder

StringBuilder is mutable, meaning its contents can be modified without creating new objects.

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Backend");
sb.reverse();

System.out.println(sb); // Output: dnekcaB avaJ
```

Important Methods:

* append() – Adds text to the end.
* insert() – Inserts text at a specific position.
* delete() – Deletes a range of characters.
* reverse() – Reverses the sequence of characters.
* replace() – Replaces a range of characters.
⚡ Key Point: StringBuilder is generally faster than StringBuffer for ordinary single-threaded modifications because it is not thread-safe.

## 6. StringBuffer
StringBuffer is also mutable, but it is designed for multi-threaded environments.

* ✅ Its methods are synchronized.

* It provides thread-safe individual operations.
  
* ⚠️ It is generally slower than StringBuilder due to synchronization overhead.

## 7. Practical Coding Exercises
Test your knowledge by implementing the following:
* Reverse a String.
* Check whether a String is a Palindrome.
* Count Characters in a String.
* Count Vowels in a String.

## 10. 🔑 Key Takeaways
* 🧊 String is immutable.
* ⚡ StringBuilder is mutable and generally faster.
* 🛡️ StringBuffer is mutable and synchronized (thread-safe).
* ⚖️ .equals() compares String contents.
* 🔗 == compares object references.
* 🔤 charAt() accesses individual characters.
* 📏 length() returns the number of characters.
