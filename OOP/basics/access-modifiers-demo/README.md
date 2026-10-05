# Java Access Modifiers Demo (2 packages) : To Read readme filein Preview Mode:  CTRL+SHIFT+V

This mini-project demonstrates how Java access modifiers behave **across different packages**:

- `public` — accessible from anywhere
- `protected` — accessible in the **same package**, and in **subclasses** in other packages
- *(default)* / *package-private* — accessible **only within the same package**
- `private` — accessible **only within the same class**
- Access modifiers on **constructors** — private (singleton/utility), protected, default, public
- **Method override access rules** — cannot narrow, can widen (protected → public OK)
- **Interface access rules** — methods implicitly public, default methods, private helpers (Java 9+), static methods
- **Abstract class rules** — abstract methods cannot be private
- **Enum constructor** — implicitly private, cannot be public/protected
- **Inner class access** — inner class can access all outer members including private
- **Nested class modifiers** — all 4 levels allowed (unlike top-level: only public/default)
- **Multiple classes in one file** — only one public class, must match filename
- **Default-access top-level class** — no `public` keyword = package-private

## Folder structure (as in this project)

```
access-modifiers-demo/
├─ README.md
├─ out/
│  ├─ Main.class
│  ├─ pack1/
│  │  ├─ AccessBase.class
│  │  ├─ SamePackageTest.class
│  │  ├─ ConstructorAccessDemo.class
│  │  ├─ InterfaceAccessDemo.class
│  │  ├─ AbstractEnumInnerAccessDemo.class
│  │  └─ PackagePrivateHelper.class
│  └─ pack2/
│     ├─ OtherPackageTest.class
│     ├─ SubClassInOtherPackage.class
│     └─ OverrideAccessRulesDemo.class
└─ src/
   ├─ Main.java
   ├─ pack1/
   │  ├─ AccessBase.java
   │  ├─ SamePackageTest.java
   │  ├─ ConstructorAccessDemo.java
   │  ├─ InterfaceAccessDemo.java
   │  └─ AbstractEnumInnerAccessDemo.java
   └─ pack2/
      ├─ OtherPackageTest.java
      ├─ SubClassInOtherPackage.java
      └─ OverrideAccessRulesDemo.java
```

## Source files

- `src/Main.java`
  - **What it does**: Runs all demos in order:
    - same-package access (`pack1.SamePackageTest`)
    - other-package non-subclass access (`pack2.OtherPackageTest`)
    - other-package subclass access + protected edge case (`pack2.SubClassInOtherPackage`)
    - constructor access levels (`pack1.ConstructorAccessDemo`)
    - method override access rules (`pack2.OverrideAccessRulesDemo`)
    - interface access modifiers (`pack1.InterfaceAccessDemo`)
    - abstract class / enum / inner class access (`pack1.AbstractEnumInnerAccessDemo`)

- `src/pack1/AccessBase.java`
  - **What it contains**: One class that defines members with all four access levels.
    - **Fields**
      - `public int pubField`
      - `protected int protField`
      - `int defaultField` (package-private)
      - `private int privField`
    - **Methods**
      - `public String pubMethod()`
      - `protected String protMethod()`
      - `String defaultMethod()` (package-private)
      - `private String privMethod()`
    - **Why the extra public wrappers exist**
      - `public int readPrivateInsideClass()` returns the private field from inside the same class
      - `public String callPrivateInsideClass()` calls the private method from inside the same class
      - This demonstrates the rule: **private is accessible only inside the declaring class**, but can be exposed indirectly via public/protected/default methods.

- `src/pack1/SamePackageTest.java`
  - **Goal**: Show what is accessible from the **same package** without subclassing.
  - **Expected results**
    - **Accessible**: `public`, `protected`, and *default/package-private*
    - **Not accessible**: `private`
  - **How it demonstrates this**
    - Prints `pubField`, `protField`, `defaultField`
    - Calls `pubMethod()`, `protMethod()`, `defaultMethod()`
    - Includes commented-out lines that "won't compile" for direct `private` access
    - Uses the public wrapper methods to show private access is possible only **through code inside `AccessBase`**

