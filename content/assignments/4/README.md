# Assignment Due 10/29
## Regular Expressions

**Total Points: 10**

---

## (4 points) Problem 1: Regular Operations on NFAs

Implement the TODOs in [NFAOps.java](java/src/NFAOps.java) to implement the three core regular language operations on their NFA equivalents.

---

## (3 points) Problem 2: RE -> NFA and Unit Tests

1. Implement the TODOs in [BinaryStringsWithoutLeadingZeros.java](java/src/BinaryStringsWithoutLeadingZeros.java) to implement an NFA that recognizes the language specified by the regular expression `0|(1(0|1)*)`. The TODOs guide you through a strategy of constructing an NFA for each symbol, and then using NFA operations to combine NFAs into an NFA for full language specified by the RE.

1. Implement the TODOS in [BinaryStringsWithoutLeadingZerosTest.java](java/src/BinaryStringsWithoutLeadingZerosTest.java) to implement unit tests for BinaryStringsWithoutLeadingZeros.java.

---

## (3 points) Problem 3: RE and NFA

Consider the alphabet $\Sigma = \{., 0, 1, 2, 3, 4, 5, 6, 7, 8, 9\}$. In this problem you will write REs and draw equivalent NFAs to recognize different kinds of numbers over the alphabet. Only use union (`|`), concatenation (`.`), and closure (`*`) in your REs to make it easier to determine the equivalent NFA.

1. Language: whole numbers i.e. integers >= 0 with no leading 0. Examples: `0`, `14`, `666`.

    1. RE: **TODO: add your RE here**

    1. NFA:

        **TODO: add NFA diagram**

2. Language: positive non-integers with no leading 0 nor trailing 0. Examples: `0.1`, `14.25`, `666.666`.

    1. RE: **TODO: add your RE here**

    2. NFA:

        **TODO: add NFA diagram**

3. Language: positive numbers with no leading 0 nor trailing 0 (if non-integer). Examples: `0`, `14`, `666`, `0.1`, `14.25`, `666.666`.

    1. RE: **TODO: add your RE here**

    2. NFA:

        **TODO: add NFA diagram**

---