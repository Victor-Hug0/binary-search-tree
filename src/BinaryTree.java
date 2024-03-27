public class BinaryTree {

    private TreeNode root;

    public BinaryTree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    public void insert(int data){
        insertNew(root, data);
    }


    public int depth() {
        return depth(root);
    }

    public int heightOfTree() {
        return depth(root);
    }

    public int levelOfTree(){
        return depth(root);
    }
    public void printIndentedTree() {
        printIndentedTree(root, 0);
    }

    public void printDepthOfNodes() {
        printDepthOfNodes(root, 0);
    }

    public int levelOfNode(int data) {
        return levelOfNode(root, data, 0);
    }

    public void printHeightOfNodes() {
        printHeightOfNodes(root);
    }

    private void insertNew(TreeNode node, int data){
        if (node == null) {
            return;
        }

        if (data < node.getData()){
            if (node.getNodeLeft() == null){
                node.setNodeLeft(new TreeNode(data));
            } else {
                insertNew(node.getNodeLeft(), data);
            }
        } else {
            if(node.getNodeRigth() == null){
                node.setNodeRigth(new TreeNode(data));
            } else {
                insertNew(node.getNodeRigth(), data);
            }
        }
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return -1;
        } else {
            int leftDepth = depth(node.getNodeLeft());
            int rightDepth = depth(node.getNodeRigth());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    private int levelOfNode(TreeNode node, int data, int level) {
        if (node == null) {
            return -1;
        }
        if (node.getData() == data) {
            return level;
        }

        int leftDepth = levelOfNode(node.getNodeLeft(), data, level + 1);
        int rightDepth = levelOfNode(node.getNodeRigth(), data, level + 1);

        return Math.max(leftDepth, rightDepth);
    }

    private void printDepthOfNodes(TreeNode node, int depth) {
        if (node != null) {
            System.out.println("Valor: " + node.getData() + ", Profundidade: " + depth);
            printDepthOfNodes(node.getNodeLeft(), depth + 1);
            printDepthOfNodes(node.getNodeRigth(), depth + 1);
        }
    }

    private void printHeightOfNodes(TreeNode node) {
        if (node != null) {
            System.out.println("Valor: " + node.getData() + ", Altura: " + depth(node));
            printHeightOfNodes(node.getNodeLeft());
            printHeightOfNodes(node.getNodeRigth());
        }
    }

    public void printIndentedTree(TreeNode node, int level) {
        if (node != null) {
            printIndentedTree(node.getNodeRigth(), level + 1);
            for (int i = 0; i < level; i++) {
                System.out.printf("\t");
            }
            System.out.println(node.getData());
            printIndentedTree(node.getNodeLeft(), level + 1);
        }
    }

}
