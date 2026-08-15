# ANTLR-PCF: Interpreter for the PCF Language

An interpreter for the functional programming language **PCF** (*Programming Computable Functions*), implemented in **Java 21** using the **ANTLR 4** parser generator.

This project implements all four feature stages (**Green**, **Blue**, **Red**, and **Black**) covering arithmetic evaluation, lexical scoping, higher-order functions, and general recursion via a fixed-point combinator with lazy evaluation (*Ice Cubes*).

## Table of Contents

- [Overview](#overview)
- [Project Architecture](#project-architecture)
- [How It Works](#how-it-works)
- [Feature Stages](#feature-stages)
- [Formal Syntax & Examples](#formal-syntax--examples)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Regenerating the ANTLR Parser](#regenerating-the-antlr-parser-optional)
  - [Compilation](#compilation)
  - [Running a Program](#running-a-program)
  - [Interactive Mode & Piping](#interactive-mode--piping)
- [Running Tests & Test Matrix](#running-tests--test-matrix)
- [Authors](#authors)
- [License](#license)

## Overview

**PCF** (*Programming Computable Functions*) is a Turing-complete, typed functional language originally introduced by Dana Scott and Gordon Plotkin based on the extended lambda calculus. It incorporates:
- Primitive integer types and arithmetic operations (`+`, `-`, `*`, `/`),
- Conditional expressions (`ifz ... then ... else ...`),
- Local variable bindings (`let ... in ...`),
- Higher-order functions (abstractions `fun ... -> ...` and applications),
- General recursion through a fixed-point operator (`fix`).

## Project Architecture

```text
antlr4-pcf-interpreter/
├── antlr-runtime-4.13.2.jar   # ANTLR 4 runtime library
├── src/
│   ├── ast/                   # AST node hierarchy (Term, Lit, BinOp, Let, Fun, Fix, etc.)
│   ├── interp/                # Environment model (Env, Binding) and runtime values (IntVal, ClosureVal, IceCubeVal)
│   ├── parser/                # PCF.g4 grammar, ANTLR generated files, ASTVisitor & syntax error listeners
│   ├── main/                  # Main entry point CLI (Main.java)
│   └── test/                  # Automated test runner (Test.java)
├── test/                      # PCF source test programs (.pcf)
└── README.md
```

## How It Works

```text
PCF Source ──► ANTLR 4 Parser ──► AST (ASTVisitor) ──► Interpreter (interp) ──► Result Value
```

- **Environments & Closures**: Environments (`Env`) are immutable chains. Closures (`ClosureVal`) capture their enclosing scope at definition time, supporting lexical scoping and currying.
- **Lazy Recursion (*Ice Cubes*)**: The `fix` operator wraps recursive definitions in an `IceCubeVal` ("frozen"). The body is only evaluated ("thawed") when the variable is actually accessed, preventing infinite recursion during binding.

## Feature Stages

The interpreter implements the following progression stages:

| Stage | Name | Features | Examples & Edge Cases |
| :--- | :--- | :--- | :--- |
| **Stage 1** | **Green** | Integer literals, binary arithmetic operations (`+`, `-`, `*`, `/`), operator precedence, conditionals (`ifz`). | Precedence of `*`/`/` over `+`/`-`, runtime division-by-zero detection. |
| **Stage 2** | **Blue** | Identifiers, variables, static lexical scoping, local bindings (`let x = e1 in e2`), variable shadowing. | Variable shadowing, reporting undefined variable errors. |
| **Stage 3** | **Red** | Anonymous functions (`fun x -> e`), function application (`e1 e2`), lexical closures (`ClosureVal`), higher-order functions and currying. | Functions returning functions, runtime validation of function types on application. |
| **Stage 4** | **Black** | Fixed-point combinator (`fix x e`), general recursion (loops, factorials), lazy evaluation of recursive definitions using *Ice Cubes*. | Preventing divergence on recursive binding, evaluating recursive definitions only when applied. |

## Formal Syntax & Examples

### Grammar (EBNF)

```text
e ::= n                           (Integer literal)
    | x                           (Identifier / Variable)
    | e1 op e2                    (Binary arithmetic operation)
    | ifz e0 then e1 else e2      (Conditional: evaluates e1 if e0 = 0, else e2)
    | let x = e1 in e2            (Local variable binding)
    | fun x -> e                  (Function abstraction)
    | e1 e2                       (Function application)
    | fix x e                     (Fixed-point recursion operator)
    | ( e )                       (Parenthesized expression)

op ::= + | - | * | /
```

### Examples

#### Arithmetic & Conditionals (Green)
```pcf
ifz 10 / 5 - 2 then 42 else 0
```

#### Local Bindings & Shadowing (Blue)
```pcf
let x = 1 in
(let x = x + 1 in x) + x
```

#### Functions & Currying (Red)
```pcf
let add = fun x -> fun y -> x + y in
let inc = add 1 in
inc 2
```

#### Recursion & Factorial (Black)
```pcf
let fact = fix f fun n -> ifz n then 1 else n * f (n - 1) in
fact 3
```

## Getting Started

### Prerequisites
- **Java JDK**: 21 or higher
- **ANTLR 4 Runtime**: Included in the repository (`antlr-runtime-4.13.2.jar`)

### Regenerating the ANTLR Parser (Optional)

The generated parser and visitor files are already included under `src/parser/`. If you modify `src/parser/PCF.g4`, you can regenerate the Java sources using the ANTLR 4 tool:

```bash
java -jar /path/to/antlr-4.13.2-complete.jar -no-listener -visitor src/parser/PCF.g4
```

### Compilation

**Linux / macOS (Bash):**
```bash
javac -cp .:antlr-runtime-4.13.2.jar -d out $(find src -name "*.java")
```

**Windows (PowerShell / CMD):**
```powershell
javac -cp ".;antlr-runtime-4.13.2.jar" -d out src/ast/*.java src/interp/*.java src/main/*.java src/parser/*.java src/test/*.java
```

### Running a Program

**Linux / macOS:**
```bash
# Run a PCF source file
java -cp out:antlr-runtime-4.13.2.jar main.Main test/black3.pcf

# Verbose mode (displays the parse tree and AST)
java -cp out:antlr-runtime-4.13.2.jar main.Main -v test/black3.pcf
```

**Windows:**
```powershell
# Run a PCF source file
java -cp "out;antlr-runtime-4.13.2.jar" main.Main test/black3.pcf

# Verbose mode
java -cp "out;antlr-runtime-4.13.2.jar" main.Main -v test/black3.pcf
```

### Interactive Mode & Piping

When launched without a file argument, the interpreter reads directly from standard input (`System.in`) with verbose mode enabled automatically:

```bash
java -cp out:antlr-runtime-4.13.2.jar main.Main
```

1. Type your PCF expression in the terminal (e.g. `let x = 5 in x * 2`).
2. Send the **End-Of-File (EOF)** signal to evaluate:
   - **Linux / macOS**: Press `Ctrl + D`
   - **Windows**: Press `Ctrl + Z` then `Enter`
3. The interpreter outputs the ANTLR parse tree, the resulting AST, and the evaluated value:
   ```text
   ANTLR Syntax Tree: (term let x = (term 5) in (term (term x) * (term 2)))
   AST: Let(x, Lit(5), BinOp(TIMES, Var(x), Lit(2)))
   ===> 10
   ```

You can also pass expressions directly via shell pipes:
```bash
echo "let inc = fun x -> x + 1 in inc 41" | java -cp out:antlr-runtime-4.13.2.jar main.Main
```

## Running Tests & Test Matrix

An automated test suite covering 27 test cases across all four stages is included in `test.Test`. It validates both positive behavior and error rejection (*negative testing*):

**Linux / macOS:**
```bash
java -cp out:antlr-runtime-4.13.2.jar test.Test
```

**Windows:**
```powershell
java -cp "out;antlr-runtime-4.13.2.jar" test.Test
```

### Test Suite Matrix

| Stage | Test Files | Tested Features (Expected Success) | Error Cases Tested (`mustFail = true`) |
| :--- | :--- | :--- | :--- |
| **Green** | `green0.pcf` – `green8.pcf` | Integer literals, precedence (`*`/`/` over `+`/`-`), `ifz` true/false branches | Division by zero (`green6`, `green8`) |
| **Blue** | `blue0.pcf` – `blue4.pcf` | `let` expressions, static scoping, variable shadowing | Free / unbound variables (`blue0`, `blue4`) |
| **Red** | `red0.pcf` – `red8.pcf` | Anonymous functions, higher-order functions, currying, closures | Applying non-function values (`red1`, `red7`) |
| **Black** | `black0.pcf` – `black3.pcf` | Recursion with `fix`, recursive factorials, loops | Malformed recursive definitions (`black1`) |

## Authors

- **Thomas BATISTA** ([@thomas-btst](https://github.com/thomas-btst))
- **Clovis SFEIR** ([@sfeirc](https://github.com/sfeirc))

## License

All rights reserved.