class Solution {
    public int maxProduct(int[] nums) {
       int maxpr= nums[0];
       int  currMax=nums[0];
        int currMin=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempMax=Math.max(nums[i],Math.max(currMax*nums[i],currMin*nums[i]));
            currMin=Math.min(nums[i],Math.min(currMax*nums[i],currMin*nums[i]));
            currMax=tempMax;
            maxpr=Math.max(maxpr,currMax);

        }
        return maxpr;
    }
}