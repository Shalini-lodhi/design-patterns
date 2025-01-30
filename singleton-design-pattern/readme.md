### **Singleton Design Pattern**

#### **Purpose:**
The **Singleton pattern** ensures that a class has only one instance throughout the lifetime of the application and provides a global access point to that instance.

- **When to use it?**  
  It is used when we need to control access to a single instance of a class, such as a **database connection** or **logging** service
#### **Characteristics:**
1. **Private constructor**: Prevents the creation of multiple instances from outside the class.
2. **Static instance**: Holds the single instance of the class.
3. **Public method**: Provides a global point of access to the instance (often called `getInstance()`).

---

### **Steps to Implement Singleton Pattern:**

1. **Private static instance**: Holds the single instance.
2. **Private constructor**: Prevents external instantiation.
3. **Public static `getInstance()` method**: Returns the single instance of the class. If it doesn't exist, it will create one.

---

### **Explanation:**

1. **Private static instance**:  
   The `instance` variable holds the single instance of the `Singleton` class. It is `private` and `static` so it belongs to the class, not to any object of the class.

2. **Private constructor**:  
   The constructor is `private`, which prevents anyone from creating a new object of the class using `new`.

3. **Public static method (`getInstance()`)**:  
   - The `getInstance()` method checks if the `instance` is `null`.  
   - If it is `null`, it creates a new instance of the `Singleton` class.  
   - If the instance already exists, it simply returns the existing instance.

4. **Usage**:  
   The `SingletonDemo` class demonstrates how to get the instance of the `Singleton` class and call its method `showMessage()`.

---

### **Advantages of Singleton:**
- **Controlled Access**: Only one instance exists, so access to resources like database connections is controlled.
- **Lazy Initialization**: The instance is created only when needed (delayed instantiation).

### **Disadvantages of Singleton:**
- **Global State**: The singleton class can be overused and become a global variable, making it harder to test.
- **Concurrency Issues**: In multithreaded environments, special care is needed to avoid issues related to simultaneous access (using synchronization or double-checked locking).
