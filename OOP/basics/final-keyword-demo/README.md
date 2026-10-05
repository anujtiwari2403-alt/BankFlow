# Java Final Keyword Demo : To Read readme file in Preview Mode: CTRL+SHIFT+V

This project demonstrates every use of the **`final`** keyword in Java:

- **`final` variable** — value or reference is assigned once and cannot be reassigned
- **`final` method** — cannot be overridden by subclasses
- **`final` class** — cannot be extended / subclassed
- **`final` parameter** — method parameter cannot be reassigned inside the method body
- **`final` reference** — the reference is locked, but the object it points to can still be modified
- **`final` with arrays** — reference is locked, but array elements can be changed
- **`final` in enhanced for loop** — prevents accidental reassignment of the loop variable
- **Compile-time constants** — `static final` primitives/Strings inlined by the compiler; usable in `switch`
- **`final` vs `finally` vs `finalize`** — the #1 interview question about `final`
- **Effectively final & lambdas** — lambdas/anonymous classes require final or effectively-final variables
- **`final` in anonymous inner classes** — same rule as lambdas for captured variables
- **Blank final with multiple constructors** — every constructor must assign the blank final field
- **`final` in try-with-resources (Java 9+)** — effectively-final variables can be used directly
- **JMM thread safety guarantees** — final fields are safely published after constructor completion
- **Why `String` is final** — security, String pool, hashCode caching, thread safety
- **Complete immutable class recipe** — defensive copies in constructor + unmodifiable views in getters
- **`final` and JVM performance** — method inlining, constant folding, optimized dispatch

---

## Folder structure

```
final-keyword-demo/
├── README.md
├── src/
│   ├── Main.java                                # Entry point — calls every demo
│   ├── variables/
│   │   ├── FinalVariableDemo.java               # final local, blank-final field, static final
│   │   ├── FinalReferenceDemo.java              # final reference vs. mutable object
│   │   ├── FinalArrayDemo.java                  # final arrays, enhanced for, compile-time constants
│   │   └── FinalVsFinallyVsFinalizeDemo.java    # final vs finally vs finalize
│   ├── methods/
│   │   ├── Parent.java                          # Base class with a final method
│   │   ├── Child.java                           # Subclass — overrides allowed & blocked
│   │   └── FinalMethodDemo.java                 # Runs the method-override demo
│   └── classes/
│       ├── ImmutableConfig.java                 # A final class (cannot be extended)
│       ├── FinalClassDemo.java                  # Shows using vs. extending a final class
│       ├── FinalParameterDemo.java              # final parameters (String & primitive)
│       ├── FinalLambdaDemo.java                 # Effectively final, lambdas, anonymous classes
│       └── FinalThreadSafetyDemo.java           # Thread safety, immutability, performance
└── out/                                         # Compiled .class files (generated)
```

---

## Source files

| File | What it teaches |
|------|----------------|
| `Main.java` | Entry point that calls every demo in sequence |
| `variables/FinalVariableDemo.java` | Three kinds of final variables: local, blank-final instance field, and `static final` constant |
| `variables/FinalReferenceDemo.java` | A final reference prevents reassignment but the object itself can still be mutated |
| `variables/FinalArrayDemo.java` | `final` with arrays (reference locked, elements mutable), `final` in enhanced for loop, compile-time constants (`static final`), and `switch` with constants |
| `variables/FinalVsFinallyVsFinalizeDemo.java` | `final` vs `finally` vs `finalize()` — the #1 interview question; covers all three with examples and a summary table |
| `methods/Parent.java` | Declares a `final` method (`connect()`) alongside normal overridable methods |
| `methods/Child.java` | Extends Parent — successfully overrides two methods; commented-out override of the final method |
| `methods/FinalMethodDemo.java` | Creates a Child and shows which calls come from Parent vs. Child |
| `classes/ImmutableConfig.java` | A `final` class with all-final fields — a typical immutable value object |
| `classes/FinalClassDemo.java` | Uses `ImmutableConfig` and shows the commented-out attempt to extend it |
| `classes/FinalParameterDemo.java` | Demonstrates `final` on method parameters (String and int) |
| `classes/FinalLambdaDemo.java` | Effectively final variables in lambdas, explicitly final in lambdas, anonymous inner classes, `final` in try-with-resources (Java 9+), blank final with multiple constructors |
| `classes/FinalThreadSafetyDemo.java` | JMM thread safety guarantees for final fields, why `String` is final (security, pool, hashCode, thread safety), complete immutable class with defensive copies, `final` and JVM performance optimizations |

---

## How to compile + run (PowerShell)

```powershell
cd final-keyword-demo

# Compile all .java files into the out/ directory
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)

# Run the program
java -cp out Main
```

---

## What to look at

Every demo file contains **commented-out lines** that would cause a compile error if
uncommented. Look for the pattern:

```java
// WON'T COMPILE: <reason>
// <illegal code here>
```

Try uncommenting them one at a time, recompile, and read the compiler error message.
This is the fastest way to understand what `final` actually prevents.

---

## Concept summary

| Concept | Key point |
|---------|-----------|
| `final` variable | Assigned once, cannot be reassigned |
| `final` reference | Reference locked; the object it points to can still be mutated |
| `final` with arrays | Reference locked, but array elements can be changed freely |
| `final` in enhanced for | Loop variable is re-declared each iteration; `final` prevents reassignment inside the body |
| Compile-time constants | `static final` primitive/String initialized at declaration; inlined by the compiler; usable in `switch` |
| `final` method | Cannot be overridden by subclasses |
| `final` class | Cannot be extended (e.g., `String`, `Integer`, wrapper types) |
| `final` parameter | Cannot be reassigned inside the method body |
| `final` vs `finally` vs `finalize` | keyword vs try-catch block vs deprecated GC callback — the #1 interview question |
| Effectively final (Java 8+) | A variable never reassigned after init; no `final` keyword needed; required by lambdas/anonymous classes |
| `final` in lambdas | Captured variables from enclosing scope must be final or effectively final |
| `final` in anonymous inner classes | Same rule as lambdas — captured outer variables must be final or effectively final |
| Blank final + multiple constructors | Every constructor path must assign the blank final field, or it won't compile |
| `final` in try-with-resources (Java 9+) | Effectively-final variables can be used directly in `try(resource)` without re-declaration |
| JMM thread safety | Final fields are guaranteed visible to all threads after the constructor completes — no synchronization needed |
| Why `String` is final | Security (class loading, file paths), String pool safety, hashCode caching, inherent thread safety |
| Immutable class recipe | `final` class + `private final` fields + defensive copies in constructor + unmodifiable views in getters |
| `final` and performance | Method inlining, constant folding, optimized virtual dispatch; modern JVMs are smart but `final` makes intent explicit |
