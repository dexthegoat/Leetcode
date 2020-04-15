public class maxDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);
        root.left = root1;
        root.right = root2;
        root2.right = root4;
        root2.left = root3;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }else {
            int nl= maxDepth(root.left);
            int nr= maxDepth(root.right);
            return nl>nr?nl+1:nr+1;
        }
    }
}
