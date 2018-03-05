

/**
 * Created by himu on 2/27/2018.
 */
public class Solution {

     public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     }


    Integer min_diff = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
    if(root == null) return min_diff;

    getMinimumDifference(root.left);
        if (prev != null) {
            min_diff = Math.min(min_diff, root.val - prev.val);
        }
        prev = root;
        getMinimumDifference(root.right);
        return min_diff;
    }
}
