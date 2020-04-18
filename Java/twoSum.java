class Solution {
    public int[] twoSum(int[] nums, int target) {

      int[] answer = {0, 0}; //Solution Var
        
        for(int i = 0; i < nums.length; i++ ) //O(n^2) Solution
        {
            for(int j = 0; j < nums.length; j++)
            {
                
		//If i + j = target values, Return the Indices

                if(nums[i] + nums[j] == target && i != j)
                {
                    answer[0] = j;
                    answer[1] = i;
                }
            }
        }
        return answer;
    }
}
