# Java Design Patterns: Decorator Pattern

A clean and professional implementation of the **Decorator Structural Design Pattern** using a dynamic Coffee Shop ordering system.

## ☕ Project Overview
The Decorator Pattern allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. 

This project demonstrates how to extend the functionality of a `Coffee` object by "wrapping" it with additional ingredients like **Milk** and **Chocolate**. This approach adheres to the **Open-Closed Principle**, allowing for infinite combinations of toppings without changing the base code.

### Key Concepts
* **Interface-Based:** All components and decorators implement the same `Coffee` interface.
* **Composition Over Inheritance:** Instead of creating a `CoffeeWithMilk` class, we wrap a `SimpleCoffee` in a `MilkDecorator`.
* **Recursive Nesting:** Decorators can wrap other decorators (e.g., Chocolate wrapping Milk wrapping Coffee).

---

## 🛠️ Project Structure

| File | Pattern Role | Description |
| :--- | :--- | :--- |
| `Coffee.java` | **Component** | The interface defining `getDescription()` and `getCost()`. |
| `SimpleCoffee.java` | **Concrete Component** | The base object that can be decorated. |
| `MilkDecorator.java` | **Decorator** | Wraps a Coffee object and adds $0.50 to the cost. |
| `ChocolateDecorator.java` | **Decorator** | Wraps a Coffee object and adds $0.75 to the cost. |
| `Main.java` | **Client** | Demonstrates different combinations of decoration. |

---

## 🚀 How to Run
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Raviduofficial/java-decorator-pattern-demo.git](https://github.com/Raviduofficial/java-decorator-pattern-demo.git)
   
