# Factory Design Pattern in Java 🏭

This repository contains a simple and clear implementation of the **Factory Design Pattern** using Java.
The project demonstrates how object creation can be handled using a factory class instead of direct
instantiation, following OOP and clean code principles.

---

## 📌 What is the Factory Design Pattern?

The Factory Design Pattern is a **creational design pattern** that provides an interface for creating
objects but allows subclasses or a factory class to decide which object to create.
It helps reduce tight coupling between classes and improves code flexibility.

---

## 🎯 Why Use Factory Pattern?

- Avoids direct use of `new` keyword in client code
- Promotes **loose coupling**
- Improves **code maintainability**
- Supports **polymorphism**
- Easy to extend with new object types

---

## 🧠 Concepts Used

- Interfaces
- Polymorphism
- Encapsulation
- Abstraction
- Object-Oriented Design (OOD)

---

## 🏗️ Project Structure


---

## ▶️ How It Works

The client code requests an object from the factory instead of creating it directly.

```java
Shape shape = ShapeFactory.getShape("CIRCLE");
shape.draw();
