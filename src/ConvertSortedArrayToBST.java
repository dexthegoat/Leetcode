public class ConvertSortedArrayToBST {

    public static void main(String[] args) {
        int[] arr = {-10,-5,0,3,7};
        System.out.println(sortedArrayToBST(arr));
    }

    public static TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        return helper(num, 0, num.length - 1);
    }

    public static TreeNode helper(int[] num, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
}
