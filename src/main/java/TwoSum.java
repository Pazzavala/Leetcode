import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> seenSoFar = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (seenSoFar.containsKey(diff))
                return new int[]{seenSoFar.get(diff), i};

            seenSoFar.put(nums[i], i);
        }
        return new int[]{};
    }
}
