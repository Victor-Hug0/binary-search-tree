public class BinaryTree {

    private TreeNode root;

    public BinaryTree(int rootData) {
        this.root = new TreeNode(rootData);
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

    public void insert(int data){
        insertNew(root, data);
    }

    private int heigthNode(TreeNode node) {
        if (node == null) {
            return -1;
        } else {
            int leftDepth = heigthNode(node.getNodeLeft());
            int rightDepth = heigthNode(node.getNodeRigth());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public int depth() {
        return heigthNode(root);
    }

    public int heightOfTree() {
        return heigthNode(root);
    }

    public int levelOfTree(){
        return heigthNode(root);
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

    public int levelOfNode(int data) {
        return levelOfNode(root, data, 0);
    }

    private void printDepthOfNodes(TreeNode node, int depth) {
        if (node != null) {
            System.out.println("Valor: " + node.getData() + ", Profundidade: " + depth);
            printDepthOfNodes(node.getNodeLeft(), depth + 1);
            printDepthOfNodes(node.getNodeRigth(), depth + 1);
        }
    }

    public void printDepthOfNodes() {
        printDepthOfNodes(root, 0);
    }

    private void printHeightOfNodes(TreeNode node) {
        if (node != null) {
            System.out.println("Valor: " + node.getData() + ", Altura: " + heigthNode(node));
            printHeightOfNodes(node.getNodeLeft());
            printHeightOfNodes(node.getNodeRigth());
        }
    }

    public void printHeightOfNodes() {
        printHeightOfNodes(root);
    }

    public void printIndentedTree(TreeNode node, int level) {
        if (node != null) {
            printIndentedTree(node.getNodeRigth(), level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(node.getData());
            printIndentedTree(node.getNodeLeft(), level + 1);
        }
    }

    public void printIndentedTree() {
        printIndentedTree(root, 0);
    }

    public void inOrder() {
        inOrderRecursivamente(root);
    }

    private void inOrderRecursivamente(TreeNode node) {
        if (node != null) {
            inOrderRecursivamente(node.getNodeLeft());
            System.out.print(node.getData() + " ");
            inOrderRecursivamente(node.getNodeRigth());
        }
    }

    public void posOrder() {
        posOrderRecursivamente(root);
    }

    private void posOrderRecursivamente(TreeNode node) {
        if (node != null) {
            posOrderRecursivamente(node.getNodeLeft());
            posOrderRecursivamente(node.getNodeRigth());
            System.out.print(node.getData() + " ");
        }
    }

    public void preOrder() {
        preOrderRecursivamente(root);
    }

    private void preOrderRecursivamente(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderRecursivamente(node.getNodeLeft());
            preOrderRecursivamente(node.getNodeRigth());
        }
    }
}
