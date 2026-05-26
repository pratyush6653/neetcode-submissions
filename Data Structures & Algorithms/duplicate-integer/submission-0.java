class Solution {
    public boolean hasDuplicate(int[] nums) {
       if(nums.length<=1)
       return false;
       Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       for(int i:map.keySet()){
        int val=map.get(i);
        if(val>1)
        return true;
       }
       return false;
    }
}