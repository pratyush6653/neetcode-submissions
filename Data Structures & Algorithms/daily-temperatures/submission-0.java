class Solution {
    public int[] dailyTemperatures(int[] nums) {
        if(nums.length==0)
        return new int[0];
        int arr[]=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                int x=st.pop();
                arr[x]=i-x;
            }
            st.push(i);
        }
        return arr;
    }
}
