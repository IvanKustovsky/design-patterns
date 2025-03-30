# Strategy Pattern (Behavioral)

## 📚 Description
The **Strategy Pattern** allows defining a family of algorithms, encapsulating each one, and making them interchangeable.  
The client can select the algorithm to be used at runtime.

---

## 💡 Real-World Example: Payment Processing System
In an e-commerce application, users can select different payment methods.  
The **Strategy Pattern** allows dynamically changing payment methods without modifying the client code.

---

## ✅ Advantages
- Supports **Open/Closed Principle** by allowing new strategies without modifying existing code.
- Enables **runtime selection of algorithms**.
- Promotes **loose coupling** between the context and algorithms.

---

## ❌ Disadvantages
- Increases the number of classes to maintain.
- Clients must be aware of the available strategies to use them effectively.

---

## ▶️ Usage Scenarios
- **Dynamic algorithm selection** (e.g., Payment processing, Sorting algorithms).
- **Replacing conditionals with polymorphism**.
- **Implementing different behaviors with the same interface**.

---

## 📂 Related Patterns
- **State Pattern:** Similar structure but changes behavior based on state instead of selection.
- **Command Pattern:** Encapsulates requests as objects but focuses more on executing commands.

---

## 📌 Example Usage
```java
ShoppingCart cart = new ShoppingCart();
cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
cart.checkout(99.99);
