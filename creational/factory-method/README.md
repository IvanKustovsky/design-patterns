# Factory Method Design Pattern (Creational)

## 📚 Description
The **Factory Method Pattern** defines an interface for creating an object but lets subclasses decide **which class to instantiate**.

Use it when:
- A class can't anticipate the type of objects it needs to create.
- You want to **delegate the responsibility of instantiation** to subclasses.

---

## 💡 Real-World Example: Transport Logistics
A logistics app needs to deliver goods by **truck** (road logistics) or **ship** (sea logistics).  
We use the Factory Method to let subclasses decide the appropriate transport **without changing the client code**.

---

## ✅ Advantages
- Promotes **loose coupling**.
- Easy to **introduce new types** of products.
- Follows **Open-Closed Principle** (open for extension, closed for modification).

---

## ❌ Disadvantages
- More classes and abstraction layers.
- Complexity can increase with too many subclasses.

---