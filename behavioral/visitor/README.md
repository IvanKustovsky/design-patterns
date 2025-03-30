# Visitor Pattern (Behavioral)

## 📚 Description
The **Visitor Pattern** allows defining new operations on a collection of objects without changing their classes.  
Instead of modifying the classes themselves, you define operations as separate **Visitor objects**.

---

## 💡 Real-World Example: Document Processing System
In a **Document Processing System**, we may have various operations (**Export, Print, Analyze**) to be performed on multiple document types (**PDF, Word, Excel**).  
The **Visitor Pattern** allows adding new operations without altering existing document classes.

---

## ✅ Advantages
- Promotes the **Open/Closed Principle** by allowing new operations without modifying classes.
- Simplifies adding operations to complex object structures.
- Provides flexibility for performing unrelated operations on objects.

---

## ❌ Disadvantages
- Violates the **Single Responsibility Principle** by spreading related functionality across multiple classes.
- Difficult to add new element classes without modifying visitors.

---

## ▶️ Usage Scenarios
- Processing complex object structures (**e.g., Document processing, File system hierarchies**).
- Adding operations to classes without modifying them (**e.g., Exporting, Printing, Serializing**).

---

## 📂 Related Patterns
- **Composite Pattern:** Works well with the Visitor Pattern when traversing complex object hierarchies.
- **Iterator Pattern:** Provides a way to traverse objects, which can be combined with the Visitor Pattern.

---

## 📌 Example Usage
```java
DocumentVisitor exporter = new Exporter();
PdfDocument pdf = new PdfDocument("PDF Content");
pdf.accept(exporter); // Exporting PDF document: PDF Content
