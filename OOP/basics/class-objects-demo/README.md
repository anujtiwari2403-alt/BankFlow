# Java Classes & Objects Demo : To Read readme file in Preview Mode: CTRL+SHIFT+V

This mini-project demonstrates the fundamentals of **classes and objects** in Java:

- **Class definition** — fields, methods, constructors, `toString()`
- **Object creation** — using `new`, default vs. parameterized constructors
- **Constructor overloading & chaining** — multiple constructors delegating to a master via `this(...)`
- **Copy constructor** — shallow vs deep copy, cloning mutable reference fields
- **The `this` keyword** — all 4 uses: field disambiguation, constructor chaining, passing `this` as argument, returning `this` for fluent API / builder pattern
- **Builder pattern** — fluent API using `return this`
- **Method overloading** — same method name, different parameter types/counts
- **Varargs (variable arguments)** — `int...` syntax, rules, overloading precedence
- **References & pass-by-value** — Java passes the *value* of the reference, not the object itself
- **Anonymous objects** — creating objects without assigning them to a variable
- **`final` fields (blank finals)** — assigned once in the constructor, immutable afterward
- **`equals()` and `hashCode()`** — proper override, contract between them, `==` vs `.equals()` (reference vs content equality)
- **String pool and `intern()`** — how literal strings are pooled, `new String()` vs literal
- **Integer cache** — `-128` to `127` caching gotcha with `==`
- **`instanceof` operator** — runtime type checking, null safety
- **Wrapper classes & autoboxing/unboxing** — all 8 primitive-wrapper pairs, `parseInt` vs `valueOf`, null unboxing danger
- **Immutable object pattern** — complete 5-step recipe (final class, private final fields, no setters, defensive copies)
- **Instance initializer blocks** — execution order relative to constructors
- **Object class methods** — all 11 methods (`toString`, `equals`, `hashCode`, `getClass`, `clone`, `finalize`, `wait`, `notify`, `notifyAll`)
- **Garbage collection eligibility** — null, reassignment, scope, island of isolation

## Folder structure (as in this project)

```
class-objects-demo/
├─ README.md
├─ out/
│  ├─ Main.class
│  ├─ basics/
│  │  ├─ Student.class
│  │  ├─ BasicDemo.class
│  │  ├─ CopyConstructorDemo.class
│  │  ├─ EqualsHashCodeDemo.class
│  │  └─ ThisKeywordDemo.class
│  ├─ constructors/
│  │  ├─ Book.class
│  │  └─ ConstructorDemo.class
│  ├─ methods/
│  │  ├─ Calculator.class
│  │  ├─ MethodDemo.class
│  │  └─ VarargsDemo.class
│  └─ references/
│     ├─ PassByValueDemo.class
│     ├─ PassByValueDemo$Box.class
│     ├─ AnonymousObjectDemo.class
│     ├─ WrapperAutoboxingDemo.class
│     ├─ ImmutableObjectDemo.class
│     └─ ObjectClassMethodsDemo.class
└─ src/
   ├─ Main.java
   ├─ basics/
   │  ├─ Student.java
   │  ├─ BasicDemo.java
   │  ├─ CopyConstructorDemo.java
   │  ├─ EqualsHashCodeDemo.java
   │  └─ ThisKeywordDemo.java
   ├─ constructors/
   │  ├─ Book.java
   │  └─ ConstructorDemo.java
   ├─ methods/
   │  ├─ Calculator.java
   │  ├─ MethodDemo.java
   │  └─ VarargsDemo.java
   └─ references/
      ├─ PassByValueDemo.java
      ├─ AnonymousObjectDemo.java
      ├─ WrapperAutoboxingDemo.java
      ├─ ImmutableObjectDemo.java
      └─ ObjectClassMethodsDemo.java
```

## Source files

- **`src/Main.java`**
  - **What it does**: Entry point that calls every demo class in order with section headers.
  - **Demonstrates**: How to import classes from sub-packages and organize a multi-file project.

- **`src/basics/Student.java`**
  - **What it does**: Defines a `Student` class with `name`, `age`, and `grade` fields.
  - **Demonstrates**: Private fields, default & parameterized constructors, getters/setters, `toString()` override, `displayInfo()` method.

- **`src/basics/BasicDemo.java`**
  - **What it does**: Creates students using both constructors, modifies one with setters, and shows object aliasing.
  - **Demonstrates**: Object creation, default values set by our constructor, mutating objects via setters, two references pointing to the same object (aliasing).

- **`src/basics/CopyConstructorDemo.java`**
  - **What it does**: Defines `Address` and `Person` classes with both shallow and deep copy constructors, then shows how mutations propagate differently.
  - **Demonstrates**: Copy constructor pattern, shallow copy (shared references), deep copy (cloned nested objects), why deep copy is safer for mutable fields.

