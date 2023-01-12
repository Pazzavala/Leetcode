import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void commonInThree() {
        String ans = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"});
        assertEquals("fl", ans);
    }
}