- `src/pack1/ConstructorAccessDemo.java`
  - **Goal**: Demonstrate all 4 access levels on constructors.
  - **What it covers**
    - `public` constructor — callable from anywhere
    - default (package-private) constructor — callable only within `pack1`
    - `protected` constructor — callable within `pack1` and in subclasses in other packages
    - `private` constructor — callable only inside the declaring class itself
  - **Key concept**: Private constructors are used for Singleton pattern, utility classes, and factory methods. A static factory method (`create()`) provides controlled instantiation.

- `src/pack1/InterfaceAccessDemo.java`
  - **Goal**: Demonstrate interface access modifier rules.
  - **What it covers**
    - Interface methods are implicitly `public abstract`
    - Interface fields are implicitly `public static final`
    - Default methods (Java 8+) — have a body, still public
    - Static methods (Java 8+) — belong to the interface, NOT inherited
    - Private helper methods (Java 9+) — for internal reuse only
    - Cannot use `protected` on interface methods
    - Implementing class cannot reduce visibility (must stay `public`)
  - **Also demonstrates**: Multiple classes in one file, and default-access (package-private) top-level class (`PackagePrivateHelper`)

- `src/pack1/AbstractEnumInnerAccessDemo.java`
  - **Goal**: Demonstrate access modifiers in abstract classes, enums, and inner/nested classes.
  - **What it covers**
    - Abstract class method modifiers: `public abstract`, `protected abstract`, default abstract are OK; `private abstract` won't compile (must be overridable)
    - Enum constructor access: implicitly private, cannot be `public` or `protected`
    - Inner class (non-static): can access ALL outer members including `private`
    - Static nested class: can only access outer `static` members
    - Nested class modifiers: all 4 levels allowed (`public`, `protected`, default, `private`) — unlike top-level classes which only allow `public` or default

- `src/pack2/OtherPackageTest.java`
  - **Goal**: Show what is accessible from a **different package** when you are **not** a subclass.
  - **Expected results**
    - **Accessible**: only `public`
    - **Not accessible**: `protected`, default/package-private, `private`
  - **How it demonstrates this**
    - Prints `pubField` and calls `pubMethod()`
    - Leaves non-compiling examples commented out (protected/default/private)

- `src/pack2/SubClassInOtherPackage.java`
  - **Goal**: Show what is accessible from a **different package** when you **are** a subclass.
  - **Expected results**
    - **Accessible** (via inheritance): `public` and `protected`
    - **Not accessible**: default/package-private (still package-scoped), `private`
  - **Methods**
    - `demoProtectedAccess()`
      - Accesses `pubField`, `protField`, and calls `pubMethod()`, `protMethod()` directly (inherited)
      - Shows that default/package-private and private members remain inaccessible (commented-out lines)
    - `importantRuleDemo()`
      - Demonstrates a subtle but important rule:
        - In a different package, `protected` is accessible **in a subclass context** (inheritance),
          but **not** through a reference typed as the base class.
      - This is why this works:
        - `SubClassInOtherPackage child = new SubClassInOtherPackage();`
        - `child.protField` 
      - And this does not (left commented in code):
        - `AccessBase asBase = child;`
        - `asBase.protField` (won't compile in `pack2`)

- `src/pack2/OverrideAccessRulesDemo.java`
  - **Goal**: Demonstrate method overriding access rules.
  - **What it covers**
    - Widening access is allowed: `protected` → `public` (OK)
    - Keeping same level is allowed: `public` → `public` (OK)
    - Narrowing access is NOT allowed: `public` → `protected`/`private` (won't compile)
    - Default (package-private) methods are NOT inherited across packages — cannot override
    - Private methods are NEVER inherited — cannot override
  - **Key rule**: `private < default < protected < public` — override must be SAME or WIDER (move right), CANNOT move left (narrow access)

## How to compile + run (PowerShell)

From this folder (`access-modifiers-demo`):

```bash
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)
java -cp out Main
```

## What to look at

- In each `*Test` and `*Demo` file, the lines that **won't compile** are left as **commented** examples right next to working lines.
