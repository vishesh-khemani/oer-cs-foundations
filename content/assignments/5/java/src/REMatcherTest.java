import org.junit.Test;

public class REMatcherTest {
    @Test
    public void testHex() {
        // TODO: implement a test for matching Hexadecimal strings.
        // Alphabet: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f}
        // Language: All sequences of hexadecimal digits (including the empty sequence)
    }

    @Test
    public void testDNA() {
        // TODO: implement a test for matching simple DNA sequences.
        // Alphabet: {A, C, G, T} each representing a nucleotide
        // Language: All sequences of nucleotides (including the empty sequence)
    }

    @Test
    public void testOddBinaryNumbers() {
        // TODO: implement a test for matching odd binary numbers.
        // Alphabet: {0, 1}
        // Language: All binary numbers that represent odd integers (leading 0s are
        // allowed)
    }

    @Test
    public void testEvenLengthBinaryStrings() {
        // TODO: implement a test for matching binary strings containing an even number
        // of binary digits.
        // Alphabet: {0, 1}
        // Language: binary numbers that have 2n digits for n >= 0
    }
}
