import java.util.List;

public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            int ele = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int diff = Math.abs(arr2[j] - ele);
                if (diff <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
