**Quiz: Turing Machines**

Student Name: _____________________________________   &nbsp;&nbsp; Score: ________ / 5

**Instructions:** Select the best answer for each question. Each question is worth 0.5 points (5 points total).

**1.** What is the primary difference between a Deterministic Finite Automaton (DFA) and a Turing Machine in terms of memory capabilities?  
A) DFAs can store unlimited data while TMs have fixed memory  
B) TMs have an infinite tape that can be read and written, while DFAs have only fixed states  
C) DFAs use a stack for memory while TMs use only states  
D) Both have identical memory capabilities but differ in processing speed

**2.** Consider a Turing Machine processing the binary string "101" on its tape. If the tape head moves right twice and then left once, what aspect of TM capability does this demonstrate that DFAs lack?  
A) The ability to accept strings  
B) The ability to reject strings  
C) Bidirectional tape movement  
D) The ability to transition between states

**3.** Why do Turing Machines need explicit reject states while DFAs do not?  
A) TMs are more complex and require more states  
B) TMs can run indefinitely, so rejection must be explicitly specified  
C) DFAs automatically reject after a fixed number of steps  
D) Reject states make TMs faster than DFAs

**4.** When implementing a Turing Machine's tape in Java, what data structure strategy is recommended to handle the infinite tape?  
A) A single ArrayList that grows dynamically  
B) Two stacks representing symbols to the left and right of the current position  
C) A HashMap with integer indices as keys  
D) A circular buffer with wraparound

**5.** What does the transition notation "0:1,R" mean in a Turing Machine state diagram?  
A) Read 0 or 1, then move right  
B) Read 0, write 1, then move right  
C) Read 1, write 0, then move left  
D) Read anything, write 0 or 1, then move right

**6.** Which language can a Turing Machine recognize that a DFA cannot?  
A) All strings ending in "1"  
B) Strings containing an even number of 0s  
C) Strings of the form $0^n1^n$ where $n \ge 0$  
D) Strings with alternating 0s and 1s

**7.** Consider a TM that starts in state q0 with input "110" on the tape. From q0, the transitions are: "1:0,R" to q1, and from q1: "1:1,R" to q1, "0:1,L" to q2 (accept state). After the machine accepts, what symbols are on the tape positions that originally held the input?  
A) 110  
B) 010  
C) 011  
D) 001

**8.** The special blank symbol ⊔ in a Turing Machine serves what purpose?  
A) It marks the accept state  
B) It denotes empty tape cells beyond the input  
C) It separates multiple inputs on the tape  
D) It represents an error condition

**9.** What happens when a Turing Machine reaches an accept or reject state?  
A) It continues processing but marks the state as final  
B) It moves the tape head back to the beginning  
C) It halts immediately without any further processing  
D) It enters a loop to verify the decision

**10.** A binary incrementer TM scans right until it finds ⊔, then moves left flipping all 1s to 0s until it finds a 0 (or ⊔), which it flips to 1. If the input is "111", what is the final tape content?  
A) 111  
B) 1000  
C) 000  
D) 1111
