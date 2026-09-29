class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (freq.get(nums[i]) == null) {
                freq.put(nums[i],1);
            }
            else{
                int count=freq.get(nums[i]);
                freq.put(nums[i],count+1);
            }
        }
       for(int i=0;i<nums.length;i++){
         if(freq.get(nums[i])>nums.length/2){
            return nums[i];
         }
       }
       return -1;
    }
}