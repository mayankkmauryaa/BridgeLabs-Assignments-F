## **1. What is the difference between JDK and JRE?**

* **JDK (Java Development Kit):**

  * A full development kit required to write, compile, and debug Java programs.
  * Includes:

    * **Compiler (`javac`)** – converts source code (`.java`) into bytecode (`.class`).
    * **JRE (Java Runtime Environment)** – to execute Java programs.
    * **Development tools** like `javadoc`, `javap`, debugger, etc.

* **JRE (Java Runtime Environment):**

  * A subset of JDK. It provides only what is needed to **run** Java programs.
  * Includes:

    * JVM (Java Virtual Machine)
    * Core class libraries (`java.lang`, `java.util`, etc.)
  * Does **not** include compiler or development tools.

👉 **In short:**

* JDK = JRE + Compiler + Dev Tools
* JRE = JVM + Libraries

Example:

* If you want to just run Minecraft (written in Java) → you need **JRE**.
* If you want to build Minecraft mods → you need **JDK**.

---

## **3. What is Java Virtual Machine (JVM)?**

* JVM is a **specification and implementation** of a virtual machine that executes Java bytecode.
* Acts as a **middle layer** between compiled Java code and the host OS.

### **Responsibilities of JVM:**

1. **Loading** `.class` files (via ClassLoader).
2. **Verifying** bytecode for security.
3. **Interpreting or JIT compiling** bytecode to machine instructions.
4. **Executing** code with memory management (heap, stack, garbage collection).
5. **Providing portability** (same bytecode can run on any JVM implementation).

👉 JVM makes Java **platform-independent**.

Example:

```java
System.out.println("Hello World");
```

* Compiled → `HelloWorld.class` (bytecode).
* JVM on Windows/Linux/Mac will execute it differently but produce the same output.

---

## **4. What are the different types of memory areas allocated by JVM?**

JVM divides memory into several runtime areas:

1. **Method Area (MetaSpace in Java 8+):**

   * Stores class-level information (metadata), static variables, method bytecodes.
   * Shared among all threads.

2. **Heap Area:**

   * Stores all **objects** and **instance variables**.
   * Shared among all threads.
   * Garbage Collector cleans unused objects from heap.

3. **Stack Area:**

   * Each thread gets its own **stack**.
   * Stores method calls (frames), local variables, references to objects.
   * Works on **LIFO (Last In, First Out)** principle.

4. **PC (Program Counter) Register:**

   * Each thread has its own PC register.
   * Holds the address of the current executing JVM instruction.

5. **Native Method Stack:**

   * Used when Java interacts with **native libraries** (C/C++ code).

👉 Together, these ensure memory is managed efficiently and safely.

---

## **5. What is JIT compiler?**

* **JIT (Just-In-Time) Compiler** is part of JVM’s execution engine.
* Normally, JVM **interprets** bytecode instruction by instruction → slower.
* JIT detects frequently executed bytecode (“hotspot methods”) and compiles them into **native machine code at runtime** → much faster execution.

### Types of JIT Compilers in JVM:

* **Client Compiler (C1):** Optimized for faster startup.
* **Server Compiler (C2):** Optimized for long-running applications.

👉 Without JIT, Java would be as slow as pure interpreted languages like Python.

---

## **6. How Java platform is different from other platforms?**

* Other languages (like C, C++):

  * Compile source → machine code → runs directly on **OS-specific hardware**.
  * Hence platform-dependent (Windows binary won’t run on Linux).

* Java:

  * Compile source → **bytecode** → runs on JVM → JVM is OS-dependent, but bytecode isn’t.
  * Write once → run anywhere (as long as JVM exists for that platform).

👉 JVM acts as a **bridge** between your code and OS.

---

## **7. Why people say that Java is ‘write once and run anywhere’ language?**

* Java source code (`.java`) → compiled into **bytecode (`.class`)**.
* Bytecode is **platform-independent**.
* Any system with a **JVM implementation** (Windows/Linux/Mac/Android) can run the bytecode.

Example:

* You compile on Windows → generate `Program.class`.
* Copy it to Linux/Mac → run with JVM installed → works the same.

👉 Unlike C/C++ (recompile for each OS), Java doesn’t need recompilation.

---

## **8. How does ClassLoader work in Java?**

* **ClassLoader** is part of JVM responsible for **loading classes dynamically at runtime**.
* Classes aren’t loaded into memory until required (lazy loading).

### **Types of ClassLoaders:**

1. **Bootstrap ClassLoader**

   * Loads Java core libraries (`rt.jar`, `java.lang.*`).
2. **Extension ClassLoader**

   * Loads classes from extension directories (`javax.*`).
3. **Application (System) ClassLoader**

   * Loads classes from user’s classpath (project `.class` files).

### **How it works?**

* **Parent Delegation Model:**

  * A ClassLoader first asks its parent to load the class.
  * If parent can’t find it, only then it tries to load.

👉 This prevents core Java classes from being overridden by user classes.

---

## **9. Do you think ‘main’ used for main method is a keyword in Java?**

* **No.**
* `main` is just a **method name** defined by convention.
* JVM specifically looks for a method with signature:

  ```java
  public static void main(String[] args)
  ```
* It’s not a keyword; you can have another method like:

  ```java
  public void main(int x) {}
  ```
* But **only the standard `main(String[] args)` is entry point** for JVM.

---

## **10. Can we write main method as `public void static` instead of `public static void`?**

* **No.**
* Java compiler expects **modifiers in a particular order**.
* Correct order:

  ```java
  public static void main(String[] args)
  ```
* If you write:

  ```java
  public void static main(String[] args) {}
  ```

  → Compilation error.

👉 `public` = accessible everywhere,
👉 `static` = called without creating object,
👉 `void` = doesn’t return anything.

The **order matters** because Java language grammar defines it that way.
