class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                list.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            result.add(list);
        }

        return result;
    }
}