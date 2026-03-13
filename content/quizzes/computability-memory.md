# Quiz: Computability and Memory Management

Student Name: _____________________________________   &nbsp;&nbsp; Score: ________ / 5

**Instructions:** Select the best answer for each question. Each question is worth 0.5 points (5 points total).

---

**1.** What is the fundamental reason that some computational problems must be unsolvable?  
A) Computers don't have enough memory to solve them  
B) The set of all possible languages is uncountable while the set of all Turing machines is countable  
C) Programming languages aren't expressive enough  
D) Current algorithms are not efficient enough

**2.** In the Java implementation of a Turing machine, why is a two-stack approach used to simulate the infinite tape?  
A) Because Java doesn't support arrays larger than 2GB  
B) Because stacks are faster than arrays for random access  
C) To efficiently represent an infinite tape where one stack holds symbols to the left and another holds symbols to the right of the current position  
D) Because the Turing machine specification requires exactly two stacks

**3.** Consider this code attempting to detect infinite loops:
```java
public static boolean halts(String javaCode, String input) {
    // Returns true if the code halts on input
}
```
What happens when we create a contrarian function that loops forever if `halts` says it halts, and halts if `halts` says it loops?  
A) The contrarian function works correctly but is very slow  
B) Both cases lead to logical contradictions, proving halts cannot exist  
C) The contrarian function halts on all inputs  
D) The contrarian function only fails on specially crafted inputs

**4.** Which memory region in a running program grows downward from high addresses and contains local variables and function call information?  
A) Heap  
B) Data segment  
C) Stack  
D) Text segment

**5.** According to Rice's Theorem, which of the following program properties is decidable?  
A) Whether a program computes prime numbers  
B) Whether a program's source code contains the keyword "while"  
C) Whether a program ever outputs "error"  
D) Whether a program terminates in under 100 steps

**6.** What is the primary tradeoff between stack and heap memory allocation?  
A) Stack is slower but more flexible; heap is faster but limited in size  
B) Stack is automatic and fast but limited in size; heap is flexible and large but requires manual management  
C) Stack can only store integers; heap can store any data type  
D) Stack is used for global variables; heap is used for local variables

**7.** In the proof that the halting problem is undecidable using diagonalization, what creates the contradiction?  
A) The table of all Turing machines is too large to construct  
B) The contrarian TM's entry for itself must be the opposite of itself on the diagonal  
C) Turing machines cannot be encoded as strings  
D) The decider runs out of tape space

**8.** What is the most common cause of memory leaks in manual memory management (C/C++)?  
A) Allocating memory with malloc instead of new  
B) Forgetting to free dynamically allocated memory before losing the pointer  
C) Using the stack instead of the heap  
D) Declaring too many local variables

**9.** If Problem A reduces to Problem B, and we know Problem A is undecidable, what can we conclude?  
A) Problem B must also be undecidable  
B) Problem B is easier to solve than Problem A  
C) Problem B is decidable  
D) We cannot determine anything about Problem B

**10.** Which code optimization takes advantage of the CPU cache structure by accessing memory sequentially rather than jumping around?  
A) Using smaller data types to save memory  
B) Row-major access of matrices instead of column-major access  
C) Allocating all memory at program startup  
D) Using recursion instead of loops
