import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenSoFar = new HashSet<>();

        for (int num: nums) {
            if (seenSoFar.contains(num))
                return true;
            seenSoFar.add(num);
        }
        return false;
    }
}
