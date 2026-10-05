# Java Basics -- Complete Coverage Overview : To Read in Preview Mode: CTRL+SHIFT+V

This folder contains **4 self-contained demo projects** covering the foundational Java topics
every developer must know for interviews and day-to-day coding.

Each project follows the same structure:
- `README.md` -- full topic explanation, folder tree, per-file description
- `src/Main.java` -- entry point that runs all demos sequentially
- Sub-packages under `src/` grouping related concepts
- Commented-out `// WON'T COMPILE:` lines showing what the compiler rejects and why
- PowerShell compile/run instructions

---

## Projects at a Glance

| # | Folder | Files | Core Topic |
|---|--------|-------|------------|
| 1 | `access-modifiers-demo/` | 9 Java + README | `public`, `protected`, default, `private` on fields, methods, constructors, classes, interfaces, enums |
| 2 | `class-objects-demo/` | 15 Java + README | Classes, objects, constructors, `this`, `equals`/`hashCode`, wrappers, immutability, Object methods |
| 3 | `final-keyword-demo/` | 13 Java + README | `final` variables, methods, classes, parameters, arrays, lambdas, thread safety, immutability |
| 4 | `static-keyword-demo/` | 12 Java + README | `static` fields, methods, blocks, nested classes, singleton, factory methods, inheritance order |

**Total: 49 Java source files + 4 READMEs**

---

## What's Covered in Each Folder

### 1. Access Modifiers (`access-modifiers-demo/`)

