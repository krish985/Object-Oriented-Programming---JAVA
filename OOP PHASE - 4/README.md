# 📘 Java OOP - Phase 4

Welcome to **Phase 4** of my Java Object-Oriented Programming (OOP) learning journey!

This phase focuses on mastering **object comparison techniques** and **constant declarations** using `Comparable`, `Comparator`, `Enum`, and `Enumeration`. These concepts are essential for real-world application development and Java interviews.

---

## 🧠 Topics Covered
- ✅ Conceptual clarity with real-world examples  
- 🧩 Differences between `Comparable` and `Comparator`  
- 📑 Usage of `Enum` for constants and state handling  
- 🌀 Legacy iteration using `Enumeration`  
- 🔍 Interview-oriented notes and practical distinctions

---

## 📚 Contents

### 1. Comparable Interface
- Used to define **natural ordering** of objects.
- Part of `java.lang` package.
- Implemented inside the class.
- Method: `compareTo()`
- Common use case: Sorting based on a single field (e.g., marks, IDs).

---

### 2. Comparator Interface
- Used to define **custom or multiple sort strategies**.
- Part of `java.util` package.
- Implemented outside the class (can sort on different fields).
- Method: `compare()`
- Supports advanced sorting like chaining and lambda expressions.

---

### Comparable vs Comparator

| Feature        | Comparable             | Comparator               |
|----------------|------------------------|--------------------------|
| Package        | `java.lang`            | `java.util`              |
| Method         | `compareTo()`          | `compare()`              |
| Sort Logic     | Natural order (one)    | Multiple/custom logics   |
| Location       | Inside the class       | Outside the class        |
| Flexibility    | Less                   | More                     |

---

### 3. Enum in Java
- Used to define **fixed constants** with type safety.
- Helps model states or options (e.g., `ORDERED`, `DELIVERED`).
- Enums improve readability and reduce errors over string constants.

---

