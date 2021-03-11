import java.util.*;

public class levelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        dfs(root, ans, 0);
        return ans;
    }

    public void dfs(TreeNode root, List<List<Integer>> ans, int n){
        if(ans.size() == n) {
            List<Integer> l = new ArrayList<>();
            ans.add(l);
        }
        ans.get(n).add(root.val);
        if(root.left != null) dfs(root.left, ans, n+1);
        if(root.right != null) dfs(root.right, ans, n+1);
    }

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
}
