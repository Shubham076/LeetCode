public class RecoverBinarySerachTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode prev;
    TreeNode first;
    TreeNode second;

    public void recoverTree(TreeNode root) {

        this.prev = this.first = this.second = null;

        correctTree(root);

        int temp = this.first.val;
        this.first.val = this.second.val;
        this.second.val = temp;

    }

    public void correctTree(TreeNode root) {

        if (root == null)
            return;

        // inorder traversal
        correctTree(root.left);

        if (this.prev != null) {

            // first element take the previous value as first
            if (this.first == null && root.val <= this.prev.val) {

                this.first = this.prev;
            }

            // second element take the root value
            if (first != null && root.val <= this.prev.val) {

                this.second = root;
            }

        }

        this.prev = root;

        correctTree(root.right);

    }

}