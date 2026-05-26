class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n=nums.length;
        int m=nums[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
             int row = mid / m;
            int col = mid % m;

            int value = nums[row][col];
            if(target==value){
                return true;
            }
            else if(target>value){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}
