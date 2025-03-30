# Observer Pattern (Behavioral)

## 📚 Description
The **Observer Pattern** defines a **one-to-many dependency** between objects, where a change in one object (subject) triggers updates to all its dependents (observers).  
It's commonly used to implement **event handling systems**.

---

## 💡 Real-World Example: News Agency and Subscribers
A **News Agency** notifies multiple **Subscribers** (e.g., Mobile Apps, Websites, TV Channels) when new news is published.  
The **Observer Pattern** allows dynamic subscription and notification without modifying the agency's internal workings.

---

## ✅ Advantages
- Promotes **loose coupling** between subject and observers.
- Supports dynamic subscription management (adding/removing observers at runtime).
- Provides a consistent way to handle multiple observers.

---

## ❌ Disadvantages
- Can lead to **memory leaks** if observers are not properly removed.
- Notification can be **slow** if many observers are present.

---

## ▶️ Usage Scenarios
- **Event handling systems** (e.g., GUI frameworks, Messaging systems).
- **Logging and monitoring tools**.
- **Distributed event-driven systems**.

---

## 📂 Related Patterns
- **Mediator Pattern:** Reduces complex interactions between multiple objects by centralizing communication.
- **Publisher-Subscriber Pattern:** A broader concept where the Observer Pattern is one specific implementation.

---

## 📌 Example Usage
```java
NewsAgencyImpl newsAgency = new NewsAgencyImpl();
Subscriber app = new MobileApp("NewsApp");
newsAgency.subscribe(app);
newsAgency.notifySubscribers("Breaking News: Observer Pattern Implemented Successfully!");
