# Abstract Factory Pattern (Creational)

## 📚 Description
The **Abstract Factory Pattern** provides an interface for creating families of related or dependent objects **without specifying their concrete classes**.

It's commonly used when:
- You want to create a **set of related objects**.
- You need to **support different platforms** or **themes**.

---

## 💡 Real-World Example: Cross-Platform UI Components
We have different platforms (Windows & MacOS) with their own unique **UI components** (`Button`, `Checkbox`).  
The **Abstract Factory Pattern** allows us to create these components **without changing client code**.

---

## ✅ Advantages
- Promotes **consistency** among related objects.
- Follows the **Open/Closed Principle**—easy to introduce new factories.
- Decouples client code from concrete implementations.

---

## ❌ Disadvantages
- Increased complexity due to many interfaces and classes.
- May introduce unnecessary complexity if not used properly.

---

## ▶️ Usage Scenarios
- **Cross-Platform GUIs** (Windows, Mac, Linux, etc.)
- **Theming Systems** (Light theme, Dark theme)
- **Database Access Objects (DAOs)** for various databases (MySQL, MongoDB, etc.)

---

## 📂 Related Patterns
- **Factory Method**: Focuses on single object creation, while Abstract Factory deals with families of objects.
- **Builder**: More focused on constructing a complex object step-by-step.
- **Prototype**: Clones existing objects to create new instances.

---

## 📌 Example Usage
```java
GUIFactory factory = new MacOSFactory();
Application app = new Application(factory);
app.render();