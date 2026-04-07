# 🧪 Activity: Cloud File Processing System

## 🎯 Objective

Design a scalable and maintainable backend system using the **Factory Method Pattern** to handle multiple file processing types.

---

## 📌 Scenario

You are building a cloud-based platform that allows users to upload files for processing.

The system must support different file formats, such as:

- CSV files (data analysis)  
- JSON files (API ingestion)  
- XML files (legacy system integration)  
- Log files (system monitoring and debugging)  

Each file type requires **different processing logic and behavior**.

---

## ⚠️ Problem Context

A naive implementation would use conditional logic to decide which processor to create.

This approach leads to:

- Tight coupling between the service and all file types  
- Repeated conditional logic across the system  
- Difficulty in adding new file types  
- Increased risk of breaking existing functionality  

As the system evolves and more file types are added, the design becomes:

- Hard to maintain  
- Difficult to extend  
- Error-prone  

---

## 🧠 Your Task

- Design a file processing system using the **Factory Method Pattern**  
- Delegate object creation to subclasses instead of using conditional logic  
- Ensure the system can be extended without modifying existing code  
- Focus on clean design, not just functionality  

---

## 📏 Requirements

- Define a common interface for all file processors  
- Each file type must have its own processing implementation  
- Create an abstract class that defines:
  - The processing workflow  
  - A factory method for creating processors  
- Each file type must have a corresponding subclass that creates its processor  
- The system must **NOT use if/else or switch for object creation**  

---

## 🧩 Design Expectations

Your design should:

- Follow the **Open/Closed Principle**  
- Eliminate conditional logic for object creation  
- Use inheritance and polymorphism effectively  
- Separate:
  - Processing logic  
  - Object creation logic  
- Ensure the system is easy to extend with new file types  

---

## ✅ Expected Outcome

- A clean and extensible file processing system  
- No modification required when adding new file types  
- Clear separation of responsibilities  
- Improved maintainability and scalability  

---

## 🚀 Example Use Case (Conceptual)

A developer should be able to:

- Select a specific processing job  
- Execute it without worrying about how the processor is created  
- Add a new file type by introducing a new class only  

Focus on **extensibility and design quality**, not just execution.

---

## 🧩 Challenge Extension (Optional)

- Add support for a new file type (e.g., image processing) without modifying existing code  
- Introduce logging before and after processing  
- Handle invalid or corrupted files differently for each type  
- Extend the system to support batch processing of multiple files  

---

## 📌 Key Insight

This activity demonstrates how the **Factory Method Pattern** eliminates rigid and fragile designs by delegating object creation, enabling systems to grow without modifying existing code.
