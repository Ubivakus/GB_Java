import javax.swing.tree.TreeNode;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    /* Solution 1 */
    String s = "/home/foo/.//name";
    System.out.println(Solution1.simplifyPath(s));

    /* Solution 2 */
    int[][] input_task2 = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
        { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
        { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
    int out_task2 = Solution2.maxAreaOfIsland(input_task2);
    System.out.println(out_task2);

    /* Solution 3 */
    Solution3.TreeNode root = new Solution3.TreeNode(1);
    root.left = new Solution3.TreeNode(2);
    root.right = new Solution3.TreeNode(2);
    root.left.right = new Solution3.TreeNode(3);
    root.left.left = new Solution3.TreeNode(4);
    root.right.left = new Solution3.TreeNode(3);
    root.right.right = new Solution3.TreeNode(4);

    Solution3.TreeNode root2 = new Solution3.TreeNode(1);
    root2.left = new Solution3.TreeNode(2);
    root2.right = new Solution3.TreeNode(2);
    root2.left.right = new Solution3.TreeNode(3);
    root2.right.right = new Solution3.TreeNode(3);
    System.out.println(Solution3.isSymmetric(root));

    /* Solution 4 */
    int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
    System.out.println(Arrays.deepToString(Solution4.updateMatrix(mat)));
  }
}