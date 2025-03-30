# Singleton Design Pattern (Creational)

## 📚 Description
The **Singleton Pattern** ensures that a class has **only one instance** and provides a **global access point** to it.

This pattern is particularly useful when:
- Only one instance of a class is needed to coordinate actions across a system.
- You want to control access to shared resources (like databases, file systems, or logging).

---

## 💡 Real-World Example: Database Connection Manager
In most applications, it’s inefficient and risky to open multiple connections to a database unnecessarily.  
A **Singleton** DatabaseConnectionManager class ensures that:
- There's only **one connection manager** instance.
- All parts of the system use the **same connection instance**.

---

## ✅ Advantages
- Controlled access to a single instance.
- Reduced memory footprint (only one instance is created).
- Can be **lazy-loaded** (created only when needed).
- Can be thread-safe (with synchronized or double-checked locking).

---

## ❌ Disadvantages
- Can introduce **global state**, which makes unit testing harder.
- Violates the **Single Responsibility Principle** if it also handles more than instance control.
- In multithreaded environments, you have to ensure proper synchronization.

---