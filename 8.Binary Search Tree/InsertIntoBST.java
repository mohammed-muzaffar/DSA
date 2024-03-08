import javax.swing.tree.TreeNode;

class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        TreeNode cur = root;
        TreeNode prev = root;

        if (cur == null) {
            return new TreeNode(val, null, null);
        }

        while (cur != null) {
            if (cur.val > val) {
                prev = cur;
                cur = cur.left;
            } else if (cur.val < val) {
                prev = cur;
                cur = cur.right;
            }
        }

        TreeNode newNode = new TreeNode(val, null, null);

        if (val > prev.val) {
            prev.right = newNode;
        } else {
            prev.left = newNode;
        }

        return root;
    }
}
