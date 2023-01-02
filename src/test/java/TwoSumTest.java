import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void negativeCase() {
        TwoSum sum = new TwoSum();
        int[] input = {-1, 0};

        assertArrayEquals(new int[]{0, 1}, sum.twoSum(input, -1));
    }
}