class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            while(j<nums.length){
            if(nums[i]+nums[j]==target){
                return new int []{i+1,j+1};
            }
            j++;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
