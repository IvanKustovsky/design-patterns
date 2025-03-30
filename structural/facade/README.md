# Facade Pattern (Structural)

## 📚 Description
The **Facade Pattern** provides a simplified interface to a complex subsystem.  
It hides the complexity by exposing a single unified interface for client use.

---

## 💡 Real-World Example: Home Theater System
A home theater system involves multiple components (`Projector`, `Sound System`, `Streaming Service`).  
The **Facade Pattern** allows controlling all these subsystems with a **simple interface**.

---

## ✅ Advantages
- **Simplifies client usage** of complex systems.
- Promotes **loose coupling** between client and subsystems.
- Improves code readability and maintenance.

---

## ❌ Disadvantages
- May introduce additional abstraction layers.
- Can limit direct access to powerful subsystem features.

---

## ▶️ Usage Scenarios
- Simplifying complex libraries or frameworks.
- Providing an easy interface for poorly designed or legacy systems.
- Reducing dependency between client code and subsystems.

---

## 📂 Related Patterns
- **Adapter Pattern**: Converts one interface to another, while Facade provides a simplified interface.
- **Decorator Pattern**: Adds functionality, while Facade simplifies interaction.

---

## 📌 Example Usage
```java
HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Projector(), new SoundSystem(), new StreamingService());
homeTheater.watchMovie("Inception");
homeTheater.endMovie();
