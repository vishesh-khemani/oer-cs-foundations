# Quiz 10/15: DFA + Git

Student Name: _____________________________________________

1. **(0.5 points)** After making changes to files in your local repository and running `git commit -m "Fix login bug"`, which statement is TRUE?
   1. The changes are immediately visible on GitHub
   2. The changes are saved to your local repository only
   3. The changes are automatically merged with the main branch
   4. The changes are lost if you don't run `git add` first

1. **(0.5 points)** You are working on a new feature in your project when your manager asks you to immediately fix a critical bug in production. According to Git best practices, what should you do FIRST?
   1. Commit your incomplete feature work to the main branch and then fix the bug
   2. Delete all your feature changes to start fresh with the bug fix
   3. Create a new branch from main for the bug fix, leaving your feature work in its current branch
   4. Continue working on the feature and fix the bug afterwards

1. **(0.5 points)** Which of the following is NOT a required component of a DFA?
   1. Transitions defined for every input symbol from every state
   2. A unique start state where processing begins
   3. Self-loop transitions on at least one state
   4. A finite alphabet of input symbols

2. **(0.5 points)** Which of the following statements about DFAs is TRUE?
   1. A DFA must have at least one accept state that is different from the start state
   2. Every DFA recognizes exactly one string from its alphabet
   3. If a language is recognized by some DFA, then it is called a regular language
   4. A DFA can have multiple start states if the language is complex enough

3. **(1 point)** Consider a DFA with alphabet {0, 1} that has three states: q₀ (start state), q₁, and q₂ (accept state). The DFA has the following transitions:

   ![alt text](<Screenshot 2025-10-12 at 2.38.27 PM.png>)

   Which of the following strings is NOT accepted by this DFA?

   1. "00"
   2. "1100"
   3. "0010"
   4. "10100"

4.  **(1 point)** You need to design a DFA with alphabet {a, b} that accepts strings containing exactly two a's (not more, not less). Which of the following state descriptions would be NECESSARY for this DFA?
    1. Two states: one for "even number of a's" and one for "odd number of a's"
    2. Three states: for 0, 1, or 2+ a's seen so far
    3. Four states: for 0, 1, 2, or 3+ a's seen so far
    4. Five states: one for each possible position of the two a's in the string

5. **(1 point)** A DFA has alphabet {0, 1} with two states: q₀ (start and accept state) and q₁. The transitions are:

   |        | 0   | 1   |
   | ------ | --- | --- |
   | **q0** | q1  | q0  |
   | **q1** | q0  | q1  |
   
   Which of the following best describes the language recognized by this DFA?

   1. Binary strings with an odd number of 0s
   2. Binary strings with an even number of 0s (including zero 0s)
   3. Binary strings that begin and end with the same symbol
   4. Binary strings where every 0 is immediately followed by another 0

---
