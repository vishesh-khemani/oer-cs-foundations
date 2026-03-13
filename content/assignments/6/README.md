# Assignment Due 11/19
## Turing Machines

**Total Points: 10 (+4 extra credit)**

---

# Problem 1: Virtual TM in Java (4 points)

(a) Address the TODOs in [Tape.java](java/src/Tape.java) to complete the implementation of a Turing Machine tape. Make sure that all the unit tests provided in [TapeTest.java](java/src/TapeTest.java) pass.

(b) Address the TODOs in [TM.java](java/src/TM.java) to complete the implementation of a virtual Turing Machine. Make sure that all the unit tests provided in [TMTest.java](java/src/TMTest.java) pass.

---

# Problem 2: Binary Complement TM (3 points)

Problem:
- Input: tape containing a binary string with the tape head positioned at the start of the string
- Output: tape containing the one's complement of the input string (i.e. each bit flipped) with the tape head positioned at the start of the string
- Decision: accept unless the input is malformed

Examples:
- Input: `0`, Output: `1`, Decision: `accept`
- Input: `1`, Output: `0`, Decision: `accept`
- Input: `101`, Output: `010`, Decision: `accept`
- Input: `2`, Output: `2`, Decision: `reject`

(a) Draw the state transition diagram for this TM.

**TODO: add your diagram here**

(b) Address the TODOs in [ComplementTMTest.java](java/src/ComplementTMTest.java) to construct the TM and verify that unit tests pass.

---

# Problem 3: Filter TM (3 points)

Problem:
- Input: tape containing a binary string with the tape head positioned at the start of the string
- Output: tape containing the input binary string but with all 0s removed (and the tape head at the start of the string)
- Decision: accept unless the input is malformed

Examples:
- Input: `1`, Output: `1`, Decision: `accept`
- Input: `101`, Output: `11`, Decision: `accept`
- Input: `0000`, Output: `empty`, Decision: `accept`
- Input: `2`, Output: `2`, Decision: `reject`

(a) Draw the state transition diagram for this TM.

**TODO: add your diagram here**

(b) Address the TODOs in [FilterTMTest.java](java/src/FilterTMTest.java) to construct the TM and verify that unit tests pass.

---

# Extra Credit: String Reverse TM (2 points)

Problem:
- Input: tape containing a string over the alphabet {a, b} (with the tape head positioned at the start of the string)
- Output: tape containing the reverse of the input string (with the tape head positioned at the start of the string)
- Decision: accept unless the input is malformed

Examples:
- Input: `a`, Output: `a`, Decision: `accept`
- Input: `ab`, Output: `ba`, Decision: `accept`
- Input: `abba`, Output: `abba`, Decision: `accept`
- Input: `baa`, Output: `aab`, Decision: `accept`
- Input: `c`, Output: `c`, Decision: `reject`


(a) Draw the state transition diagram for this TM.

**TODO: add your diagram here**

(b) Address the TODOs in [ReverseTMTest.java](java/src/ReverseTMTest.java) to construct the TM and verify that unit tests pass.

---

# Extra Credit: Is Palindrome TM (2 points)

Problem:
- Input: tape containing a string over the alphabet {a, b} (with the tape head positioned at the start of the string)
- Output: don't care
- Decision: accept if the input is well-formed and is a palindrome, otherwise reject

Examples:
- Input: `a`, Decision: `accept`
- Input: `ab`, Decision: `reject`
- Input: `abba`, Decision: `accept`
- Input: `baa`, Decision: `reject`
- Input: `c`, Output: `c`, Decision: `reject`


(a) Draw the state transition diagram for this TM.

**TODO: add your diagram here**

(b) Address the TODOs in [PalindromeTMTest.java](java/src/PalindromeTMTest.java) to construct the TM and verify that unit tests pass.

---