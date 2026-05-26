class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length==0)
        return 0;
        Arrays.sort(piles);
        int low=1,  high=piles[piles.length-1],ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hour=0;
            for(int i=0;i<piles.length;i++){
                hour+=(int)Math.ceil((double)piles[i]/mid);
            }
            if(hour<=h){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
}
