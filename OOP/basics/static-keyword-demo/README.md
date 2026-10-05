# Java Static Keyword Demo : To Read readme file in Preview Mode: CTRL+SHIFT+V

The `static` keyword in Java means "belongs to the class itself, not to any particular instance."
This project demonstrates every use of `static` through runnable examples:

- **`static` field** -- belongs to the class, shared by all instances
- **`static` method** -- called on the class, no object needed, cannot access instance members
- **`static` block** -- runs once when the class is loaded, used for one-time initialization
- **`static` nested class** -- does not need an instance of the outer class
- **`static` import** -- use static members without the class name prefix
- **Why `main()` is static** -- JVM entry point without object creation
- **Static method hiding** -- not overriding; resolved by reference type at compile time
- **Static binding vs dynamic binding** -- static methods use static binding, instance methods use dynamic binding
- **Static methods do NOT participate in polymorphism**
- **`super` restriction in static context** -- cannot use `this` or `super` in static methods
- **Singleton pattern** -- eager, lazy, and Bill Pugh (static holder) implementations using `static`
- **Static factory methods** -- `of()`, `valueOf()`, `getInstance()` as alternatives to constructors
- **Static methods in interfaces (Java 8+)** -- NOT inherited by implementing classes
- **Multiple static blocks** -- execute in textual (top-to-bottom) order
- **Class loading order across inheritance** -- parent static → child static → parent instance → parent constructor → child instance → child constructor
- **`static final` constants** -- naming convention: `UPPER_SNAKE_CASE`
- **Static and serialization** -- static fields are NOT serialized
- **Thread safety of static fields** -- shared across all threads; need synchronization
- **Memory model** -- static members live in Method Area (Java 8+: Metaspace)

---

## Folder structure

```
static-keyword-demo/
├── README.md
├── src/
│   ├── Main.java                             ← entry point (also shows static import)
│   ├── fields/
│   │   ├── Counter.java                      ← shared static state across instances
│   │   ├── StaticFieldDemo.java              ← demonstrates static vs instance fields
│   │   └── SingletonDemo.java                ← singleton pattern variants & static final constants
│   ├── methods/
│   │   ├── MathHelper.java                   ← utility class with only static methods
│   │   ├── StaticMethodDemo.java             ← demonstrates static method usage & restrictions
│   │   ├── StaticHidingDemo.java             ← static method hiding vs instance method overriding
│   │   └── StaticFactoryDemo.java            ← static factory methods & interface static methods
│   ├── blocks/
│   │   ├── DatabaseConfig.java               ← static block + instance block + constructor order
│   │   ├── StaticBlockDemo.java              ← demonstrates initialization order
│   │   └── StaticInheritanceOrderDemo.java   ← class loading order across inheritance
│   └── nested/
│       ├── OuterClass.java                   ← static nested class vs non-static inner class
│       └── StaticNestedDemo.java             ← demonstrates creation & access differences
└── out/                                      ← compiled .class files (generated)
```

---

## Source files

