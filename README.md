# Functional Programming in Scala — Learning Notes & Code

This repository documents my journey through **_Functional Programming in Scala_**, focusing not just on syntax, but on how the *way you think about programming* evolves as systems scale.

This is not a collection of random Scala snippets.
It’s a record of how software design changes when **purity, immutability, and composition** become first-class concerns.

---

## Why this book?

Most programming starts like this:

- Write code
- Make it work
- Add features
- Debug side effects
- Add frameworks to manage complexity

This book flips that flow.

Instead of managing complexity **after** it appears, it teaches you how to **prevent it at the design level**.

You learn how to:
- Separate *logic* from *effects*
- Make functions predictable, testable, and composable
- Push I/O and mutation to the edges
- Scale reasoning, not just code

---

## Core ideas explored

Some of the key ideas I’m learning and applying:

- **Pure functions**
  - No hidden inputs
  - No hidden outputs
  - Same input → same result
- **Referential transparency**
  - Expressions can be replaced by their values
  - Makes reasoning and debugging trivial
- **Immutability**
  - State transitions instead of state mutation
- **Composition over control flow**
  - Build behavior by combining functions
- **Effects as values**
  - I/O is modeled, not executed immediately

A small example from the book (the café example) shows how even *charging a credit card* can be modeled without side effects — and why that matters.

---

## Repository structure

The structure mirrors the book and keeps concepts isolated and easy to revisit.

