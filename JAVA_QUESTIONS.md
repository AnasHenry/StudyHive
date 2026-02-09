# ☕ Java Interview Questions & Answers

---

## Core Java Questions

### Q1. What is Java? Why is it platform independent?
**Answer:**
Java is a high-level, object-oriented programming language designed to be portable, secure, and robust.

It is platform independent because Java code is compiled into bytecode, which runs on the JVM (Java Virtual Machine). Since JVM exists for multiple operating systems, the same .class file can run anywhere.

---

### Q2. What is the difference between JDK, JRE, and JVM?
**Answer:**
- JVM (Java Virtual Machine): Executes Java bytecode.
- JRE (Java Runtime Environment): Provides libraries + JVM to run Java apps.
- JDK (Java Development Kit): Full package containing JRE + development tools like compiler (javac).

---

### Q3. What are the main features of Java?
**Answer:**
- Object-Oriented
- Platform Independent
- Secure
- Robust
- Multithreaded
- High Performance (via JIT)
- Distributed
  
---

### Q4. What is OOP? Name its four pillars.
**Answer:**
OOP organizes code into objects that contain data and behavior.
Four pillars:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

### Q5. What is Encapsulation?
**Answer:**
Encapsulation is wrapping data and methods together into a single unit and restricting direct access using private variables with public getters/setters.

---

### Q6. Difference between Abstraction and Encapsulation?
**Answer:**
| Abstraction                                  |          Encapsulation           |
| -------------------------------------------- | :------------------------------: |
| Hides implementation details                 |            Hides data            |
| Achieved using abstract classes & interfaces | Achieved using access modifiers  |
| Focuses on what object does                  | Focuses on how data is protected |

---

### Q7. What is Polymorphism?
**Answer:**
Polymorphism means one interface, multiple implementations.
Types:
- Compile-time -> Method Overloading
- Runtime -> Method Overriding

Example for Method Overloading:
```java
class Calculator {
    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));        // calls int add(int, int)
        System.out.println(calc.add(2, 3, 4));     // calls int add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));    // calls double add(double, double)
    }
}
```

Example for Method Overriding:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // upcasting
        Animal a2 = new Cat();

        a1.sound();  // calls Dog's sound() → "Dog barks"
        a2.sound();  // calls Cat's sound() → "Cat meows"
    }
}

```
---

### Q8. Method Overloading vs Overriding
**Answer:**
| Feature     | Compile-Time Polymorphism       | Run-Time Polymorphism       |
| ----------- | ------------------------------- | --------------------------- |
| Achieved By | Method Overloading              | Method Overriding           |
| Binding     | Compile Time                    | Runtime (Dynamic Dispatch)  |
| Parameters  | Must differ (number/type)       | Must be same                |
| Return Type | Can differ if parameters differ | Must be same (or covariant) |
| Performance | Faster                          | Slower                      |
| Flexibility | Less                            | More                        |

---

### Q9. What is an Interface?
**Answer:**
An interface is a blueprint of a class containing abstract methods that must be implemented.
>  Interfaces can have default and static methods.

---

### Q10. Abstract Class vs Interface
**Answer:**
| Abstract Class                            | Interface            |
| ----------------------------------------- | -------------------- |
| Can have constructors                     | Cannot               |
| Supports both abstract & concrete methods | Mostly abstract      |
| Single inheritance                        | Multiple inheritance |

---

## 🟨 Flash Card Questions (Memorizers)

### Q11. Why is Java not 100% Object-Oriented?
**Answer:**
Because it uses primitive data types like int, char, double which are not objects.

---

### Q12. What is the static keyword?
**Answer:**
static means the member belongs to the class, not the object.
- Static variables → shared memory
- Static methods → callable without object
- Static block → runs once when class loads

---

### Q13. What is a Constructor?
**Answer:**
A constructor is a special method used to initialize objects.

Rules:
- Same name as class
- No return type
- Called automatically

Types:
- Default
- Parameterized
  
---

### Q14. What is Garbage Collection?
**Answer:**
Garbage Collection automatically removes unused objects from memory, preventing leaks.
> “Java handles memory automatically — developers don’t free memory manually.”

---

### Q15. What is Exception Handling?
**Answer:**
Exception handling prevents program crashes by managing runtime errors.
```java
public class Test {
    public static int foo() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(foo());
    }
}
//OUTPUT
20
```

--- 

### Q16. Checked vs Unchecked
**Answer:**
Checked Exception:

- Exceptions are checked at compile-time.
- Must either be handled using try-catch or declared using throws.
- Examples: IOException, SQLException, ClassNotFoundException.
- Subclass of Exception but not of RunTimeException.
```java
import java.io.*;

class Test {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt"); // may throw IOException
        } catch (IOException e) {
            System.out.println("File not found: " + e);
        }
    }
}
```

Unchecked Exception:

- Exceptions that occur at run-time and are not checked at compile-time.
- No need to handle or declare them.
- Examples: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.
- Subclass of RunTimeException.

```java
class Test {
    public static void main(String[] args) {
        int x = 10 / 0;  // ArithmeticException (unchecked)
    }
}
```

## A step above of fresher.

### Q17. What is Multithreading?
**Answer:**
Running multiple threads simultaneously to improve CPU utilization.
> Downloading + Playing video at the same time.

### Q18. String vs StringBuilder vs StringBuffer.
**Answer:**
| String                 | StringBuilder | StringBuffer |
| ---------------------- | ------------- | ------------ |
| Immutable              | Mutable       | Mutable      |
| Slow for modifications | Fast          | Thread-safe  |

---

### Q19. What is the difference between == and .equals()?
**Answer:**
- == -> compares memory addresses
- .equals() -> compares values

---

### Q20. What is Collection Framework?
**Answer:**
A set of classes and interfaces used to store and manipulate groups of data.
- ArrayList
- LinkedList
- HashMap
- HashSet

---

### Q21. Array vs ArrayList.
**Answer:**
| Array             | ArrayList       |
| ----------------- | --------------- |
| Fixed size        | Dynamic         |
| Faster            | Slightly slower |
| Stores primitives | Stores objects  |

---