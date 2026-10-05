# Encapsulation -- Complete Coverage Overview : To Read in Preview Mode: CTRL+SHIFT+V

This folder contains a single self-contained demo project covering **Encapsulation** --
one of the four pillars of Object-Oriented Programming -- comprehensively for interviews and practice.

**Structure**: `src/Main.java` entry point + 5 sub-packages grouping related concepts.

---

## What's Covered (Concept-by-File Table)

### Package: `basics/` -- Core Encapsulation

| Concept | File(s) |
|---------|---------|
| What is encapsulation (data hiding + bundling + controlled access) | `EncapsulationBasicsDemo.java` |
| Private fields + public getters/setters (classic pattern) | `BankAccount.java` |
| Validation in setters and business methods | `BankAccount.java` |
| Why public fields are bad (no protection, no validation) | `EncapsulationBasicsDemo.java` |
| Read-only fields (getter only, no setter) | `BankAccount.java` |
| Encapsulation vs Information Hiding (interview distinction) | `EncapsulationBasicsDemo.java` |
| Business methods instead of raw setters (deposit/withdraw) | `BankAccount.java` |

### Package: `getters/` -- Getter/Setter Patterns

| Concept | File(s) |
|---------|---------|
| Boolean getter convention (`isActive()` not `getActive()`) | `Employee.java` |
| Computed / derived property (no backing field) | `Employee.java` |
| Fluent setters (return `this` for chaining) | `Employee.java` |
| Write-only field (setter but no getter -- password) | `Employee.java` |
| Mutable return problem (returning raw internal list) | `MutableReturnDemo.java` |
| Defensive copy in getter (`Collections.unmodifiableList`) | `Employee.java`, `MutableReturnDemo.java` |
| Defensive copy in setter (`new ArrayList<>(input)`) | `Employee.java`, `GetterSetterDemo.java` |
| Caller modifying returned reference corrupts internal state | `MutableReturnDemo.java` |

### Package: `beans/` -- JavaBeans & Records

| Concept | File(s) |
|---------|---------|
| JavaBeans convention (no-arg ctor, get/set/is, Serializable) | `UserBean.java` |
| Why frameworks require JavaBeans (Spring, Hibernate, Jackson) | `JavaBeansDemo.java` |
| Records (Java 16+): concise immutable data carriers | `RecordVsBeanDemo.java` |
| Record auto-generates: constructor, getters, equals, hashCode, toString | `RecordVsBeanDemo.java` |
| Compact constructor with validation | `RecordVsBeanDemo.java` |
| Records are implicitly final (cannot extend) | `RecordVsBeanDemo.java` |
| Custom methods in records | `RecordVsBeanDemo.java` |
| Record vs Bean comparison (trade-offs table) | `RecordVsBeanDemo.java` |

### Package: `design/` -- Design Principles

| Concept | File(s) |
|---------|---------|
| Law of Demeter / Principle of Least Knowledge | `LawOfDemeterDemo.java` |
| "Tell, Don't Ask" principle | `LawOfDemeterDemo.java` |
| Getter chain "train wreck" anti-pattern | `LawOfDemeterDemo.java` |
| Delegation as alternative to getter chains | `LawOfDemeterDemo.java` |
| Anti-pattern: public fields (no encapsulation) | `AntiPatternDemo.java` |
| Anti-pattern: anemic domain model vs rich domain model | `AntiPatternDemo.java` |
| Breaking encapsulation via Reflection (`setAccessible`) | `AntiPatternDemo.java` |
| Tight encapsulation: minimal public API | `TightEncapsulationDemo.java` |
| Information hiding: change internals without breaking callers | `TightEncapsulationDemo.java` |
| `final` class preventing subclass breaking encapsulation | `TightEncapsulationDemo.java` |
| Package-private classes for internal helpers | `TightEncapsulationDemo.java` |

### Package: `collections/` -- Encapsulating Collections

| Concept | File(s) |
|---------|---------|
| Unsafe: returning raw internal list | `CollectionEncapsulationDemo.java` |
| Safe: returning `Collections.unmodifiableList()` | `Classroom.java` |
| `Collections.unmodifiableList()` vs `List.copyOf()` vs `List.of()` | `CollectionEncapsulationDemo.java` |
| Defensive copy with `new ArrayList<>(list)` | `CollectionEncapsulationDemo.java` |
| Controlled mutation via `addStudent()` / `removeStudent()` | `Classroom.java` |
| Validation in mutation methods (duplicates, blanks) | `Classroom.java` |

---

## Audit Summary

| Metric | Value |
|--------|-------|
| Total Java files | 12 |
| Total concepts covered | 38 |
| "Won't compile" commented lines | 15+ |
| Sub-packages | 5 |
| README quality | Comprehensive |

---

## How to Compile and Run

```powershell
cd encapsulation
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)
java -cp out Main
```

---

## What to Learn Next (Building on Encapsulation)

These advanced topics extend the encapsulation concepts covered here:

- **Inheritance** -- how encapsulation interacts with `extends` (protected vs private fields, breaking Liskov)
- **Polymorphism** -- encapsulating behavior behind interfaces, strategy pattern
- **Abstraction** -- abstract classes and interfaces as encapsulation boundaries
- **Design Patterns** -- Builder (encapsulate construction), Factory (encapsulate creation), Facade (encapsulate subsystems)
- **SOLID Principles** -- especially Single Responsibility and Interface Segregation
- **Java Module System (JPMS)** -- module-level encapsulation with `exports` / `opens`
- **Sealed Classes (Java 17+)** -- controlling who can extend your classes
- **Immutability Deep Dive** -- already covered in `basics/final-keyword-demo` and `basics/class-objects-demo`
