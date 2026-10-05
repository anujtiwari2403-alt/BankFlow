# OOP Learning Project : To Read in Preview Mode: CTRL+SHIFT+V

A structured, hands-on OOP learning project organized by topic. Each folder contains
runnable demo projects with clear explanations, commented-out "won't compile" examples,
and comprehensive READMEs.

---

## Folder Structure

```
OOP/
├── README.md                          <-- you are here
│
├── basics/                            <-- Foundational Java topics
│   ├── BASICS-OVERVIEW.md             <-- Summary of all 4 projects below
│   │
│   ├── access-modifiers-demo/         (9 Java files + README)
│   │   ├── README.md
│   │   └── src/
│   │       ├── Main.java
│   │       ├── pack1/                 (AccessBase, SamePackageTest, ConstructorAccessDemo,
│   │       │                           InterfaceAccessDemo, AbstractEnumInnerAccessDemo)
│   │       └── pack2/                 (OtherPackageTest, SubClassInOtherPackage,
│   │                                   OverrideAccessRulesDemo)
│   │
│   ├── class-objects-demo/            (15 Java files + README)
│   │   ├── README.md
│   │   └── src/
│   │       ├── Main.java
│   │       ├── basics/                (Student, BasicDemo, CopyConstructorDemo,
│   │       │                           EqualsHashCodeDemo, ThisKeywordDemo)
│   │       ├── constructors/          (Book, ConstructorDemo)
│   │       ├── methods/               (Calculator, MethodDemo, VarargsDemo)
│   │       └── references/            (PassByValueDemo, AnonymousObjectDemo,
│   │                                   WrapperAutoboxingDemo, ImmutableObjectDemo,
│   │                                   ObjectClassMethodsDemo)
│   │
│   ├── final-keyword-demo/            (13 Java files + README)
│   │   ├── README.md
│   │   └── src/
│   │       ├── Main.java
│   │       ├── variables/             (FinalVariableDemo, FinalReferenceDemo,
│   │       │                           FinalArrayDemo, FinalVsFinallyVsFinalizeDemo)
│   │       ├── methods/               (Parent, Child, FinalMethodDemo)
│   │       └── classes/               (ImmutableConfig, FinalClassDemo,
│   │                                   FinalParameterDemo, FinalLambdaDemo,
│   │                                   FinalThreadSafetyDemo)
│   │
│   └── static-keyword-demo/           (12 Java files + README)
│       ├── README.md
│       └── src/
│           ├── Main.java
│           ├── fields/                (Counter, StaticFieldDemo, SingletonDemo)
│           ├── methods/               (MathHelper, StaticMethodDemo, StaticHidingDemo,
│           │                           StaticFactoryDemo)
│           ├── blocks/                (DatabaseConfig, StaticBlockDemo,
│           │                           StaticInheritanceOrderDemo)
│           └── nested/                (OuterClass, StaticNestedDemo)
│
└── encapsulation/                     <-- OOP Pillar: Encapsulation
    ├── README.md
    ├── ENCAPSULATION-OVERVIEW.md      <-- Summary of all concepts
    └── src/
        ├── Main.java
        ├── basics/                    (BankAccount, EncapsulationBasicsDemo)
        ├── getters/                   (Employee, MutableReturnDemo, GetterSetterDemo)
        ├── beans/                     (UserBean, RecordVsBeanDemo, JavaBeansDemo)
        ├── design/                    (LawOfDemeterDemo, AntiPatternDemo,
        │                               TightEncapsulationDemo)
        └── collections/              (Classroom, CollectionEncapsulationDemo)
```

---

## What Each Section Covers

| Section | Topics | Java Files |
|---------|--------|------------|
| **basics/** | 4 foundational topics every Java developer must know | 49 files |
| basics/access-modifiers-demo | `public`, `protected`, default, `private` on fields, methods, constructors, classes, interfaces, enums, inner classes | 9 |
| basics/class-objects-demo | Classes, objects, constructors, `this`, `equals`/`hashCode`, wrappers, immutability, Object methods, pass-by-value | 15 |
| basics/final-keyword-demo | `final` variables, methods, classes, parameters, arrays, lambdas, thread safety, `final` vs `finally` vs `finalize` | 13 |
| basics/static-keyword-demo | `static` fields, methods, blocks, nested classes, singleton, factory methods, inheritance order, memory model | 12 |
| **encapsulation/** | OOP Pillar: data hiding, controlled access, design principles | 12 files |
| encapsulation (all) | Private fields, getters/setters, validation, defensive copies, JavaBeans, Records, Law of Demeter, anti-patterns, collection safety | 12 |

**Grand Total: 61 Java source files + 6 READMEs + 2 overview MDs**

---

## Suggested Learning Order

```
1. basics/access-modifiers-demo     -- understand the 4 access levels first
2. basics/class-objects-demo        -- classes, objects, constructors, this, equals
3. basics/final-keyword-demo        -- final variables, methods, classes, immutability
4. basics/static-keyword-demo       -- static fields, methods, blocks, patterns
5. encapsulation/                   -- data hiding, design principles, JavaBeans, Records
```

Each project builds on concepts from the previous ones.

---

## How to Compile and Run Any Project

Open PowerShell, `cd` into any project folder, then:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src | % FullName)
java -cp out Main
```

---

## Teaching Style

Every project follows the same pattern:
- **`README.md`** -- full topic explanation with folder tree and per-file descriptions
- **`src/Main.java`** -- entry point that runs all demos sequentially with `== Section ==` headers
- **Sub-packages** grouping related concepts under `src/`
- **`// WON'T COMPILE:`** commented-out lines showing what the compiler rejects and why
- **`System.out.println()`** statements explaining what's happening as code runs
- **PowerShell** compile/run instructions in every README
