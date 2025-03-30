# Builder Design Pattern (Creational)

## 📚 Description
The **Builder Pattern** separates the construction of a complex object from its representation.  
It's especially useful when:
- The object has **many optional parameters**.
- You want **immutable objects**.
- You need a **step-by-step construction process**.

---

## 💡 Real-World Example: User Profile Builder
We create a **User** object with many optional fields (age, phone, address).  
The builder simplifies the creation without having a constructor with many parameters (which is hard to read and maintain).

---

## ✅ Advantages
- Clear and **readable object creation**.
- Helps create **immutable objects**.
- Avoids constructor telescoping (constructors with many parameters).

---

## ❌ Disadvantages
- Requires creating an extra `Builder` class.
- More code to maintain compared to simple objects.

---