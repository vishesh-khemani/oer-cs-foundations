import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NFAOpsTest {

    @Test
    public void testCreateForSymbol() {
        NFA nfa = NFAOps.createForSymbol('a');
        assertTrue(nfa.accepts("a"));
        assertFalse(nfa.accepts("b"));
        assertFalse(nfa.accepts("aa"));
        assertFalse(nfa.accepts(""));
    }

    @Test
    public void testUnion() {
        NFA n1 = NFAOps.createForSymbol('a');
        NFA n2 = NFAOps.createForSymbol('b');
        NFA union = NFAOps.union(n1, n2);

        assertTrue(union.accepts("a"));
        assertTrue(union.accepts("b"));
        assertFalse(union.accepts("ab"));
        assertFalse(union.accepts("ba"));
    }

    @Test
    public void testConcatenation() {
        NFA n1 = NFAOps.createForSymbol('a');
        NFA n2 = NFAOps.createForSymbol('b');
        NFA result = NFAOps.concatenation(n1, n2);

        assertTrue(result.accepts("ab"));
        assertFalse(result.accepts("aa"));
        assertFalse(result.accepts("bb"));
        assertFalse(result.accepts("ba"));
        assertFalse(result.accepts("abab"));
    }

    @Test
    public void testClosure() {
        NFA n1 = NFAOps.createForSymbol('a');
        NFA closure = NFAOps.closure(n1);

        assertTrue(closure.accepts(""));
        assertTrue(closure.accepts("a"));
        assertTrue(closure.accepts("aa"));
        assertTrue(closure.accepts("aaa"));
        assertFalse(closure.accepts("b"));
        assertFalse(closure.accepts("ab"));
        assertFalse(closure.accepts("ba"));
        assertFalse(closure.accepts("bb"));
    }
}