| Concept | File(s) |
|---------|---------|
| All 4 modifiers on fields and methods | `AccessBase.java` |
| Same-package access (public/protected/default work, private doesn't) | `SamePackageTest.java` |
| Cross-package non-subclass access (only public works) | `OtherPackageTest.java` |
| Cross-package subclass access (public + protected via inheritance) | `SubClassInOtherPackage.java` |
| Protected via subclass-typed ref vs base-typed ref (subtle rule) | `SubClassInOtherPackage.java` |
| Private encapsulation via public wrappers | `AccessBase.java` |
| Access modifiers on constructors (private/protected/default/public) | `ConstructorAccessDemo.java` |
| Private constructor use cases (singleton, utility, factory) | `ConstructorAccessDemo.java` |
| Method override access rules (widen OK, narrow fails) | `OverrideAccessRulesDemo.java` |
| Access hierarchy: `private < default < protected < public` | `OverrideAccessRulesDemo.java` |
| Interface methods implicitly public | `InterfaceAccessDemo.java` |
| Interface fields implicitly `public static final` | `InterfaceAccessDemo.java` |
| Default methods (Java 8+) | `InterfaceAccessDemo.java` |
| Static methods in interfaces (Java 8+, NOT inherited) | `InterfaceAccessDemo.java` |
| Private methods in interfaces (Java 9+) | `InterfaceAccessDemo.java` |
| Multiple classes in one file (only one public, must match filename) | `InterfaceAccessDemo.java` |
| Default-access (package-private) top-level class | `PackagePrivateHelper` in `InterfaceAccessDemo.java` |
| Abstract class method modifiers (cannot be `private abstract`) | `AbstractEnumInnerAccessDemo.java` |
| Enum constructor is implicitly private | `AbstractEnumInnerAccessDemo.java` |
| Inner class accesses ALL outer members including private | `AbstractEnumInnerAccessDemo.java` |
| Static nested class accesses only outer static members | `AbstractEnumInnerAccessDemo.java` |
| Nested class modifiers (all 4 allowed, unlike top-level) | `AbstractEnumInnerAccessDemo.java` |

---

### 2. Classes & Objects (`class-objects-demo/`)

| Concept | File(s) |
|---------|---------|
| Class definition (fields, methods, constructors) | `Student.java` |
| Object creation with `new` | `BasicDemo.java` |
| Default vs parameterized constructors | `Student.java` |
| Constructor overloading (5 variants) | `Book.java` |
| Constructor chaining with `this(...)` | `Book.java` |
| Blank final field assigned in constructor | `Book.java` |
| Copy constructor (shallow vs deep copy) | `CopyConstructorDemo.java` |
| `Cloneable` and `clone()` overview | `CopyConstructorDemo.java` |
| `equals()` and `hashCode()` override | `EqualsHashCodeDemo.java` |
| `equals()`/`hashCode()` contract | `EqualsHashCodeDemo.java` |
| `==` vs `.equals()` (reference vs content equality) | `EqualsHashCodeDemo.java` |
| String pool and `intern()` | `EqualsHashCodeDemo.java` |
| Integer cache (`-128` to `127`) gotcha | `EqualsHashCodeDemo.java` |
| `instanceof` operator | `EqualsHashCodeDemo.java` |
| `this` -- field disambiguation | `Student.java`, `ThisKeywordDemo.java` |
| `this` -- constructor chaining | `Book.java`, `ThisKeywordDemo.java` |
| `this` -- passing current object as argument | `ThisKeywordDemo.java` |
| `this` -- returning current object (fluent API / builder) | `ThisKeywordDemo.java` |
| Method overloading (by type and count) | `Calculator.java` |
| Overloading by return type alone won't compile | `Calculator.java` |
| Varargs syntax, rules, array pass-through | `VarargsDemo.java` |
| Varargs overloading precedence | `VarargsDemo.java` |
| Pass-by-value of references | `PassByValueDemo.java` |
| Pass-by-value of primitives | `PassByValueDemo.java` |
| Anonymous objects | `AnonymousObjectDemo.java` |
| Wrapper classes (all 8 pairs) | `WrapperAutoboxingDemo.java` |
| Autoboxing and unboxing | `WrapperAutoboxingDemo.java` |
| Null unboxing NullPointerException | `WrapperAutoboxingDemo.java` |
| `parseInt()` vs `valueOf()` | `WrapperAutoboxingDemo.java` |
| Immutable object pattern (complete 5-step recipe) | `ImmutableObjectDemo.java` |
| Defensive copies in constructor and getter | `ImmutableObjectDemo.java` |
| Instance initializer blocks (execution order) | `ImmutableObjectDemo.java` |
| Garbage collection eligibility basics | `ImmutableObjectDemo.java` |
| All 11 Object class methods | `ObjectClassMethodsDemo.java` |
| `getClass()` vs `instanceof` | `ObjectClassMethodsDemo.java` |
| `clone()` implementation with `Cloneable` | `ObjectClassMethodsDemo.java` |
| `finalize()` deprecation | `ObjectClassMethodsDemo.java` |
| `wait()`, `notify()`, `notifyAll()` overview | `ObjectClassMethodsDemo.java` |

---

### 3. Final Keyword (`final-keyword-demo/`)

| Concept | File(s) |
|---------|---------|
| `final` local variable | `FinalVariableDemo.java` |
| Blank final instance variable (assigned in constructor) | `FinalVariableDemo.java` |
| `static final` class constant | `FinalVariableDemo.java` |
| `final` reference (reference locked, object mutable) | `FinalReferenceDemo.java` |
| `final` with arrays (reference locked, elements mutable) | `FinalArrayDemo.java` |
| `final` in enhanced for loop | `FinalArrayDemo.java` |
| Compile-time constants (`static final` inlining) | `FinalArrayDemo.java` |
| `switch` requires compile-time constants | `FinalArrayDemo.java` |
| `final` vs `finally` vs `finalize` (#1 interview question) | `FinalVsFinallyVsFinalizeDemo.java` |
| `finally` always runs, even with return | `FinalVsFinallyVsFinalizeDemo.java` |
| `finalize()` deprecated -- why and alternatives | `FinalVsFinallyVsFinalizeDemo.java` |
| `final` method (cannot override) | `Parent.java`, `Child.java` |
| `final` class (cannot extend) | `ImmutableConfig.java`, `FinalClassDemo.java` |
| `final` parameter (cannot reassign) | `FinalParameterDemo.java` |
| Effectively final (Java 8+) | `FinalLambdaDemo.java` |
| `final` / effectively final in lambdas | `FinalLambdaDemo.java` |
| `final` in anonymous inner classes | `FinalLambdaDemo.java` |
| Blank final with multiple constructors | `FinalLambdaDemo.java` |
| `final` in try-with-resources (Java 9+) | `FinalLambdaDemo.java` |
| JMM thread safety guarantees for final fields | `FinalThreadSafetyDemo.java` |
| Why `String` is final (security, pool, hashCode, thread safety) | `FinalThreadSafetyDemo.java` |
| Complete immutable class with defensive copies | `FinalThreadSafetyDemo.java` |
| `final` and JVM performance (inlining, constant folding) | `FinalThreadSafetyDemo.java` |

---

### 4. Static Keyword (`static-keyword-demo/`)

| Concept | File(s) |
|---------|---------|
| Static fields (shared across all instances) | `Counter.java`, `StaticFieldDemo.java` |
| Static methods (no object needed) | `MathHelper.java`, `StaticMethodDemo.java` |
| Static cannot use `this` | `MathHelper.java` |
| Static cannot use `super` | `StaticHidingDemo.java` |
| Why `main()` is static | `StaticMethodDemo.java` |
| Utility class pattern (private constructor + all static) | `MathHelper.java` |
| Static blocks (one-time class initialization) | `DatabaseConfig.java`, `StaticBlockDemo.java` |
| Instance block vs static block execution order | `DatabaseConfig.java` |
| Static nested class vs non-static inner class | `OuterClass.java`, `StaticNestedDemo.java` |
| Static imports | `Main.java` |
| Static method hiding (not overriding) | `StaticHidingDemo.java` |
| Static binding vs dynamic binding | `StaticHidingDemo.java` |
| Static methods do NOT participate in polymorphism | `StaticHidingDemo.java` |
| Singleton pattern (eager, lazy, Bill Pugh holder) | `SingletonDemo.java` |
| `static final` constants (`UPPER_SNAKE_CASE` convention) | `SingletonDemo.java` |
| Static factory methods (`of`, `valueOf`, `getInstance`) | `StaticFactoryDemo.java` |
| Advantages of factory methods over constructors | `StaticFactoryDemo.java` |
| Static methods in interfaces (Java 8+, NOT inherited) | `StaticFactoryDemo.java` |
| Multiple static blocks (textual order) | `StaticFactoryDemo.java` |
| Class loading order across inheritance (parent -> child) | `StaticInheritanceOrderDemo.java` |
| Static blocks run once, instance blocks run each time | `StaticInheritanceOrderDemo.java` |
| Static fields NOT serialized | `StaticInheritanceOrderDemo.java` |
| Thread safety of static fields | `StaticInheritanceOrderDemo.java` |
| Memory model (Method Area / Metaspace vs Heap vs Stack) | `StaticInheritanceOrderDemo.java` |

---

## How to Compile and Run Any Project

Open PowerShell, `cd` into the project folder, then:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)
java -cp out Main
```

---

## What to Learn Next (Advanced Topics)

The topics below build on these basics. They are **not covered here** and belong in
an `advanced/` or `intermediate/` folder:

### OOP Pillars (Intermediate)
- **Inheritance** -- `extends`, `super`, method overriding, constructor chaining across classes
- **Polymorphism** -- runtime dispatch, upcasting/downcasting, covariant return types
- **Abstraction** -- abstract classes vs interfaces, when to use which
- **Encapsulation** -- beyond getters/setters: information hiding, Law of Demeter

### Language Features (Intermediate)
- **Exception Handling** -- checked vs unchecked, try-catch-finally, custom exceptions, try-with-resources
- **Generics** -- type parameters, bounded types, wildcards (`? extends`, `? super`), type erasure
- **Collections Framework** -- `List`, `Set`, `Map`, `Queue`, iterators, `Comparable`/`Comparator`
- **Enums (advanced)** -- enum with abstract methods, enum implementing interfaces, EnumSet/EnumMap
- **Strings in depth** -- `StringBuilder`/`StringBuffer`, `String` methods, regex basics

### Modern Java (Intermediate-Advanced)
- **Lambda Expressions** -- functional interfaces, `Predicate`, `Function`, `Consumer`, `Supplier`
- **Streams API** -- `filter`, `map`, `reduce`, `collect`, parallel streams
- **Optional** -- avoiding `null`, `Optional.of`, `orElse`, `map`, `flatMap`
- **Records (Java 16+)** -- concise immutable data carriers
- **Sealed Classes (Java 17+)** -- restricting class hierarchies with `sealed`/`permits`
- **Pattern Matching** -- `instanceof` pattern (Java 16+), switch pattern (Java 21+)
- **Text Blocks (Java 15+)** -- multi-line strings with `"""`
- **var (Java 10+)** -- local variable type inference

### Design & Architecture (Advanced)
- **Design Patterns** -- Factory, Builder, Observer, Strategy, Decorator, Adapter, etc.
- **SOLID Principles** -- Single Responsibility, Open/Closed, Liskov, Interface Segregation, Dependency Inversion
- **Dependency Injection** -- constructor injection, Spring basics
- **Reflection API** -- `Class.forName`, `setAccessible`, runtime type inspection
- **Annotations** -- built-in (`@Override`, `@Deprecated`), custom annotations, retention policies
- **Java Module System (JPMS)** -- `module-info.java`, `exports`, `requires`, `opens`

### Concurrency (Advanced)
- **Threads** -- `Thread`, `Runnable`, `Callable`, thread lifecycle
- **Synchronization** -- `synchronized`, `volatile`, `Lock`, `ReentrantLock`
- **Concurrent Collections** -- `ConcurrentHashMap`, `CopyOnWriteArrayList`, `BlockingQueue`
- **ExecutorService** -- thread pools, `Future`, `CompletableFuture`
- **Atomic classes** -- `AtomicInteger`, `AtomicReference`, CAS operations

### Data & I/O (Advanced)
- **File I/O** -- `java.nio` (Path, Files), readers/writers, buffered streams
- **Serialization** -- `Serializable`, `transient`, `serialVersionUID`, custom serialization
- **JDBC** -- database connectivity, PreparedStatement, ResultSet, connection pooling
- **Networking** -- sockets, HTTP clients, REST basics

---

## Audit Summary

Each project was audited for completeness against common Java interview questions:

| Project | Concepts Covered | "Won't Compile" Examples | README Quality |
|---------|-----------------|--------------------------|----------------|
| access-modifiers-demo | 22 concepts | 30+ commented-out lines | Excellent |
| class-objects-demo | 37 concepts | 7+ commented-out lines | Excellent |
| final-keyword-demo | 23 concepts | 15+ commented-out lines | Excellent |
| static-keyword-demo | 24 concepts | 8+ commented-out lines | Excellent |
| **Total** | **106 concepts** | **60+ "won't compile" lines** | **All documented** |

Every high-frequency and medium-frequency Java interview question for these 4 topics
is covered with runnable code examples and clear explanations.
