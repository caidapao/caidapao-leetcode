

/**
 * Created by caidapao on 2019-8-2
 * Time 17:21
 * Address https://today.caidapao.com
 */
public class ChasenSolution {

    public static void main(String[] args) {

    }

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        sumResult(root, L, R);
        return sum;
    }

    private void sumResult(TreeNode root, int l, int r) {
        if (null != root) {
            if (l <= root.val && root.val <= r) {
                sum += root.val;
            }
            if (l < root.val){
                sumResult(root.left,l,r);
            }
            if (r > root.val){
                sumResult(root.right,l,r);
            }
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
