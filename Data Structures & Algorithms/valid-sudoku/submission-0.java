class Solution {
    public boolean isValidSudoku(char[][] nums) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0; j<9;j++){
                char ch=nums[i][j];
                if(ch=='.')
                continue;
                String rowKey = ch + " in row " + i;
                String colKey = ch + " in col " + j;
                String boxKey = ch + " in box " + (i/3) + "-" + (j/3);

                if(!set.add(rowKey) || !set.add(colKey) || !set.add(boxKey)){
                    return false;
                }

            }
        }
        return true;
    }
}
