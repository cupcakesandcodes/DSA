
class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {

            // Duplicate → ignore
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Consecutive → increase count
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } 
            // Break in sequence → reset
            else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
