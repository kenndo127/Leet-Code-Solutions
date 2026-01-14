class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean output = false;
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                output = true;
        }
        return output;
    }
}
