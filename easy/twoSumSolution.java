class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a new array to be returned
        int[] solution = new int[2];

        //loop through each elements and compare to get the target
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }
        return solution;
    }
}
