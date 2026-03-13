# Assignment Due 12/03
## Computability + Memory

**Total Points: 10**

---

## Problem 1: Uncomputable Functions (4 points)

Consider the set of functions from natural numbers to booleans. 

$F: \mathbb{N} \rightarrow \mathbb{B}$

So every function in this set $F$ takes as argument an `integer` that's $\ge 1$ and returns a `boolean`.

An example of such a function is:
```math
\text{isEven}(n) = 
\begin{cases} 
\text{true} & \text{if n is even} \\ 
\text{false} & \text{if n is odd}
\end{cases}
```

In a programming language like Java, the above example function can be defined as follows:
```java
boolean isEven(int n) {
    if (n < 1) throw new IllegalArgumentException();
    return n % 2 == 0;
}
```

(a) Complete the proof below that the set $F$ is *uncountable* i.e. it can't be enumerated. *Hint*: use Cantor's diagonalization argument. 

- Assume (for the sake of contradiction) that the set is countable i.e. you can list all functions in $F$ as $f_1, f_2, f_3, ...$
- Represent the listed functions in a table. The $i^\text{th}$ row defines the function $f_i$ with its boolean return value listed for each possible input.
  
    |       | 1        | 2         | 3        | ... |
    | ----- | -------- | --------- | -------- | --- |
    | $f_1$ | **true** | false     | false    | ... |
    | $f_2$ | false    | **false** | false    | ... |
    | $f_3$ | true     | false     | **true** | ... |
    | ...   | ...      | ...       | ...      | ... |

- Construct a function $g$ that differs from every $f_i$:

    **TODO: define g here** 
- **TODO: complete the proof here**

(b) Complete the proof below that the set of Java functions that take as argument a natural number and return a boolean is *countable*. 

- Java functions are defined as finite text using a finite character set
- **TODO: complete the proof here**

(c) Based on parts (a) and (b), answer the following:
- How many Java functions exist? (finite, countably-infinite, or uncountably-infinite)
  - **TODO: your answer here**
- How many functions from $\mathbb{N} \rightarrow \mathbb{B}$ exist? (finite, countably-infinite, or uncountably-infinite)
  - **TODO: your answer here**
- What does this tell us about Java's ability to compute such functions?
  - **TODO: your answer here**
- How many functions can you describe in a human language of your choice? (finite, countably-infinite, or uncountably-infinite)
  - **TODO: your answer here**
- What does this tell us about your ability to describe all possible functions?
  - **TODO: your answer here**

---

## Problem 2 : Unsolvable Halting Problem (2 points)

Consider the following claim: "There exists a Java method that can determine whether any given predicate will halt (terminate) or run forever on a given input." (A predicate is a function that returns a boolean)

Address the TODO in [ContradictionPredicate.java](java/src/ContradictionPredicate.java) to implement a predicate that contradicts the prediction of [HaltingDecider.java](java/src/HaltingDecider.java). Ensure that the unit tests in [ContradictionPredicateTest.java](java/src/ContradictionPredicateTest.java) pass.

---

## Problem 3 : Unsolvable Reductions (2 points)

Consider the following claim: "There exists a Java method that can determine whether any given predicate will return true on a given input."

Address the TODO in [HaltingReduction.java](java/src/HaltingReduction.java) to construct a `halts` method that solves the impossible halting problem by reducing it to the returns-true problem. Ensure that the unit tests in HaltingReductionTest.java pass.

From problem 2 we know that the halting problem is unsolvable. So, this problem shows that the returns-true problem is also unsolvable.

---

## Problem 4: Memory Pool Management (2 points)

You have a Java graphics application that frequently creates and destroys small [Particle.java](java/src/Particle.java) objects on the heap. 

(a) Suppose the application creates and destroys 10,000 particles per frame (60 frames per second). Estimate how much memory will be allocated and deallocated per second. Explain why this would be a problem for both allocation overhead and for garbage collection.

(b) Address the TODOs in [ParticlePool.java](java/src/ParticlePool.java) to reuse `Particle` objects to avoid memory issues. Ensure that the unit tests in [ParticlePoolTest.java](java/src/ParticlePoolTest.java) pass.

---
