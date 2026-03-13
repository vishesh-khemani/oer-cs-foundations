# Quiz 10/22: Shell + NFA

Student Name: _____________________________________________   &nbsp;&nbsp; Score: ____ / 5

1. **(0.5 points)** You need to copy all files that start with "data" followed by exactly two digits and ending with ".csv" (e.g., data01.csv, data99.csv, but not data1.csv or data100.csv) to a backup directory. Which command correctly accomplishes this?

   1. `cp data*.csv backup/`
   2. `cp data??.csv backup/`
   3. `cp data[0-9][0-9].csv backup/`
   4. `cp data[0-9]*.csv backup/`

1. **(0.5 points)** You want to find all `.txt` files in the current directory, sort them alphabetically, and save the result to a file called `sorted_files.txt`. Which command accomplishes this?

   1. `ls *.txt > sorted_files.txt | sort`
   2. `ls *.txt | sort > sorted_files.txt`
   3. `ls *.txt | sort | sorted_files.txt`
   4. `sort ls *.txt > sorted_files.txt`

1. **(0.5 points)** A file has permissions `-rwxr-x---`. What octal notation represents these permissions?

   1. `755`
   2. `750`
   3. `754`
   4. `740`

1. **(0.5 points)** Which command will correctly find lines in `file.txt` containing 2 digits within parentheses e.g. `(64)`?

   1. `grep "(64)" file.txt`
   2. `grep -E "\([0-9][0-9]\)" file.txt`
   3. `grep -E "([0-9])*" file.txt`
   4. `grep "(*)" file.txt`

1. **(0.5 points)** Consider an NFA with 4 states. When converting this NFA to an equivalent DFA using the subset construction method, what is the maximum number of states the resulting DFA could theoretically have?
   1. 4
   2. 8
   3. 16
   4. 32

1. **(0.5 points)** An NFA is processing the string "101" and reaches a point where from the current state, reading '0' can lead to three different states: q2, q3, and q4. State q2 eventually leads to a reject state, q3 leads to another reject state, but q4 leads to an accept state. What is the outcome for this string?
   1. The string is rejected because most paths lead to reject states
   2. The string is accepted because at least one path leads to an accept state
   3. The string causes an error due to multiple transitions
   4. The string is rejected because the first path explored (q2) leads to a reject state

1. **(0.5 points)** Which of the following statements about null transitions (ε-transitions) in NFAs is FALSE?
   1. Null transitions allow a state to move to another state without consuming any input symbol
   2. Null transitions can create loops that must be handled carefully to avoid infinite recursion
   3. Null transitions make NFAs strictly more powerful than DFAs in terms of languages they can recognize
   4. Multiple null transitions can be followed in sequence before reading the next input symbol

1. **(0.5 points)** In an NFA, state q5 has no outgoing transition for the symbol '0'. If the NFA is currently in state q5 and reads '0' from the input string, what happens?
   1. The NFA crashes and reports an error
   2. The NFA automatically transitions to the start state
   3. This particular path dies/rejects, but other parallel paths may continue
   4. The NFA stays in state q5 and continues with the next symbol

1. **(0.5 points)** Which of the following is the correct definition of a regular language?
   1. A language that can only be recognized by a DFA, not an NFA
   2. A language that can be recognized by either a DFA or an NFA
   3. A language that requires an NFA with null transitions to recognize
   4. A language where all strings follow a regular pattern of repeating symbols

1. **(0.5 points)** For recognizing binary strings ending in "1", the DFA requires 2 states while the NFA also requires 2 states. Given that both have the same number of states, why might someone still prefer the NFA representation?
   1. The NFA is always faster to execute than the DFA
   2. The NFA only needs to define transitions for some symbols, making it simpler to specify
   3. The NFA can handle errors better than the DFA
   4. The NFA uses less memory during execution

---

