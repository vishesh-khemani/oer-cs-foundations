# Assignment Due 10/08
## Automata, Languages, GitHub

**Total Points: 10**

## Problem 0: Belonging (0 points)

You belong in this class. The class will be poorer without the benefit of your unique experience, perspective, background, and strengths (academic or otherwise). Reflect on what assets you bring to the course and list them here. If you think you don't bring any assets, think again!

TODO: add your answer here

## Problem 1: Formal Languages and Strings (3 points)

Consider an alphabet Σ = {a, b, c}.

a) **[1 point]** List all possible strings of length 2 over this alphabet.

TODO: add your answer here

b) **[1 point]** Consider a formal language L that contains all strings over Σ where the number of 'a's is equal to the number of 'b's (the number of 'c's can be any amount). List 3 strings that belong to L and 3 strings that do not belong to L in the specified places in [LanguageDeciderTest.java](java/src/LanguageDeciderTest.java).

c) **[1 point]** Implement the Java method in [LanguageDecider.java](java/src/LanguageDecider.java) that takes a string as input and returns `true` if the string belongs to the language L defined in part (b), and `false` otherwise.

## Problem 2: Abstract Machines and Computational Models (2 points)

Consider the abstract machine model described in the lecture notes with its three main components: Tape, Control, and Output.

a) **[0.5 points]** Explain in your own words why we study abstract machines instead of actual computers when exploring computational theory. Provide at least two specific advantages.

TODO: add your answer here

b) **[0.5 points]** Compare the following two abstract machine configurations. Which one would likely be more powerful (able to solve more types of problems)? Explain your reasoning.
   - Machine A: Read-only tape, scan-right only
   - Machine B: Read-write tape, scan in both directions

TODO: add your answer here

c) **[1 point]** Consider a simple abstract machine that can only output "Yes" or "No" (a decision problem solver) versus one that can write an output string to the tape (a function problem solver). For each of the following real-world computational tasks, identify whether it's better modeled as a decision problem or a function problem, and explain why:
   1. Checking if a password meets security requirements
   2. Translating text from English to Spanish
   3. Finding the shortest path between two cities
   4. Determining if a number is prime

TODO: add your answer here

## Problem 3: Computational Problems as Languages (3 points)

a) **[1 point]** Express the following computational problem as a formal language:
   "Given a positive integer n, determine if n is a perfect square (i.e., n = k² for some integer k)". Define the alphabet and describe the language precisely.

TODO: add your answer here

b) **[2 points]** Write a Java program in [PerfectSquareDecider.java](java/src/PerfectSquareDecider.java) that solves the perfect square problem.


## Problem 4: GitHub and Version Control (2 points)

Imagine you're starting a group project to build a simple calculator application with two teammates.

a) **[1 point]** List and briefly explain 4 specific benefits your team would gain from using GitHub for this project (based on the lecture notes and your understanding).

TODO: add your answer here

b) **[1 point]** Your teammate accidentally committed a file containing sensitive information (passwords) to the repository. Explain:
   - Why this is a serious problem even if the file is deleted in a later commit
   - What steps should be taken to properly address this issue

TODO: add your answer here

---