# Quiz 10/29: Unit Tests + Regular Expressions

Student Name: _____________________________________________   &nbsp;&nbsp; Score: ____ / 5

1. **(0.5 points)** According to the Testing Pyramid Model, which statement best describes the relationship between test types and their characteristics?
   1. Unit tests should comprise approximately 10% of your test suite, run slowly, and test the entire application from the user's perspective
   2. Integration tests should comprise approximately 70% of your test suite, run in milliseconds, and test individual methods in isolation
   3. End-to-End tests should comprise approximately 10% of your test suite, have high creation/debugging costs, and test complete user workflows
   4. System tests should comprise approximately 20% of your test suite, run in milliseconds, and mock all external dependencies

2. **(0.5 points)** A developer is writing a test class for a UserService that requires a fresh database connection for each test. Which JUnit annotation should be used to ensure the database connection is properly initialized before each individual test method runs?
   1. ⁠@BeforeAll - to set up the database connection once for all tests
   2. @BeforeEach - to set up a fresh database connection before each test
   3. @Test - to mark the database setup as a test method
   4. @DisplayName - to label the database connection setup clearly

3. **(0.5 points)** A developer needs to test that a Calculator's divide method properly handles division by zero. Which assertion approach correctly verifies that an ArithmeticException is thrown?
   1. ⁠assertEquals(ArithmeticException.class, calc.divide(10, 0));
   2. assertTrue(calc.divide(10, 0) throws ArithmeticException);
   3. assertThrows(ArithmeticException.class, () -> { calc.divide(10, 0); });
   4. assertNull(calc.divide(10, 0));

4. **(0.5 points)** Which of the following test scenarios would be classified as a Unit Test rather than an Integration Test?
   1. Testing a UserService's createUser method that saves data to a real database through a UserRepository
   2. Testing a REST API endpoint that processes an HTTP request and returns a JSON response
   3. Testing a TaxCalculator's calculate method with mocked dependencies and no external resources
   4. Testing that a DAO layer correctly persists and retrieves data from an actual database

5. **(0.5 points)** When constructing an NFA for the closure (Kleene star) of a language $L$, we create a new start state and make it an accept state. Why is it necessary to make this new start state an accept state?
   1. So that the NFA can transition back to itself and repeat the pattern indefinitely.
   2. So that the empty string is accepted, which must be in $L^*$ for any language $L$.
   3. So that the original NFA's accept states can have ε-transitions leading away from them.
   4. So that users can optionally skip the original NFA entirely during execution.

6. **(0.5 points)**  language designer wants to construct an NFA that accepts any string of the form: one or more occurrences of either "cat" or "dog", where the strings can be mixed in any order (e.g., "catdog", "dogcat", "catcatdog", etc.). Which of the following correctly describes the sequence of operations needed?
   1. Union of two languages, then concatenation of the result with itself.
   2. Concatenation of two languages, then closure of the result.
   3. Closure of the union of two languages.
   4. Union of two closures.

7. **(0.5 points)** When constructing an NFA for the concatenation $N_1 \cdot N_2$, we add ε-transitions from all accept states of $N_1$ to the start state of $N_2$. Why is it important that we add these transitions from all accept states, not just one?
   1. To ensure that $N_1$ has at least one accept state available for the next iteration.
   2. To allow any string accepted by $N_1$ to transition to $N_2$ for the suffix part, regardless of which accept state was reached.
   3. To make the NFA deterministic and reduce the number of states needed.
   4. To prevent $N_2$ from being reached before $N_1$ has fully accepted a string.

8. **(0.5 points)** Consider the regular expression ⁠(0|1)\*01 over the alphabet {0, 1}. Which of the following strings is NOT in the language described by this regular expression?
   1. ⁠01
   2. 10101
   3. 001
   4. 10
9. **(0.5 points)** Which of the following regular expressions describes the language of all strings over {a, b} that contain at least one 'a'?
    1. a\*
    2. (a|b)\*a(a|b)\*
    3. ⁠a(a|b)\*
    4. (a|b)\*

10. **(0.5 points)** According to Kleene's Theorem, which of the following statements is true?
    1. Regular expressions are more powerful than DFAs but less powerful than NFAs
    2. DFAs, NFAs, and regular expressions are equivalent models for describing regular languages
    3. NFAs can recognize languages that regular expressions cannot describe
    4. Regular expressions can describe languages that DFAs cannot recognize

---
