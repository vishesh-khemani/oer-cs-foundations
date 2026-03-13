# Assignment Due 12/10
## Complexity + AI

**Total Points: 10**

---

## Problem 1: Subsets Generator (2 points)

Given a collection of items, determine all possible unique subsets of the items.  

Example:
- Collection of integers: [6, 42, 3]
- Subsets: [[], [3], [42], [6], [3, 6], [3, 42], [6, 42], [3, 6, 42]]

There are $2^n$ possible subsets of $n$ distinct items. Each subset corresponds to an $n$ digit binary number. Each digit corresponds to the item in that position. A 0 denotes that the corresponding item is not selected in the subset. A 1 denotes that the corresponding item is selected in the subset.

|            | 6   | 42  | 3   |
| ---------- | --- | --- | --- |
| []         | 0   | 0   | 0   |
| [3]        | 0   | 0   | 1   |
| [42]       | 0   | 1   | 0   |
| [3, 42]    | 0   | 1   | 1   |
| [6]        | 1   | 0   | 0   |
| [3, 6]     | 1   | 0   | 1   |
| [6, 42]    | 1   | 1   | 0   |
| [3, 6, 42] | 1   | 1   | 1   |

If there are duplicate items, then the duplicate subsets should be detected and removed. One way to do this is to sort each subset by the natural ordering of items and use a Set to store the unique subsets.

(a) Address the TODOs in [Subsetter.java](java/src/Subsetter.java) to implement this strategy. Ensure that the unit tests in [SubsetterTest.java](java/src/Subsetter.java) pass.

(b) What is the "Big O" time complexity of the algorithm?

**TODO: your answer here**

---

## Problem 2: Subset-Sum (3 points)

(a) Address the TODOs in [SubsetSum.java](java/src/SubsetSum.java) to implement a solver and verifier for the subset-sum problem. Ensure that the unit tests in [SubsetSumTest.java](java/src/SubsetSumTest.java) pass.

(b) What is the "Big O" time complexity of the `solve` method?

**TODO: your answer here**

(c) What is the "Big O" time complexity of the `verify` method?

**TODO: your answer here**

(d) Based on your answers above, is the subset-sum problem in just NP or also in P? Why?

**TODO: your answer here**

---

## Problem 3: Permutations Generator (2 points)

(a) Address the TODOs in [Permuter.java](java/src/Permuter.java) to implement the class. Ensure that the unit tests in [PermuterTest.java](java/src/PermuterTest.java) pass.

(b) What is the "Big O" time complexity of the algorithm?

**TODO: your answer here**

---

## Problem 4: Sorting (3 points)

(a) Address the TODOs in [Sorter.java](java/src/Sorter.java) to implement a brute-force solver, an insertion-sort solver, and a verifier for the sorting problem. Ensure that the unit tests in [SorterTest.java](java/src/SorterTest.java) pass.

(b) What is the "Big O" time complexity of the `bruteForceSort` method?

**TODO: your answer here**

(c) What is the "Big O" time complexity of the `verify` method?

**TODO: your answer here**

(d) What is the "Big O" time complexity of the `insertionSort` method?

**TODO: your answer here**

(e) Based on your answers above, is the sorting problem in just NP or also in P? Why?

**TODO: your answer here**

---

## Extra Credit: Measuring Complexity (2 points)

Demonstrate the complexity difference between polynomial and exponential time algorithms by measuring the actual run times of `Sorter::bruteForceSort` and `Sorter::insertionSort` for different sizes of the list of items. 

Your demonstration should include the following:

(a) Your Java program to run the algorithms for your selection of list sizes. The program should be added to this repo.

**TODO: add link to your program file here**

(b) Your output tabulated in a spreadsheet (MS Excel or Google Sheets) with a plot comparing the run times of the two algorithms for feasible values of the list sizes. The spreadsheet should be added to this repo.

**TODO: add link to your spreadsheet file here**

(c) At what list size does the exponential algorithm become infeasible?

**TODO: your answer here**

---