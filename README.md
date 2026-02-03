# Factory Design Pattern – Java

## 📌 Overview
This project demonstrates the **Factory Design Pattern** using a real-world example: a **Shape select system**.  
The Factory Pattern helps encapsulate object creation and promotes **loose coupling** between classes.

---

## 🏗 Project Structure
src/
├── Circle.java # Concrete Shape implementation
├── Rectangle.java # Concrete Shape implementation
├── Square.java # Concrete Shape implementation
├── ShapeFactory.java # Factory class that creates shapes based on input
├── ShapeSelector.java # Client class that demonstrates shape selection
└── FactoryPatternDemo.java # Main class to run the program


---

## 🧠 Why Factory Pattern?

- Centralizes object creation logic in the Factory class  
- Reduces dependency between client and concrete classes  
- Makes adding new shapes easy without changing existing code  
- Demonstrates clean **Object-Oriented Programming (OOP)** principles  
- Ideal for showcasing design patterns on GitHub or in portfolios  

---
## 🛠️ Architecture

This implementation uses an interface-based approach to handle different geometric shapes.

### Class Diagram
```mermaid
classDiagram
    class Shape {
        <<interface>>
        +draw()
    }
    class Circle {
        +draw()
    }
    class Rectangle {
        +draw()
    }
    class Square {
        +draw()
    }
    class ShapeFactory {
        +getShape(type: String) Shape
    }
    Shape <|.. Circle
    Shape <|.. Rectangle
    Shape <|.. Square
    ShapeFactory ..> Shape : creates