- **`src/basics/EqualsHashCodeDemo.java`**
  - **What it does**: Defines a `Point` class with proper `equals()` and `hashCode()` overrides, then compares objects using `==` and `.equals()`.
  - **Demonstrates**: `==` vs `.equals()` (reference vs content equality), `hashCode()` contract, `instanceof` operator, String pool and `intern()`, Integer cache (`-128` to `127`) gotcha.

- **`src/basics/ThisKeywordDemo.java`**
  - **What it does**: Shows all 4 uses of `this` with an `EmailBuilder` (fluent API) and an `EventSource`/`EventListener` pair.
  - **Demonstrates**: `this` for field disambiguation, constructor chaining (`this(...)`), passing `this` as a method argument, returning `this` for method chaining (builder pattern).

- **`src/constructors/Book.java`**
  - **What it does**: Defines a `Book` class with 5 overloaded constructors that chain to a single master constructor.
  - **Demonstrates**: Constructor overloading, constructor chaining with `this(...)`, `final` (blank final) field `isbn` that must be assigned exactly once.

- **`src/constructors/ConstructorDemo.java`**
  - **What it does**: Creates `Book` objects using each overloaded constructor and prints them.
  - **Demonstrates**: How each shorter constructor delegates to the master constructor, keeping field-assignment logic in one place.

- **`src/methods/Calculator.java`**
  - **What it does**: Provides overloaded `add()` and `multiply()` static methods.
  - **Demonstrates**: Method overloading by parameter type (`int` vs `double`) and by parameter count (2 vs 3 args). Includes a commented-out example showing that overloading by return type alone won't compile.

- **`src/methods/MethodDemo.java`**
  - **What it does**: Calls every `Calculator` method and prints results with labels.
  - **Demonstrates**: How Java resolves overloaded method calls based on argument types and count.

- **`src/methods/VarargsDemo.java`**
  - **What it does**: Defines `sum()` and `formatList()` varargs methods, shows calling with different argument counts, arrays, and overloading interactions.
  - **Demonstrates**: Varargs syntax (`int...`), rules (must be last, only one allowed), internal array representation, passing arrays directly, overloading precedence (exact match wins over varargs).

- **`src/references/PassByValueDemo.java`**
  - **What it does**: Passes object references and primitives to methods that try to modify them.
  - **Demonstrates**: Java is always pass-by-value — the *value of the reference* is copied, so object mutation is visible to the caller but reference reassignment is not. Primitives are completely independent copies.

- **`src/references/AnonymousObjectDemo.java`**
  - **What it does**: Creates `Student` objects without storing them in a variable.
  - **Demonstrates**: Anonymous objects in `println`, as method arguments, and with method chaining. Shows that without a variable, the object can't be reused.

- **`src/references/WrapperAutoboxingDemo.java`**
  - **What it does**: Shows autoboxing/unboxing between primitives and wrapper classes, null unboxing danger, Integer cache, and `parseInt` vs `valueOf`.
  - **Demonstrates**: All 8 primitive-wrapper pairs, autoboxing (`int` -> `Integer`), unboxing (`Integer` -> `int`), `NullPointerException` from null unboxing, Integer cache `-128` to `127`, `parseInt()` vs `valueOf()`.

- **`src/references/ImmutableObjectDemo.java`**
  - **What it does**: Builds a complete immutable class (`ImmutableStudent`) with defensive copies, and shows instance initializer block execution order and GC eligibility rules.
  - **Demonstrates**: Immutable object recipe (final class, private final fields, no setters, defensive copy in constructor, unmodifiable view in getter), instance initializer blocks (run before every constructor), garbage collection eligibility (null, reassignment, scope, island of isolation).

- **`src/references/ObjectClassMethodsDemo.java`**
  - **What it does**: Defines `MyObject` implementing `Cloneable`, overrides `toString`, `equals`, `hashCode`, `clone`, and explains all 11 `Object` class methods.
  - **Demonstrates**: All 11 methods of `java.lang.Object` (`toString`, `equals`, `hashCode`, `getClass`, `clone`, `finalize`, `wait`, `notify`, `notifyAll`), `getClass()` vs `instanceof`, proper `clone()` implementation.

## How to compile + run (PowerShell)

From this folder (`class-objects-demo`):

```bash
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)
java -cp out Main
```

## What to look at

- In `Calculator.java`, the commented-out `multiply(int, int)` returning `double` shows that **overloading by return type alone won't compile**.
- In `Book.java`, the commented-out `setIsbn()` shows that **final fields cannot be reassigned** after construction.
- `PassByValueDemo` is the key file for understanding Java's pass-by-value semantics — compare `modifyContent()` (visible change) with `reassignReference()` (no visible change).
- `CopyConstructorDemo` clearly shows the difference between **shallow and deep copy** — mutating the shallow copy's address also changes the original.
- `EqualsHashCodeDemo` covers the most common Java pitfalls: `==` vs `.equals()`, String pool, and Integer cache.
- `ImmutableObjectDemo` gives the complete **5-step recipe** for making a class truly immutable, including defensive copies for mutable fields.
- `ObjectClassMethodsDemo` is a reference for all **11 methods** every Java object inherits.
