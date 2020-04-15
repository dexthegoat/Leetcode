public class TreeNode {
     //TreeNode root;
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     /*
     public String toString() {
          StringBuilder sb = new StringBuilder();
          preorderTraverse(root,1,sb);
          return sb.toString();
     }

     private void preorderTraverse(TreeNode currentNode, int depth, StringBuilder sb) {
          for(int i=1;i<depth;i++)
               sb.append("	");
          if(currentNode ==null)
               sb.append("null\n");
          else {
               sb.append(currentNode.toString());
               sb.append("\n");
               preorderTraverse(currentNode.left,depth+1,sb);
               preorderTraverse(currentNode.right,depth+1,sb);
          }

     }
     */
}
