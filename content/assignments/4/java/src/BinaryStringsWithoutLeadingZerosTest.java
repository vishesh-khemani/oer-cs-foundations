import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryStringsWithoutLeadingZerosTest {

    @Test
    public void testNFAForZero() {
        // Arrange.
        NFA nfa = BinaryStringsWithoutLeadingZeros.createNFAForZero();

        // TODO: Act and assert with at least one string that should be accepted and
        // one that should be rejected.
        assertTrue(1 == 2); // placeholder
    }

    @Test
    public void testNFAForOne() {
        // Arrange.
        NFA nfa = BinaryStringsWithoutLeadingZeros.createNFAForOne();

        // TODO: Act and assert with at least one string that should be accepted and
        // one that should be rejected.
        assertTrue(1 == 2); // placeholder
    }

    @Test
    public void testNFAForBinaryDigit() {
        // Arrange.
        NFA nfa = BinaryStringsWithoutLeadingZeros.createNFAForBinaryDigit();

        // TODO: Act and assert with at least one string that should be accepted and
        // one that should be rejected.
        assertTrue(1 == 2); // placeholder
    }

    @Test
    public void testNFAForBinaryString() {
        // Arrange.
        NFA nfa = BinaryStringsWithoutLeadingZeros.createNFAForBinaryString();

        // TODO: Act and assert with at least one string that should be accepted and
        // one that should be rejected.
        assertTrue(1 == 2); // placeholder
    }

    @Test
    public void testNFAForBinaryStringWithLeadingOne() {
        // Arrange.
        NFA nfa = BinaryStringsWithoutLeadingZeros.createNFAForBinaryStringWithLeadingOne();

        // TODO: Act and assert with at least one string that should be accepted and
        // one that should be rejected.
        assertTrue(1 == 2); // placeholder
    }

    @Test
    public void testNFAForBinaryStringWithNoLeadingZeros() {
        // Arrange.
        NFA nfa = BinaryStringsWithoutLeadingZeros.createNFAForBinaryStringsWithNoLeadingZeros();

        // TODO: Act and assert with at least one string that should be accepted and
        // one that should be rejected.
        assertTrue(1 == 2); // placeholder
    }
}
