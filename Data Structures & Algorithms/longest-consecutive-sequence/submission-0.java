class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count =0;
        for(int num:set){
            if(!set.contains(num-1)){
                int  curr=num;
                int c=1;
                while(set.contains(num+1)){
                    c++;
                    num++;

                }
                count=Math.max(count,c);
            }
        }
        return count;
    }
}
