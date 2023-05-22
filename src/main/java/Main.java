import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        TreeNode<Integer> bst = getBinarySearchTree();
        printTreeIterative(bst);
    }

    public static void printTreeRecursive(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        printTreeRecursive(root.left);
        System.out.println(root);
        printTreeRecursive(root.right);
    }

    // non-recursive
    public static void printTreeIterative(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode<Integer>> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode<Integer> node = stack.peek();

            // go all the way to the left from node
            // push every node onto the stack on the way
            while (node.left != null) {
                stack.push(node.left);
                node = node.left;
            }

            // pop and print each node until a node has a right side
            while (!stack.isEmpty()) {
                node = stack.pop();
                System.out.println(node.val);
                // if a node has a right side, add it to the stack and start the outer loop all over
                if (node.right != null) {
                    stack.push(node.right);
                    break;
                }
            }
        }
    }

    //      1
    //     / \
    //    2   3
    //   / \   \
    //  4   5   6
    public static TreeNode<Integer> getGenericTree() {
        // 1st level
        TreeNode<Integer> root = new TreeNode<>(1);

        // 2nd level
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);

        // 3rd level
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.right = new TreeNode<>(6);

        return root;
    }

    //         6
    //      /    \
    //    3       8
    //   / \     /  \
    //  1   4    7   9
    public static TreeNode<Integer> getBinarySearchTree() {
        // 1st level
        TreeNode<Integer> root = new TreeNode<>(6);

        // 2nd level
        root.left = new TreeNode<>(3);
        root.right = new TreeNode<>(8);

        // 3rd level
        root.left.left = new TreeNode<>(1);
        root.left.right = new TreeNode<>(4);
        root.right.right = new TreeNode<>(9);
        root.right.left = new TreeNode<>(7);

        return root;
    }
}
