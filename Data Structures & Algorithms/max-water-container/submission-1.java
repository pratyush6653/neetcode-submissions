class Solution {
    public int maxArea(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int data=(right-left)*Math.min(nums[left],nums[right]);
            max=Math.max(max,data);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
