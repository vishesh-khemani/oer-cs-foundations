import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NFATest {

    @Test
    public void testEndingInOne() {
        NFA.State pendingOne = new NFA.State();
        NFA.State accept = new NFA.State();

        NFA nfa = new NFA();
        nfa.setStartState(pendingOne);
        nfa.addAcceptState(accept);

        pendingOne.addTransition('0', pendingOne);
        pendingOne.addTransition('1', pendingOne);
        pendingOne.addTransition('1', accept);

        assertTrue(nfa.accepts("1"));
        assertTrue(nfa.accepts("10101"));
        assertTrue(nfa.accepts("1111"));
        assertTrue(nfa.accepts("00001"));
        assertFalse(nfa.accepts(""));
        assertFalse(nfa.accepts("0"));
        assertFalse(nfa.accepts("10"));
    }

    @Test
    public void testEndingInZeroOne() {
        NFA.State pendingZero = new NFA.State();
        NFA.State pendingOne = new NFA.State();
        NFA.State accept = new NFA.State();

        NFA nfa = new NFA();
        nfa.setStartState(pendingZero);
        nfa.addAcceptState(accept);

        pendingZero.addTransition('0', pendingZero);
        pendingZero.addTransition('1', pendingZero);
        pendingZero.addTransition('0', pendingOne);
        pendingOne.addTransition('1', accept);

        assertTrue(nfa.accepts("01"));
        assertTrue(nfa.accepts("10101"));
        assertTrue(nfa.accepts("11101"));
        assertTrue(nfa.accepts("00001"));
        assertFalse(nfa.accepts(""));
        assertFalse(nfa.accepts("0"));
        assertFalse(nfa.accepts("1"));
        assertFalse(nfa.accepts("11"));
        assertFalse(nfa.accepts("00"));
    }

    @Test
    public void testUnion() {
        NFA.State q1 = new NFA.State();
        NFA.State even0 = new NFA.State();
        NFA.State q2 = new NFA.State();
        NFA.State odd1 = new NFA.State();
        NFA.State q3 = new NFA.State();

        NFA nfa = new NFA();
        nfa.setStartState(q1);
        nfa.addAcceptState(even0);
        nfa.addAcceptState(odd1);

        q1.addTransition('\0', even0);
        q1.addTransition('\0', q3);

        even0.addTransition('0', q2);
        even0.addTransition('1', even0);
        q2.addTransition('0', even0);
        q2.addTransition('1', q2);

        q3.addTransition('0', q3);
        q3.addTransition('1', odd1);
        odd1.addTransition('0', odd1);
        odd1.addTransition('1', q3);

        assertTrue(nfa.accepts(""));
        assertTrue(nfa.accepts("00"));
        assertTrue(nfa.accepts("1"));
        assertTrue(nfa.accepts("11"));
        assertTrue(nfa.accepts("0111"));
        assertTrue(nfa.accepts("010100"));

        assertFalse(nfa.accepts("0"));
        assertFalse(nfa.accepts("101"));
        assertFalse(nfa.accepts("11000"));
    }

    @Test
    public void testClosure1() {
        NFA.State start = new NFA.State();
        NFA.State seenA = new NFA.State();
        NFA.State seenAB = new NFA.State();

        NFA nfa = new NFA();
        nfa.setStartState(start);
        nfa.addAcceptState(seenAB);

        start.addTransition('a', seenA);
        seenA.addTransition('b', seenAB);
        start.addTransition('\0', seenAB);
        seenAB.addTransition('\0', start);

        assertTrue(nfa.accepts(""));
        assertTrue(nfa.accepts("ab"));
        assertTrue(nfa.accepts("abab"));

        assertFalse(nfa.accepts("a"));
        assertFalse(nfa.accepts("b"));
        assertFalse(nfa.accepts("aba"));
        assertFalse(nfa.accepts("abb"));
    }

    @Test
    public void testClosure2() {
        NFA.State start = new NFA.State();
        NFA.State seenA = new NFA.State();
        NFA.State seenAB = new NFA.State();

        NFA nfa = new NFA();
        nfa.setStartState(start);
        nfa.addAcceptState(seenAB);
        nfa.addAcceptState(start);

        start.addTransition('a', seenA);
        seenA.addTransition('b', seenAB);
        seenAB.addTransition('\0', start);

        assertTrue(nfa.accepts(""));
        assertTrue(nfa.accepts("ab"));
        assertTrue(nfa.accepts("abab"));

        assertFalse(nfa.accepts("a"));
        assertFalse(nfa.accepts("b"));
        assertFalse(nfa.accepts("aba"));
        assertFalse(nfa.accepts("abb"));
    }
}