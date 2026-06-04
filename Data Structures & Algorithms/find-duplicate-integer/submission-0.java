class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length==0)
        return 0;
        int s=0;
        int f=1;
        while(s<nums.length-1){
            if(nums[s]==nums[f])
            return nums[s];
            if(f==nums.length-1){
                s++;
                f=s+1;
            }else{
                f++;
            }
        }
        return 0;
    }
}
