# Assignment Due 11/12
## Postfix Expressions + Collaboration

**Total Points: 10**

Rubric:
| Criteria                                     | Possible Points | Team or Individual |
| -------------------------------------------- | --------------- | ------------------ |
| Problems                                     | 7               | Team               |
| Indirect contribution<br>(e.g. code reviews) | 1               | Individual         |
| Direct Contribution<br>(e.g. code commits)   | 2               | Individual         |

Make sure that the assignment repo shows evidence of your individual contributions (direct and indirect), by following appropriate collaboration procedures.

---

## Planning and Procedures

As a team, plan a breakdown of the tasks involved in completing this assignment. **Create a GitHub issue** (in your assignment repo) for each task. Every issue must be assigned to a team member. Try to spread the work evenly across the team. You can change the assignees later if you need to.

As you work on this assignment, follow the collaboration procedures we covered in class. This involves the following for each team member:
- Clone the assignment repo to your computer
- Work on your assigned issues on separate git branches
- When you finish a task, create a GitHub pull request to merge your branch into the `main` branch
  - Assign all other team member as reviewers 
  - Incorporate their feedback as appropriate
  - Merge the change after receiving approvals. 

Note that the way I've set up the code scaffolding, you should be able to implement each task independently and have the code compile successfully. But, for the unit tests to pass, you will need some tasks to be completed before others. For example, although you can implement `ArithmeticEvaluator` before `PostfixEvaluator`, the unit tests for `ArithmeticEvaluator` can only pass after `PostfixEvaluator` is implemented.

---

## Problem 1: Postfix Evaluator

**(1 point)** Address the TODOs in [PostfixEvaluator.java](java/src/PostfixEvaluator.java) to implement a generic evaluator of postfix expressions of different types.

---

## Problem 2: Arithmetic Postfix Evaluator

(a) **(1 point)** Address the TODOs in [ArithmeticEvaluator.java](java/src/ArithmeticEvaluator.java) to implement an evaluator of arithmetic postfix expressions, using the generic `PostfixEvaluator`.

(b) **(1 point)** Address the TODOs in [ArithmeticEvaluatorTest.java](java/src/ArithmeticEvaluatorTest.java) to implement unit tests for `ArithmeticEvaluator.java`

---

## Problem 3: RE Postfix Evaluator

(a) **(1 point)** Address the TODOs in [REEvaluator.java](java/src/REEvaluator.java) to implement an evaluator of regular expressions in postfix notation, using the generic `PostfixEvaluator`.

(b) **(1 point)** Address the TODOs in [REEvaluatorTest.java](java/src/REEvaluatorTest.java) to implement unit tests for `REEvaluator.java`

---

## Problem 4: Regular Expressions

(a) **(1 point)** Address the TODOs in [REMatcher.java](java/src/REMatcher.java) to implement a matcher of regular expressions, using `REEvaluator`.

(b) **(1 point)** Address the TODOs in [REMatcherTest.java](java/src/REMatcherTest.java) to implement unit tests for `REMatcher.java`

---

## (3 points) Individual Contributions

Each team member should add a file to the repo listing your direct contributions (e.g. code) and indirect contributions (e.g. code reviews). This file should also be reviewed and approved by all your team members.

---
