import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthLastWordTest {
    @Test
    void leadingSpaces() {
        String s = "   fly me   to   the moon  ";

        int ans = new LengthLastWord().lengthOfLastWord(s);
        assertEquals(4, ans);
    }
}