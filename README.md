# Design Patterns
- Provide reusable solutions to common software design problem
- Helps in writting clean, maintainable and flexible code by applying well-tested solution
  
**1. Creational Design Pattern** 
- Used for creating/intantiating object classes
  
**2. Structural Design Pattern**
- Used for structuring more than one classes/object together
- Focus on how object and classes can be combined to form a larger strucutre
  
**3. Behavioral**
- Deals woth object communication focusing on how responsibilities are distributed among objects.
- Used for identifying and setting up common communication pattern among objects.

### **Design Patterns Table**  

| **Category**        | **Pattern Name**     | **Purpose**                                         | **Example in Java**          |
|---------------------|---------------------|-----------------------------------------------------|------------------------------|
| **Creational**      | [`Singleton`](https://github.com/Shalini-lodhi/design-patterns/tree/main/singleton-design-pattern)           | Ensures a class has only one instance.             | Database connection manager |
|                     | [`Factory`](https://github.com/Shalini-lodhi/design-patterns/tree/main/factory-design-pattern)             | Provides an interface to create objects.           | Shape factory               |
|                     | Builder             | Builds complex objects step by step.               | Car builder                 |
|                     | Prototype           | Clones existing objects instead of creating new ones. | Cloning a document object  |
|                     | `Abstract Factory`    | Factory of factories to create related objects.    | GUI toolkit (Button, TextBox) |
| **Structural**      | [`Adapter`](https://github.com/Shalini-lodhi/design-patterns/tree/main/adaptor-design-pattern)             | Allows incompatible interfaces to work together.   | Plug adapter                |
|                     | `Decorator`           | Adds behavior dynamically to an object.            | Coffee with milk            |
|                     | Proxy               | Controls access to an object.                      | Lazy database connection    |
|                     | Composite           | Composes objects into tree structures.             | File system hierarchy       |
|                     | Bridge              | Separates abstraction from implementation.         | Remote & TV                 |
|                     | [`Facade`](https://github.com/Shalini-lodhi/design-patterns/tree/main/facade-design-pattern)              | Provides a simplified interface to a complex system. | Library management system |
|                     | `Flyweight`           | Shares objects to reduce memory usage.             | Character object sharing    |
| **Behavioral**      | `Observer`            | Notifies all dependents when an object changes.    | News subscriber system      |
|                     | [`Strategy`](https://github.com/Shalini-lodhi/design-patterns/tree/main/strategy-design-pattern)            | Selects an algorithm at runtime.                   | Payment method (PayPal, Card) |
|                     | Command             | Encapsulates requests as objects.                  | Remote control commands     |
|                     | State               | Changes behavior based on object state.            | Traffic light system        |
|                     | Template Method     | Defines the skeleton of an algorithm.              | Online order processing     |
|                     | `Chain of Responsibility` | Passes a request along a chain of handlers.   | Logging system              |
|                     | Mediator            | Reduces direct communication between objects.      | Chatroom mediator           |
|                     | Memento             | Captures and restores an object's state.          | Undo functionality in editor |
|                     | Visitor             | Adds operations to a class without modifying it.   | XML parser                  |
|                     | Interpreter         | Defines a grammar for interpreting expressions.    | Simple mathematical parser  |
|                     | Iterator            | Provides a way to traverse elements.              | Collection framework iterator |


