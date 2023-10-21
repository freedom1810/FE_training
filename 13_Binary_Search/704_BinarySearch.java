class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        while (min <= max) {
            int mid = (min + max) / 2;

            if (nums[mid] == target) {
                // Kiểm tra các phần tử trùng bên trái
                while (mid > 0 && nums[mid - 1] == target) {
                    mid--;
                }
                return mid;
            } else if (nums[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}