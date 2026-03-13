# Assignment Due 11/26
## Formal Algorithms + Church-Turing Thesis

**Total Points: 10**

---

# Problem 1 : Language Classification (3 points)

Consider the languages below, each over the alphabet {a, b}.

- ALL = {w | w is a string consisting of 0 or more symbols}
- PALINDROME = {w | w is a string that reads the same forwards and backwards}
- PERMUTABLE = { <A, B> | A and B are strings that are permutations of each other}
- MIN_LENGTH = {w | w is a string containing at least 3 symbols}
- HALT = {<M, w> | M is a TM that halts on the input w}
- INFINITE_LOOP = {<M, w> | M is a TM that loops forever on the input w}


(a) Fill the table below, replacing each '?' with a 'Y' (for yes) or a 'N' (for no). 

**TODO: fill table below**

|               | Regular | Decidable | Recognizable |
| ------------- | ------- | --------- | ------------ |
| ALL           | Y       | Y         | Y            |
| PALINDROME    | N       | Y         | Y            |
| PERMUTABLE    | N       | Y         | Y            |
| MIN_LENGTH    | Y       | Y         | Y            |
| HALT          | N       | N         | Y            |
| INFINITE_LOOP | N       | N         | N            |


(b) Explain your answers in the table above in 1-3 sentences for each language.

**ALL** - A DFA can can accept this language with a start and an accept state. It is also automatically Decidable and Recognizable as those are the parents of Regular Languages.
**PALINDROME** - A Turing Machine can compare the first and last symbols then move inward, halting upon any rejection. If all symbols are matched, it accepts. It is not Regular since NFA/DFAs can't compare one half of the string to the second half. Since it is Decidable, it's automatically Recognizable.
**PERMUTABLE** -Decidable and Recognizable, but not handled by NFA/DFA due to limited ability to remember entire string contents.
**MIN_LENGTH** - Are Regular since quantifiers can be used such as "matching characters n number of times, i.e. 2 or more times.
**HALT** -Halting problem requires infinite memory, which DFA/NFAs cannot have (they are finite), therefore not Regular. Also not Decidable per Turing's 1936 Thesis, but it is Recognizable.
**INFINITE_LOOP** - Not Recognizable, Decidable, nor Regular since it would run forever, therefore you couldn't recognize nor decide that it loops forever. If you could, you could also say it halts (which isn't provable per Turing's 1936 thesis).

---

# Problem 2: Virtual UTM in Java (4 points)

Address the TODOs in [UTM.java](java/src/UTM.java) to complete the implementation of a Universal Turing Machine. Make sure that all the unit tests provided in [UTMTest.java](java/src/UTMTest.java) pass.

---

# Problem 3: Church-Turing Thesis (3 points)

Your friend is learning about different programming languages and makes the following statements. For each statement, indicate whether it is TRUE or FALSE according to the Church-Turing Thesis, and provide a brief explanation (1-3 sentences) justifying your answer.

Statement A: "Python can solve problems that Java cannot solve because Python has more built-in libraries and is easier to use."

While different languages have differing (albeit many similar) libraries, the computer these high level languages run on top of are "Turing Complete", which means one language is not actually "more powerful" than the other, but rather equivalent in computational power.   

- FALSE: All general-purpose languages are equivalent in power, so Python and Java can solve exactly the same problems because both are Turing complete.


Statement B: "Assembly language is less powerful than high-level languages like C++ because assembly is harder to write and understand."

Assembly language is closer to the machine language a computer understands to execute instructions. While it does require considerable patience to code and debug, that doesn't make it less powerful than high level languages like C++ which are easier to write and understand. Both languages run on top of a "Universal Turing Machine" (UTM) computer that has the same computational power regardless of the language used to create software that runs on it.

- FALSE: Assembly and C++ are Turing complete languages, so they have the same power.


Statement C: "If we invented a brand new programming language with completely revolutionary features, it might be able to solve problems that are currently impossible to solve on any computer."

Underneath your brand new language, despite new, whizbang features it would still be no more powerful computationally, meaning problems that cannot be solved by a UTM are still unsolvable until something more powerful than a Turing Machine is created.

- FALSE: Turing Machines represent the pinnacle of computational power, and if a TM can't do it, nothing can.


---

# Extra Credit Problem 1
## For fame and glory (and an automatic 4.0 in this class)

Invent a computational model that is more powerful than the Turing Machine model i.e. can solve at least one problem that a Turing Machine can't. 
Ummm....
---

# Extra Credit Problem 2
## For fame and glory (and an automatic 4.0 in this class)

Prove or disprove that the Turing Machine model is the most powerful possible computational model.
Ummm again....
---

**Answer:** I'm assuming the question to invent a computational model that is more powerful than a Turing Machine *that is proven to be physically possible*, or prove or disprove that the Turing Machine model is the most powerful possible computational model *that is proven to be physically possible*, otherwise I could just point at Oracle Machines or Zeno Machines, or computers taking advantage of Malament-Hogarth spacetimes (computers sent around black holes) that are physically possible given our knowledge of physics but don't reliably meet the usability constraint and are steeped in the same problems which surround black holes in physics. This was a cool thing to research though, there's more research in this field than I previously thought. Also, if the questions were without that stipulation I put on top of them, I'll be taking that 4.0 in this class lol
