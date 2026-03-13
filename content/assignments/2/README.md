# Assignment Due 10/15
## DFA + Git

**Total Points: 10**

---
1. **Git**

   Use Git commands to work on this assignment. Write the sequence of Git commands you used to:

   1. **(0.25 points)** Clone the repository to your local machine

      **TODO: add your answer**

   2. **(0.25 points)** Stage some changes for commit

      **TODO: add your answer**

   3. **(0.25 points)** Commit the staged changes

      **TODO: add your answer**
      
   4. **(0.25 points)** Push the committed changes to GitHub

      **TODO: add your answer**

---   

2. **(3 points) Virtual DFA in Java** 
   
   Implement a virtual DFA in Java by addressing the TODOs in [DFA.java](java/src/DFA.java).

---

3. **Email DFA**

   Design and implement a DFA that recognizes valid simplified email addresses. For this problem, a simplified email address is defined as a string that:
   - Starts with one or more letters (simplified to just 'a' or 'b' for this problem)
   - Followed by exactly one '@' symbol
   - Followed by one or more letters (again, just 'a' or 'b')
   - Ends with '.com'
   
   Your alphabet is: {'a', 'b', '@', '.', 'c', 'o', 'm'}

   1. **(2 points):** Draw the complete state transition diagram for this DFA. Clearly mark the start state and accept state(s). Include all transitions, including those that lead to a "dead" or "trap" state for invalid inputs.

      **TODO: add your answer**

   2. **(1 point):** Implement the TODOs in [EmailDFATest.java](java/src/EmailDFATest.java) to construct your DFA using the provided virtual DFA API from the previous problem.

---
   
4. **Lock DFA**
   
   Design and implement a DFA for a simplified combination lock system. The lock uses a sequence of Left (L) and Right (R) turns. The correct combination is "LRL" (Left-Right-Left). The lock has the following behavior:
   - The lock opens (accepts) only after the exact sequence "LRL" is entered
   - If at any point the wrong turn is made, the lock resets to the beginning (you must start the combination over)
   - After successfully opening (entering "LRL"), any additional input should cause rejection (the lock re-locks for security)
   
   Your alphabet is: {'L', 'R'}

   1. **(1 point):** Draw the complete state transition diagram for this DFA. Label each state with a meaningful name that indicates what portion of the combination has been correctly entered so far.

      **TODO: add your answer**

   2. **(1 point):** Create a state transition table showing all states and their transitions for both 'L' and 'R' inputs.

      **TODO: add your answer**

   3. **(1 point):** Implement the TODOs in [LockDFATest.java](java/src/LockDFATest.java) to construct your DFA using the provided virtual DFA API from the previous problem.

---
