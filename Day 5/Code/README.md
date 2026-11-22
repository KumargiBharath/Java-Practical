# Day 5: Java Arrays

**Learning Goal:** Understand how Java arrays store and process multiple values of the same declared type.


## 🔹 What is an Array?
An array is a data structure that stores a **fixed number** of values of the **same declared type** in a single variable.

```java
int[] numbers = {10, 20, 30, 40, 50};
```


## 🔹 Declaration & Initialization

### 1. Separate Declaration and Initialization:

```java
int[] numbers;          // Declaration
numbers = new int[5];   // Initialization (creates array of size 5)
```

### 2. Combined Declaration and Initialization:

```java 
int[] numbers = {10, 20, 30, 40, 50};
```

## 🔹 Indexing & Access

Java arrays are 0-indexed. For an array of length 5:

* First element: index 0

* Third element: index 2

* Last element: index 4 (array.length - 1)

```java
System.out.println(numbers[2]); // Output: 30
numbers[2] = 100;               // Updates the third element to 100
```
## ⚠️ Note: Accessing an invalid index throws an ArrayIndexOutOfBoundsException.


## 🔹 Traversal

### Regular for loop (Use when you need the index):

```java 
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Enhanced for loop (Use for simple value traversal):

```java
for (int number : numbers) {
    System.out.println(number);
}
```

## 🔹 Advantages & Limitations

| ✅ Advantages | ❌ Limitations |
| :--- | :--- |
| Stores multiple values under one variable name. | Fixed length after creation (cannot be resized). |
| Provides direct, O(1) access using indexes. | All elements must be of the same declared type. |
| Works seamlessly with loops for data processing. | Inserting/deleting in the middle requires shifting elements. |
| Ideal for searching, sorting, and aggregate math (totals, averages, min/max). | Pre-allocated unused positions waste memory. |

## 🔹 Key Reminders

* Array indexes always start at 0.

* Use array.length to get the total number of elements.

* The last valid index is always array.length - 1.

* Prefer a regular for loop when you need the index; use an enhanced for loop for simple traversal.

## 🛠️ Practice Challenges

Try implementing these from scratch:

* Find the largest value in an integer array.

* Find the smallest value in an integer array.

* Calculate the average of all elements.

* Search for a specific value (e.g., an employee ID) using linear search.

Reverse the elements of an array in place.
