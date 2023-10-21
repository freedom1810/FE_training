import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = 0; i <= max + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
