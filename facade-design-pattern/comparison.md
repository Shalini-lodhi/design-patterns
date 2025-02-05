## **Relationship of Facade Pattern with Other Design Patterns**  

The **Facade Pattern** is related to several design patterns, both **similar and different** in various aspects. Let’s explore:

---

## **1️⃣ Similarities & Differences with Other Design Patterns**
| **Design Pattern**  | **Similarity to Facade** | **Difference from Facade** |
|----------------|-----------------|------------------|
| [**Adapter Pattern**](https://github.com/Shalini-lodhi/design-patterns/blob/main/facade-design-pattern/comparison.md#a-facade-vs-adapter) | Both act as intermediaries between different systems. | **Adapter** converts an **incompatible interface** into a compatible one, while **Facade** simplifies a complex system's interface. |
| [**Decorator Pattern**](https://github.com/Shalini-lodhi/design-patterns/blob/main/facade-design-pattern/comparison.md#b-facade-vs-decorator) | Both can modify or extend functionality. | **Decorator** dynamically **adds behavior** at runtime, while **Facade** provides a **simplified interface**. |
| [**Proxy Pattern**](https://github.com/Shalini-lodhi/design-patterns/blob/main/facade-design-pattern/comparison.md#c-facade-vs-proxy) | Both provide a level of abstraction over another class. | **Proxy** controls access (security, caching, logging), while **Facade** only simplifies access. |
| [**Mediator Pattern**](https://github.com/Shalini-lodhi/design-patterns/blob/main/facade-design-pattern/comparison.md#d-facade-vs-mediator) | Both reduce dependencies between classes. | **Mediator** manages communication **between multiple objects**, while **Facade** is a **single entry point** to a system. |
| **Singleton Pattern** | Facade is often implemented as a Singleton. | **Singleton** ensures only **one instance**, while **Facade** organizes a complex system. |

---

## **2️⃣ Code Examples Comparing Facade with Other Patterns**

### **(A) Facade vs Adapter**
**Example Use Case:**  
- **Facade:** Simplifies interaction with **multiple subsystems** (e.g., a computer startup system).  
- **Adapter:** Converts an interface to be **compatible with another interface** (e.g., different chargers for a phone).  

#### **Facade Example (Simplifies a Complex API)**
```java
// Subsystem classes
class OldBillingSystem {
    void processPayment() { System.out.println("Processing payment in old system."); }
}

class NewBillingSystem {
    void makePayment() { System.out.println("Processing payment in new system."); }
}

// Facade to unify old and new billing system
class BillingFacade {
    private OldBillingSystem oldBilling;
    private NewBillingSystem newBilling;

    public BillingFacade() {
        this.oldBilling = new OldBillingSystem();
        this.newBilling = new NewBillingSystem();
    }

    public void pay() {
        oldBilling.processPayment();
        newBilling.makePayment();
    }
}

// Client
public class FacadeExample {
    public static void main(String[] args) {
        BillingFacade billing = new BillingFacade();
        billing.pay();  // Simplifies access to both systems
    }
}
```

---

#### **Adapter Example (Converts One Interface to Another)**
```java
// Old Payment System (Incompatible with new interface)
class OldPaymentSystem {
    void processOldPayment() { System.out.println("Payment done using Old Payment System."); }
}

// New Payment Interface (What the client expects)
interface NewPaymentInterface {
    void pay();
}

// Adapter to convert OldPaymentSystem into NewPaymentInterface
class PaymentAdapter implements NewPaymentInterface {
    private OldPaymentSystem oldPayment;

    public PaymentAdapter(OldPaymentSystem oldPayment) {
        this.oldPayment = oldPayment;
    }

    @Override
    public void pay() {
        oldPayment.processOldPayment(); // Adapting old system to new interface
    }
}

// Client
public class AdapterExample {
    public static void main(String[] args) {
        NewPaymentInterface payment = new PaymentAdapter(new OldPaymentSystem());
        payment.pay();  // Uses new interface, but calls old system internally
    }
}
```
**Key Difference:**  
- **Facade** simplifies **interactions with multiple subsystems**.  
- **Adapter** makes an **incompatible interface work with another interface**.  

---

### **(B) Facade vs Decorator**
**Example Use Case:**  
- **Facade:** Provides a **simplified** interface.  
- **Decorator:** **Adds behavior dynamically** without modifying the original class.  

#### **Decorator Example (Adding Behavior Dynamically)**
```java
interface Coffee {
    String getDescription();
    double getCost();
}

// Base class
class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple Coffee"; }
    public double getCost() { return 5.0; }
}

// Decorator
class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) { this.coffee = coffee; }

    public String getDescription() { return coffee.getDescription() + ", Milk"; }
    public double getCost() { return coffee.getCost() + 1.5; }
}

// Client
public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
    }
}
```
**Key Difference:**  
- **Facade** doesn’t add new functionality; it just provides a **simplified interface**.  
- **Decorator** dynamically **adds new behavior** at runtime.  

---

### **(C) Facade vs Proxy**
**Example Use Case:**  
- **Facade:** Simplifies interaction.  
- **Proxy:** **Controls access** (e.g., caching, security, lazy initialization).  

#### **Proxy Example (Controlling Access)**
```java
interface Database {
    void fetchData();
}

// Real database
class RealDatabase implements Database {
    public void fetchData() { System.out.println("Fetching data from the real database."); }
}

// Proxy to control access
class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    
    @Override
    public void fetchData() {
        if (realDatabase == null) {
            realDatabase = new RealDatabase(); // Lazy initialization
        }
        System.out.println("Proxy: Logging access before fetching data.");
        realDatabase.fetchData();
    }
}

// Client
public class ProxyExample {
    public static void main(String[] args) {
        Database db = new DatabaseProxy();
        db.fetchData();  // Proxy controls access and logging
    }
}
```
**Key Difference:**  
- **Facade** **hides complexity** of multiple classes.  
- **Proxy** **controls access** (e.g., logging, security, caching).  

---

### **(D) Facade vs Mediator**
**Example Use Case:**  
- **Facade:** A single entry point to a **subsystem**.  
- **Mediator:** Manages **communication** between multiple objects.  

#### **Mediator Example (Managing Object Communication)**
```java
import java.util.ArrayList;
import java.util.List;

// Mediator Interface
interface ChatMediator {
    void sendMessage(String message, User user);
}

// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) { users.add(user); }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}

// User class
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

// Concrete User
class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) { super(mediator, name); }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Client
public class MediatorExample {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        user1.send("Hello Bob!");
    }
}
```
**Key Difference:**  
- **Facade** groups related subsystems into a **single interface**.  
- **Mediator** allows **communication between objects without direct references**.  


## **Conclusion**
- **Facade** simplifies interaction with **complex subsystems**.  
- Other patterns (Adapter, Proxy, Decorator, Mediator) serve different purposes like **adapting interfaces, controlling access, adding behavior, or managing communication**.  
