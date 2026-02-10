# ☕ Java Interview Questions & Answers

---

## Core Java Questions

### What is Java? Why is it platform independent?
**Answer:**
Java is a high-level, object-oriented programming language designed to be portable, secure, and robust.

It is platform independent because Java code is compiled into bytecode, which runs on the JVM (Java Virtual Machine). Since JVM exists for multiple operating systems, the same .class file can run anywhere.

---

### What is the difference between JDK, JRE, and JVM?
**Answer:**
- JVM: JVM also known as Java Virtual Machine is a part of JRE. JVM is a type of interpreter responsible for converting bytecode into machine-readable code. JVM itself is platform dependent but it interprets the bytecode which is the platform-independent reason why Java is platform-independent.
- JRE: JRE stands for Java Runtime Environment, it is an installation package that provides an environment to run the Java program or application on any machine.
- JDK: JDK stands for Java Development Kit which provides the environment to develop and execute Java programs. JDK is a package that includes two things Development Tools to provide an environment to develop your Java programs and, JRE to execute Java programs or applications.

---

### What is JIT?
**Answer:**
JIT stands for (Just-in-Time) compiler is a part of JRE(Java Runtime Environment), it is used for better performance of the Java applications during run-time.
![DOM.](https://media.geeksforgeeks.org/wp-content/uploads/20251210112355073106/JIT-768.png)
- Source code is compiled with javac to form bytecode
- Bytecode is further passed on to JVM 
- JIT is a part of JVM, JIT is responsible for compiling bytecode into native machine code at run time.
- The JIT compiler is enabled throughout, while it gets activated when a method is invoked. For a compiled method, the JVM directly calls the compiled code, instead of interpreting it.
- As JVM calls the compiled code that increases the performance and speed of the execution.

### What are the main features of Java?
**Answer:**
- Object-Oriented
- Platform Independent
- Secure
- Robust
- Multithreaded
- High Performance (via JIT)
- Distributed
  
---

### What is OOP? Name its four pillars.
**Answer:**
OOP organizes code into objects that contain data and behavior.
Four pillars:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

### What is Encapsulation?
**Answer:**
Encapsulation is wrapping data and methods together into a single unit and restricting direct access using private variables with public getters/setters.

---

### Difference between Abstraction and Encapsulation?
**Answer:**
| Abstraction                                  |          Encapsulation           |
| -------------------------------------------- | :------------------------------: |
| Hides implementation details                 |            Hides data            |
| Achieved using abstract classes & interfaces | Achieved using access modifiers  |
| Focuses on what object does                  | Focuses on how data is protected |

---

### What is Polymorphism?
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

### Method Overloading vs Overriding
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

### What is an Interface?
**Answer:**
An interface is a blueprint of a class containing abstract methods that must be implemented.
>  Interfaces can have default and static methods.

---

### Abstract Class vs Interface
**Answer:**
| Abstract Class                            | Interface            |
| ----------------------------------------- | -------------------- |
| Can have constructors                     | Cannot               |
| Supports both abstract & concrete methods | Mostly abstract      |
| Single inheritance                        | Multiple inheritance |

---

### What are the Memory storages available in JVM?
**Answer:**
![DOM.](https://media.geeksforgeeks.org/wp-content/uploads/20240402092041/JVM-Areas-768.png)
JVM consists of a few memory storages as mentioned below:

- Class(Method) Area: stores class-level data of every class such as the runtime constant pool, field, and method data, and the code for methods.
- Heap: Objects are created or objects are stored. It is used to allocate memory to objects during run time.
- Stack: stores data and partial results which will be needed while returning value for method and performing dynamic linking
- Program Counter Register: stores the address of the Java virtual machine instruction currently being executed.
- Native Method Stack: stores all the native methods used in the application.

---

### What is a class Loader?
**Answer:**
A class Loader is a part of JVM which is responsible for loading Java classes into memory at runtime.
Key Responsibilities of Class Loader:
- Loading: Reads class bytecode (.class file) from disk, network, or other sources.
- inking: Verifies bytecode (security check) and Prepares static fields
- Initialization: Executes static blocks and Initializes static variables

---

### What are Packages in Java? Why are they used?
**Answer:**
Packages in Java can be defined as the grouping of related types of classes, interfaces, etc providing access to protection and namespace management.

Packages are used in Java in order to prevent naming conflicts, control access, and make searching/locating and usage of classes, interfaces, etc easier.

Types:
- User-defined packages
- Built-in packages


---

### What are the advantages of Packages in Java?
**Answer:**
- Packages avoid name clashes.
- The Package provides easier access control.
- We can also have the hidden classes that are not visible outside and are used by the package.
- It is easier to locate the related classes.

---

### What is Java String Pool?
**Answer:**
A Java String Pool is a place in heap memory where all the strings defined in the program are stored. A separate place in a stack is there where the variable storing the string is stored. Whenever we create a new string object, JVM checks for the presence of the object in the String pool, If String is available in the pool, the same object reference is shared with the variable, else a new object is created.

---

### Why do we need wrapper classes?
**Answer:**
The wrapper class is an object class that encapsulates the primitive data types, and we need them for the following reasons:
- Wrapper classes are final and immutable
- Provides methods like valueOf(), parseInt(), etc.
- It provides the feature of autoboxing and unboxing.
  
---

### What is autoboxing and unboxing?
**Answer:**
- Autoboxing: It is the automatic conversion of primitive type to its corresponding wrapper class object
```java
int num = 10;
Integer boxedNum = num; // Autoboxing happens here
``` 
- Unboxing: Autoboxing and unboxing reduce boilerplate code. Can happen implicitly in expressions, assignments, and method calls.
```java
List<Integer> numbers = new ArrayList<>();
numbers.add(5);      // Autoboxing: int → Integer
int n = numbers.get(0); // Unboxing: Integer → int
```

---

## 🟨 Flash Card Questions (Memorizers)

### Why is Java not 100% Object-Oriented?
**Answer:**
Because it uses primitive data types like int, char, double which are not objects.

---

### What does it mean that Strings are immutable?
**Answer:**
Once a String object is created, it cannot be modified. Any operation that seems to modify a String creates a new String object.

### What is the static keyword?
**Answer:**
static means the member belongs to the class, not the object.
- Static variables → shared memory
- Static methods → callable without object
- Static block → runs once when class loads

---

### What is a Constructor?
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

### What is Garbage Collection?
**Answer:**
Garbage Collection automatically removes unused objects from memory, preventing leaks.
> “Java handles memory automatically — developers don’t free memory manually.”

---

### What is Exception Handling?
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

### Checked vs Unchecked
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
---

## A step above of fresher.

### What is Multithreading?
**Answer:**
Running multiple threads simultaneously to improve CPU utilization.
> Downloading + Playing video at the same time.

### String vs StringBuilder vs StringBuffer.
**Answer:**
| String                 | StringBuilder | StringBuffer |
| ---------------------- | ------------- | ------------ |
| Immutable              | Mutable       | Mutable      |
| Slow for modifications | Fast          | Thread-safe  |

---

### What is the difference between == and .equals()?
**Answer:**
- == -> compares memory addresses
- .equals() -> compares values

---

### What is Collection Framework?
**Answer:**
A set of classes and interfaces used to store and manipulate groups of data.
- ArrayList
- LinkedList
- HashMap
- HashSet

---

### Array vs ArrayList.
**Answer:**
| Array             | ArrayList       |
| ----------------- | --------------- |
| Fixed size        | Dynamic         |
| Faster            | Slightly slower |
| Stores primitives | Stores objects  |

---