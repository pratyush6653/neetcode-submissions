class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightCheck(root);
        return diameter;
    }
    private int heightCheck(TreeNode root){
        if(root==null)
        return 0;
        int leftHeight=heightCheck(root.left);
        int rightHeight=heightCheck(root.right);
        diameter=Math.max(diameter,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
