# Java Encapsulation Demo : To Read in Preview Mode: CTRL+SHIFT+V

This project demonstrates **Encapsulation** -- one of the four pillars of Object-Oriented Programming.

Encapsulation means:
1. **Data Hiding** -- making fields `private` so outside code cannot directly access or modify them
2. **Bundling** -- grouping data (fields) and the methods that operate on that data into a single class
3. **Controlled Access** -- exposing only what's necessary through `public` getters/setters with validation

Key concepts covered:
- Private fields + public getters/setters (the classic pattern)
- Validation in setters (preventing invalid state)
- Read-only, write-only, and computed properties
- Boolean getter convention (`isActive()` vs `getActive()`)
- Mutable return problem and defensive copies
- Fluent setters (return `this` for chaining)
- JavaBeans convention (no-arg constructor, `get`/`set`/`is`, `Serializable`)
- Records (Java 16+) as modern encapsulated data carriers
- Law of Demeter / "Tell, Don't Ask" principle
- Encapsulation anti-patterns (public fields, anemic model, reflection bypass)
- Tight encapsulation (minimal public API, package-private helpers, `final` classes)
- Collection encapsulation (unmodifiable views, safe mutation methods)

## Folder Structure

```
encapsulation/
├── README.md
├── ENCAPSULATION-OVERVIEW.md
└── src/
    ├── Main.java
    ├── basics/
    │   ├── BankAccount.java
    │   └── EncapsulationBasicsDemo.java
    ├── getters/
    │   ├── Employee.java
    │   ├── MutableReturnDemo.java
    │   └── GetterSetterDemo.java
    ├── beans/
    │   ├── UserBean.java
    │   ├── RecordVsBeanDemo.java
    │   └── JavaBeansDemo.java
    ├── design/
    │   ├── LawOfDemeterDemo.java
    │   ├── AntiPatternDemo.java
    │   └── TightEncapsulationDemo.java
    └── collections/
        ├── Classroom.java
        └── CollectionEncapsulationDemo.java
```

## Source Files

### `src/Main.java`
- **What it does**: Entry point that runs all demos in order with section headers.

### `basics/` -- Core Encapsulation

- **`BankAccount.java`**
  - Classic encapsulation example: all fields `private`
  - `accountNumber` is read-only (getter only, no setter -- set once in constructor)
  - `holderName` has getter + setter
  - `balance` has getter but no public setter -- modified only through `deposit()` and `withdraw()` with validation
  - Validation: cannot deposit negative amount, cannot withdraw more than balance
  - `toString()` override for clean output

- **`EncapsulationBasicsDemo.java`**
  - Creates `BankAccount` objects and demonstrates:
    - Successful deposits and withdrawals
    - Validation rejecting invalid operations (negative deposit, overdraft)
    - Why `account.balance = -1000` is impossible (field is private -- commented out)
    - Explains encapsulation vs information hiding distinction
    - Shows read-only field (`accountNumber` cannot be changed after construction)

### `getters/` -- Getter/Setter Patterns

- **`Employee.java`**
  - Private fields: `firstName`, `lastName`, `salary`, `active`, `password`, `hobbies`
  - **Boolean getter**: `isActive()` (not `getActive()`)
  - **Computed property**: `getFullName()` returns `firstName + " " + lastName` (no backing field)
  - **Fluent setters**: each setter returns `this` for method chaining
  - **Write-only**: `setPassword()` exists but no `getPassword()` (security)
  - **Defensive copy in getter**: `getHobbies()` returns `Collections.unmodifiableList()`
  - **Defensive copy in setter**: `setHobbies()` copies the input list

- **`MutableReturnDemo.java`**
  - **Bad example**: `UnsafeConfig` returns its internal `ArrayList` directly -- caller can mutate it
  - **Good example**: `SafeConfig` returns `Collections.unmodifiableList()` -- caller gets `UnsupportedOperationException`
  - Shows the problem: external code adding/removing items from what should be internal state

- **`GetterSetterDemo.java`**
  - Runs all demos for `Employee` and `MutableReturnDemo`

### `beans/` -- JavaBeans & Records

- **`UserBean.java`**
  - Classic JavaBean: `implements Serializable`, no-arg constructor, `private` fields
  - `getName()` / `setName()`, `getEmail()` / `setEmail()`, `getAge()` / `setAge()`
  - `isVerified()` / `setVerified()` (boolean uses `is` prefix)
  - `toString()` override

- **`RecordVsBeanDemo.java`**
  - Defines `record UserRecord(String name, String email, int age)` (Java 16+)
  - **Compact constructor** with validation (age must be positive, name not blank)
  - Custom method inside the record
  - Shows records are implicitly `final` (commented-out `extends` attempt)
  - Records auto-generate: canonical constructor, getters (`name()` not `getName()`), `equals`, `hashCode`, `toString`
  - Comparison: Record (immutable, concise) vs Bean (mutable, verbose, framework-friendly)

- **`JavaBeansDemo.java`**
  - Runs demos for `UserBean` and `RecordVsBeanDemo`, prints convention rules

### `design/` -- Design Principles

- **`LawOfDemeterDemo.java`**
  - **BAD**: `order.getCustomer().getAddress().getCity()` (train wreck, violates Law of Demeter)
  - **GOOD**: `order.getDeliveryCity()` (delegates to internal objects)
  - Explains "only talk to your immediate friends"
  - Shows how tight coupling through getter chains makes code fragile

- **`AntiPatternDemo.java`**
  - **Anti-pattern 1**: Public fields (no encapsulation at all)
  - **Anti-pattern 2**: Anemic domain model (getters/setters only, no behavior) vs rich domain model (methods encapsulate business logic)
  - **Anti-pattern 3**: Breaking encapsulation via Reflection (`Field.setAccessible(true)`) -- cautionary demo showing it bypasses `private`

- **`TightEncapsulationDemo.java`**
  - Minimal public API: class exposes only what callers need
  - Package-private helper class (not `public` -- internal implementation detail)
  - `final` class preventing subclass from breaking encapsulation
  - Information hiding: internal representation can change without breaking callers

### `collections/` -- Encapsulating Collections

- **`Classroom.java`**
  - `private List<String> students`
  - `addStudent()` with duplicate check and blank-name validation
  - `removeStudent()` with existence check
  - `getStudents()` returns `Collections.unmodifiableList(students)` -- safe
  - `getStudentCount()` -- exposes size without exposing the list

- **`CollectionEncapsulationDemo.java`**
  - Demonstrates unsafe collection exposure (returning raw list)
  - Shows `UnsupportedOperationException` from unmodifiable list
  - Compares `Collections.unmodifiableList()` vs `List.copyOf()` vs `List.of()`
  - Shows safe mutation through dedicated methods with validation

## How to Compile + Run (PowerShell)

From this folder (`encapsulation`):

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)
java -cp out Main
```

## What to Look At

- In each demo file, lines that **won't compile** are left as **commented** examples right next to working lines.
- Look for `// WON'T COMPILE:` comments to understand what the compiler rejects and why.
- Each demo prints clear explanations of what's happening and why.
