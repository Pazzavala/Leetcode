import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumUniqueEmailsTest {
    @Test
    void dupEmails() {
        int ans = new NumUniqueEmails().numUniqueEmails(new String[]{"Hey@gmail.com", "Hey@gmail.com"});

        assertEquals(1, ans);
    }

    @Test
    void noDupEmails() {
        int ans = new NumUniqueEmails().numUniqueEmails(new String[]{"Hey@gmail.com", "Hello@gmail.com"});

        assertEquals(2, ans);
    }

    @Test
    void diffDomain() {
        int ans = new NumUniqueEmails().numUniqueEmails(new String[]{"Hey@hotmail.com", "Hey@gmail.com"});

        assertEquals(2, ans);
    }

    @Test
    void sameWithNoAt() {
        int ans = new NumUniqueEmails().numUniqueEmails(new String[]{"Hey@gmail.com", "He@ygmail.com"});

        assertEquals(2, ans);
    }
}