| File | What it teaches |
|------|----------------|
| `Main.java` | Entry point. Uses a **static import** (`import static methods.MathHelper.add`) so `add()` can be called without the class name. |
| `fields/Counter.java` | A `static int count` field shared by every `Counter` instance, plus a per-instance `id`. Shows that `static` = one copy for the whole class. |
| `fields/StaticFieldDemo.java` | Creates multiple `Counter` objects and prints how `count` is shared while `id` differs. Also compares accessing a static method via the class name vs. via an object reference. |
| `fields/SingletonDemo.java` | Three singleton variants — **eager** (simple, thread-safe, always created), **lazy** (created on first use, not thread-safe), and **Bill Pugh / static holder** (lazy + thread-safe, recommended). Also demonstrates `static final` constants with `UPPER_SNAKE_CASE` naming convention. |
| `methods/MathHelper.java` | A utility class with a **private constructor** and only static methods (`add`, `multiply`, `isPrime`). Contains commented-out lines that demonstrate what **won't compile** inside a static method (using `this`, accessing instance fields). |
| `methods/StaticMethodDemo.java` | Calls `MathHelper` methods without creating an instance. Explains why `main()` must be static. |
| `methods/StaticHidingDemo.java` | Demonstrates that **static methods are hidden, not overridden** in subclasses. Compares **static binding** (compile-time, reference type) vs **dynamic binding** (runtime, object type / polymorphism). Shows that `this` and `super` cannot be used in a static context. |
| `methods/StaticFactoryDemo.java` | **Static factory methods** (`of()`, `valueOf()`) as alternatives to constructors — descriptive names, caching, subtype return. Also shows **static methods in interfaces** (Java 8+) which are NOT inherited by implementing classes, and **multiple static blocks** executing in textual order. |
| `blocks/DatabaseConfig.java` | Has a **static block**, an **instance initializer block**, and a **constructor**. Prints messages from each to show the execution order. |
| `blocks/StaticBlockDemo.java` | Creates two `DatabaseConfig` objects. The static block fires only on the first creation; the instance block and constructor fire every time. |
| `blocks/StaticInheritanceOrderDemo.java` | Demonstrates **class loading order across inheritance**: parent static → child static → parent instance → parent constructor → child instance → child constructor. Static blocks run once; instance blocks and constructors run per object. Also covers **static & serialization** (static fields are NOT serialized), **thread safety of static fields**, and the **memory model** (Method Area / Metaspace vs Heap vs Stack). |
| `nested/OuterClass.java` | Contains a **static nested class** (`StaticNested`) and a **non-static inner class** (`Inner`). Commented-out lines show that the static nested class cannot access outer instance fields. |
| `nested/StaticNestedDemo.java` | Creates both nested types and compares their instantiation syntax and access capabilities. |

---

## How to compile + run (PowerShell)

```powershell
cd static-keyword-demo

# Compile all .java files into the out/ directory
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)

# Run the program
java -cp out Main
```

---

## What to look at

Several files contain **commented-out lines** that intentionally would not compile.
Look for comments starting with `// WON'T COMPILE:` — they highlight restrictions
the compiler enforces around `static`:

- **`MathHelper.java`** — using `this` or accessing an instance field from a static method
- **`OuterClass.java`** — accessing an outer instance field from a static nested class
- **`StaticHidingDemo.java`** — using `super` or `this` inside a static method
- **`StaticFactoryDemo.java`** — calling interface static methods on an implementing class (not inherited)

Try uncommenting them to see the actual compiler errors!

---

## Concept summary

| Concept | Key point |
|---------|-----------|
| Static field | One copy per class, shared by all instances |
| Static method | No `this`/`super`, cannot access instance members |
| Static block | Runs once on class load, top-to-bottom order |
| Static nested class | No reference to enclosing instance |
| Static import | Use static members without class prefix |
| Static method hiding | Static methods are **hidden** (not overridden) in subclasses — resolved by **reference type** at compile time |
| Static vs dynamic binding | Static binding (compile-time): static/private/final methods. Dynamic binding (runtime): instance methods (polymorphism) |
| Polymorphism limitation | Static methods do **NOT** participate in polymorphism |
| `this`/`super` restriction | Cannot use `this` or `super` in a static context |
| Singleton pattern | Eager, lazy, and Bill Pugh (static holder) — all use `static` for the single instance |
| Static factory methods | `of()`, `valueOf()`, `getInstance()` — named constructors with caching & subtype flexibility |
| Interface static methods | Java 8+; NOT inherited by implementing classes |
| Multiple static blocks | Execute in textual (top-to-bottom) order within a class |
| Inheritance loading order | Parent static → child static → parent instance → parent constructor → child instance → child constructor |
| `static final` constants | Convention: `UPPER_SNAKE_CASE` (e.g. `MAX_CONNECTIONS`) |
| Static & serialization | Static fields are NOT serialized (belong to class, not object) |
| Thread safety | Static fields shared across all threads — need `synchronized`, `volatile`, or `Atomic*` |
| Memory model | Static → Method Area (Metaspace); Instance → Heap; Local → Stack |
