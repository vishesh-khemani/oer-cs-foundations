# Assignment Due 10/22
## NFA + Shell

**Total Points: 10**

---

## (2.5 points) Problem 1: Log Analysis and Report Generator

You are a system administrator managing multiple web servers. Each server generates log files that need to be analyzed daily. Write a shell script [log_analyzer.sh](./shell/log_analyzer.sh) that performs the following tasks:

**Requirements:**

1. The script should accept two command-line arguments:
   - The path to a log file (see [server.log](./shell/server.log) for an example)
   - An output directory for the report

2. The script should validate that:
   - Both arguments are provided (if not, display usage message and exit)
   - The log file exists and is readable
   - The output directory exists (if not, create it)

3. The script should analyze the log file and generate a report containing:
   - Total number of lines in the log
   - Number of ERROR messages (case-insensitive)
   - Number of WARNING messages (case-insensitive)
   - Top 5 most frequent error messages (just the unique error text, with counts)
   - List of unique IP addresses that generated errors (one per line)

   See [⁠report_20251012_143022.txt](./shell/⁠report_20251012_143022.txt) for an example.

4. The report should be saved as `report_YYYYMMDD_HHMMSS.txt` in the output directory (timestamp format based on when the script runs)

5. After generating the report, display a success message showing the full path to the generated report file.

**Deliverables:** 

1. Implement the script in [log_analyzer.sh](./shell/log_analyzer.sh)
2. Run the script on the following log file: [server.log](./shell/server.log)
3. Commit the report file and add a link here: [TODO: link to report](./shell/your-report-file.txt)

**Tools:**
- For this problem you're allowed to use the internet and/or AI to determine shell syntax for specific tasks only e.g. how to check for the existence of a file. But, it goes without saying, don't use AI to generate the entire script.

---   

## (2.5 points) Problem 2: Virtual NFA in Java
   
   Implement a virtual NFA in Java by addressing the TODOs in [NFA.java](java/src/NFA.java).

---

## (2.5 points) Problem 3: Email Validation NFA

   This is the same problem of email validation as in last week's assignment, except this time you'll use an NFA instead of a DFA to solve it.

   Design and implement an NFA that recognizes valid simplified email addresses. For this problem, a simplified email address is defined as a string that:
   - Starts with one or more letters (simplified to just 'a' or 'b' for this problem)
   - Followed by exactly one '@' symbol
   - Followed by one or more letters (again, just 'a' or 'b')
   - Ends with '.com'
   
   Your alphabet is: {'a', 'b', '@', '.', 'c', 'o', 'm'}

   1. Draw the complete state transition diagram for this NFA. Clearly mark the start state and accept state(s). You should find that the diagram is much simpler than that for a DFA from last week.

      **TODO: add your answer (mermaid or image)**

   2. Implement the TODOs in [EmailNFATest.java](java/src/EmailNFATest.java) to construct your NFA using the provided virtual NFA API from the previous problem.

---

## (2.5 points) Problem 4: NFA with Nondeterminism

Consider the following language over the alphabet Σ = {0, 1}:

**L = {w | w matches the pattern (01)\*0}**

In other words, the language consists of binary strings of the form:
   - Zero or more repetitions of "01"
   - Followed by a single "0"

Examples of strings in L: "0", "010", "01010", "0101010, ...

Examples of strings NOT in L: "", "1", "00", "10", "001", "0100", ...

1. Draw the complete state transition diagram for an NFA that recognizes this language.

   **TODO: add your diagram here**

1. Implement the TODOs in [RepeatedEndingNFATest.java](./java/src/RepeatedEndingNFATest.java) to construct your NFA using the provided virtual NFA API from the previous problem.

