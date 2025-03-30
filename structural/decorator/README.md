# Decorator Pattern (Structural)

## 📚 Description
The **Decorator Pattern** allows dynamically adding behavior to an object **without modifying its class**.

---

## 💡 Real-World Example: Notifier System
A basic notification system (`EmailNotifier`) can be enhanced with additional functionalities (`SMSNotifier`, `SlackNotifier`) by wrapping them.

---

## ✅ Advantages
- Provides **flexibility** to add or remove functionalities at runtime.
- Promotes **Single Responsibility Principle** by separating functionalities into decorators.
- Avoids subclass explosion.

---

## ❌ Disadvantages
- Can lead to **complex code** with many small classes.
- Debugging can be challenging due to the many layers of wrappers.

---

## ▶️ Usage Scenarios
- **Adding Logging or Caching** functionality to existing classes.
- **Extending User Interfaces** without altering core components.
- **Adding Security Features** (e.g., Encryption, Authentication).

---

## 📂 Related Patterns
- **Adapter Pattern**: Transforms interface, while Decorator adds functionality.
- **Composite Pattern**: Treats individual objects and compositions uniformly.

---

## 📌 Example Usage
```java
Notifier notifier = new SlackNotifier(new SMSNotifier(new EmailNotifier()));
notifier.send("Hello World!");