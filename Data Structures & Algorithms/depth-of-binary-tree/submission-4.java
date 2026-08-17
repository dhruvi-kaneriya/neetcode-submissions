/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
    if(root == null){
            return 0;
        }
       int maxDepth = 0;

    Stack<TreeNode> stack = new Stack<>();
    Map<TreeNode, Integer> map = new HashMap<>();

    
    if(root != null){
        stack.push(root);
     }
//System.out.println(maxDepth);
    while(!stack.isEmpty()){
        TreeNode node = stack.peek();
      //  System.out.println(maxDepth);
        if(node.left != null && !map.containsKey(node.left)){
            stack.push(node.left);
          //  System.out.println(maxDepth);
        }
        else if(node.right != null && !map.containsKey(node.right)){
            stack.push(node.right);
         //   System.out.println(maxDepth);
        }else{
            stack.pop();
          //  System.out.println(maxDepth);
            int leftDepth = map.getOrDefault(node.left, 0);
            int rightDepth = map.getOrDefault(node.right, 0);
//System.out.println(maxDepth);
           int currentDepth = 1 + Math.max(leftDepth, rightDepth);
                map.put(node, currentDepth);
                maxDepth = Math.max(maxDepth, currentDepth);

        }
    }
    return maxDepth;
    }
}
