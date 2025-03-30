# Proxy Pattern (Structural)

## 📚 Description
The **Proxy Pattern** provides a surrogate or placeholder for another object to control access to it.  
Proxies are often used to **lazy-load, control access, or provide additional functionality** to objects without changing their structure.

---

## 💡 Real-World Example: Image Loading with Virtual Proxy
In an image viewer application, loading high-resolution images can be **resource-intensive**.  
The **Proxy Pattern** allows delaying the actual image loading until it is necessary, **improving performance**.

---

## ✅ Advantages
- **Lazy Initialization:** Loading heavy objects only when needed.
- **Security Proxies:** Adding access control to objects.
- **Logging Proxies:** Recording access to objects for auditing or analysis.

---

## ❌ Disadvantages
- Can introduce additional complexity.
- May decrease performance if used improperly.

---

## ▶️ Usage Scenarios
- **Virtual Proxy:** Lazy initialization of expensive objects.
- **Protection Proxy:** Access control for resources.
- **Remote Proxy:** Handling network communication between clients and real objects.

---

## 📂 Related Patterns
- **Adapter Pattern:** Changes the interface of an object, while Proxy controls access to it.
- **Decorator Pattern:** Adds behavior, while Proxy controls access or instantiation.

---

## 📌 Example Usage
```java
Image image1 = new ImageProxy("nature_photo.jpg");
image1.display(); // Loads and displays the image
image1.display(); // Only displays the already loaded image
