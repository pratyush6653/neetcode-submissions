class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit=0;
        int buy=0;
        for(int i=1;i<nums.length;i++){
            int profit=nums[i]-nums[buy];
            if(profit>maxProfit)
            maxProfit=profit;
            if(nums[i]<nums[buy]){
                buy=i;
            }
        }
        return maxProfit;
    }
}
