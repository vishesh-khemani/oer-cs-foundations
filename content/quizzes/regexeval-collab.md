**Quiz: Regular Expression Evaluation & Collaborative Development**

Student Name: _____________________________________   &nbsp;&nbsp; Score: ________ / 5


**Instructions:** Each question is worth 0.5 points (5 points total).

**1.** Why is postfix notation preferred over infix notation when implementing a regular expression evaluator?  
A) Postfix notation requires fewer characters to represent the same expression  
B) Postfix notation eliminates the need for operator precedence rules and parentheses in evaluation code  
C) Postfix notation allows for faster string parsing  
D) Postfix notation supports more types of operators

**2.** In the postfix evaluation algorithm for converting REs to NFAs, what happens when an operator token is encountered?  
A) The operator is pushed onto the stack for later processing  
B) The operator is converted to an NFA and pushed onto the stack  
C) Operands are popped from the stack, the operation is performed, and the result is pushed back  
D) The stack is cleared and the operator becomes the new base NFA

**3.** Consider the infix regular expression `(a|b)*c`. What is its correct postfix representation?  
A) `ab|c*`  
B) `ab|*c.`  
C) `a|b*c.`  
D) `abc*|.`

**4.** Consider a postfix evaluator designed for boolean expressions where operands are `true` and `false`, and operators include `&` (AND), `|` (OR), and `!` (NOT). What would be the result of evaluating the postfix expression `true false & true |`?  
A) `true`  
B) `false`  
C) The expression is malformed  
D) The result depends on operator precedence

**5.** In a GitHub collaborative workflow, what is the primary purpose of creating a separate branch for each feature or issue?  
A) To reduce the size of the main repository  
B) To allow multiple developers to work simultaneously without conflicts and enable code review  
C) To automatically back up code in case of errors  
D) To improve the performance of git operations

**6.** Your team is working on a project where two developers simultaneously modify the same file on different branches. What will likely happen when the second developer tries to merge their branch into main?  
A) Git will automatically choose the most recent changes and discard the older ones  
B) The merge will fail completely and both sets of changes will be lost  
C) Git will detect a merge conflict that must be manually resolved before completing the merge  
D) The second branch will overwrite all changes from the first branch without warning

**7.** A team member pushes their feature branch to GitHub and creates a pull request. Before merging, what is the recommended next step?  
A) Immediately merge the branch to avoid conflicts  
B) Delete the feature branch and start over  
C) Assign a reviewer to conduct a code review before merging  
D) Copy the changes manually into the main branch

**8.** In the arithmetic postfix expression `1 4 1 - 2 * +`, what is the state of the stack right before the `*` operator is processed?  
A) `[1, 3, 2]`  
B) `[1, 4, 1, 2]`  
C) `[1, 6]`  
D) `[7]`

**9.** What git command sequence would you use to create a new branch called "fix-bug" and switch to it immediately?  
A) `git branch fix-bug` then `git switch fix-bug`  
B) `git checkout -b fix-bug`  
C) `git create fix-bug` then `git checkout fix-bug`  
D) `git merge fix-bug`

**10.** When implementing the RE → NFA conversion, which statement best describes the relationship between RE operators and NFA operations?  
A) Each RE operator corresponds to a completely new NFA that must be built from scratch  
B) RE operators map to NFA operations that combine existing NFAs using techniques like epsilon transitions  
C) RE operators are converted to postfix first, then discarded before building the NFA  
D) RE operators only affect the final accept state of the resulting NFA
