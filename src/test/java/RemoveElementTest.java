import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    void atBeginning() {
        int ans = new RemoveElement().removeElement(new int[] {3,2,2,3}, 3);
        assertEquals(2, ans);
    }

}