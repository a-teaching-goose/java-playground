public class TreeNode<T> {
    protected T val;
    protected TreeNode<T> left;
    protected TreeNode<T> right;

    public TreeNode(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val.toString();
    }
}
