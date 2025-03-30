# Adapter Pattern (Structural)

## 📚 Description
The **Adapter Pattern** allows incompatible interfaces to work together by providing a wrapper that translates one interface into another.

---

## 💡 Real-World Example: Integrating Third-Party Payment Systems
Your application needs to process payments using various payment gateways (PayPal, Stripe) with **inconsistent interfaces**.  
The **Adapter Pattern** allows you to create a **unified interface** for different payment providers.

---

## ✅ Advantages
- Allows integration of incompatible systems.
- Follows the **Single Responsibility Principle** by separating the adaptation logic.
- Provides flexibility by adding adapters for new services without modifying existing code.

---

## ❌ Disadvantages
- Can introduce unnecessary complexity if overused.
- May reduce performance due to the extra layer of abstraction.

---

## ▶️ Usage Scenarios
- **Integrating Legacy Code** with modern interfaces.
- **Connecting Third-Party APIs** with your application.
- **Adapter for different data formats** (e.g., XML to JSON conversion).

---

## 📂 Related Patterns
- **Decorator Pattern**: Adds functionality instead of converting interfaces.
- **Facade Pattern**: Provides a simplified interface to a complex system.

---

## 📌 Example Usage
```java
PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
paypalProcessor.processPayment(150.0);
