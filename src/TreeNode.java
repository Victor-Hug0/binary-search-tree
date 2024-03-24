public class TreeNode {

    private int data;
    private TreeNode nodeRigth;
    private TreeNode nodeLeft;

    public TreeNode(int data) {
        this.data = data;
        this.nodeRigth = null;
        this.nodeLeft = null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getNodeRigth() {
        return nodeRigth;
    }

    public TreeNode getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeRigth(TreeNode nodeRigth) {
        this.nodeRigth = nodeRigth;
    }

    public void setNodeLeft(TreeNode nodeLeft) {
        this.nodeLeft = nodeLeft;
    }
}