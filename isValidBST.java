import java.util.*;

public class isValidBST {
    public static void main(String[] args) {
        TreeNode n5, n4, n6, n3, n7;
        n5 = new TreeNode(5);
        n4 = new TreeNode(4);
        n6 = new TreeNode(6);
        n3 = new TreeNode(3);
        n7 = new TreeNode(7);
        n5.left = n4;
        n5.right = n6;
        n6.left = n3;
        n6.right = n7;
        System.out.println(isValidBST(n5));
    }

    public static ArrayList<Integer> inorder = new ArrayList<>();

    public static boolean isValidBST(TreeNode root) {
        getInorder(root);
        int len = inorder.size() - 1;
        for(int i=0; i<len; i++){
            if(inorder.get(i) >= inorder.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static void getInorder(TreeNode root){
        if(root.left != null) {
            getInorder(root.left);
        }
        inorder.add(root.val);
        if(root.right != null){
            getInorder(root.right);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
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
