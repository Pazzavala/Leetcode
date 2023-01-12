import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void dups() {
        boolean ans = new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,1});
        assertTrue(ans);
    }
}