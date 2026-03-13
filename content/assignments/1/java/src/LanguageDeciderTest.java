import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LanguageDeciderTest {

    @Test
    public void testBelongsToL() {
        String[] inL = new String[] {
                "",
                "c",
                // TODO: specify 3 more strings
        };
        for (String str : inL) {
            assertTrue(LanguageDecider.belongsToL(str));
        }
        assertTrue(LanguageDecider.belongsToL("c"));
        assertTrue(LanguageDecider.belongsToL("abc"));
        assertTrue(LanguageDecider.belongsToL("abba"));
        assertFalse(LanguageDecider.belongsToL("a"));
        assertFalse(LanguageDecider.belongsToL("b"));
        assertFalse(LanguageDecider.belongsToL("abbc"));
    }

    @Test
    public void testNotBelongToL() {
        String[] notInL = new String[] {
                "x",
                "abbc",
                // TODO: specify 3 more strings
        };
        for (String str : notInL) {
            assertFalse(LanguageDecider.belongsToL(str));
        }
    }
}
