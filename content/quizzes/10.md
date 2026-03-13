# Quiz: Beyond Regular Languages and Turing Machines

**Instructions:** Select the best answer for each question. Each question is worth 0.5 points (5 points total).

**1.** Which of the following best explains why the language L = {$0^n1^n$ | $n \ge 0$} cannot be recognized by a DFA?  
A) The alphabet contains two symbols instead of one  
B) Recognizing the language requires counting an unbounded number of 0s, which would require an infinite number of states  
C) DFAs can only process strings from left to right once  
D) The language contains an infinite number of strings

**2.** A Pushdown Automaton (PDA) enhances a DFA by adding which computational capability?  
A) The ability to move the tape head both left and right  
B) Multiple accept states instead of just one  
C) An unbounded LIFO stack for storing and retrieving symbols  
D) The ability to write symbols on the input tape

**3.** Given a Turing Machine with the transition "0:1,R" from state $q_0$ to state $q_1$, what happens when the TM reads a 0 while in state $q_0$?  
A) It writes 0, moves right, and transitions to $q_1$  
B) It writes 1, moves right, and transitions to $q_1$  
C) It writes 1, moves left, and transitions to $q_1$  
D) It rejects the input immediately

**4.** In the computational hierarchy, which statement correctly describes the relationship between language classes?  
A) Regular languages and context-free languages are equivalent in power  
B) All regular languages are context-free languages, but not all context-free languages are regular  
C) Context-free languages are more restrictive than regular languages  
D) Turing machines can only recognize regular and context-free languages

**5.** Why do Turing Machines require explicit reject states whereas DFAs do not?  
A) DFAs are more powerful and can implicitly reject at non-accept states  
B) TMs can run indefinitely, so they need explicit rejection to halt properly  
C) Reject states allow TMs to output error messages  
D) DFAs always accept their input, so rejection is unnecessary

**6.** The language {$a^nb^nc^n$ | $n \ge 0$} with equal numbers of a's followed by b's followed by c's is classified as:  
A) A regular language that can be recognized by a DFA  
B) A context-free language that can be recognized by a PDA  
C) A context-sensitive language that requires a Linear Bounded Automaton  
D) An unrecognizable language that no machine can decide

**7.** In a Java implementation of a virtual Turing Machine, which strategy is most appropriate for representing the infinite tape?  
A) Use a fixed-size array with a large enough capacity  
B) Use two stacks to represent symbols to the left and right of the current position  
C) Store only the input string and compute positions dynamically  
D) Use a circular buffer that wraps around at the edges

**8.** A binary incrementer Turing Machine processes the input "101". The strategy is to scan right to the end, then move left flipping 1s to 0s until hitting a 0 or blank, which gets flipped to 1. What will be the output?  
A) 100  
B) 102  
C) 110  
D) 111

**9.** Which property distinguishes Turing-complete systems from less powerful computational models like PDAs?  
A) Turing-complete systems can only recognize regular languages  
B) Turing-complete systems represent the maximum possible computational power  
C) Turing-complete systems are always faster than other models  
D) Turing-complete systems require fewer states than finite automata

**10.** Which of the following examples best demonstrates a practical application where understanding the limitations of regular languages is important?  
A) Choosing between a DFA and NFA for pattern matching in a text editor  
B) Recognizing that a compiler cannot use only regular expressions to parse nested programming language constructs like balanced parentheses  
C) Deciding whether to use a hash table or binary search tree for data storage  
D) Optimizing the number of states in a finite automaton for network protocol validation
