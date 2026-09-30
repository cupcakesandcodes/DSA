class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int fix = 0; fix < nums.length - 2; fix++){

            // skip duplicate fixed elements
            if(fix > 0 && nums[fix] == nums[fix-1])
                continue;


            int left = fix + 1;
            int right = nums.length - 1;


            while(left < right){

                int sum = nums[fix] + nums[left] + nums[right];


                if(sum == 0){

                    ans.add(Arrays.asList(
                        nums[fix],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;


                    // skip duplicates
                    while(left < right && nums[left] == nums[left-1])
                        left++;

                    while(left < right && nums[right] == nums[right+1])
                        right--;

                }
                else if(sum < 0){

                    left++;

                }
                else{

                    right--;

                }
            }
        }

        return ans;
    }
}