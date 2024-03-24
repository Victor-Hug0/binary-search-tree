public class BinaryTree {

    private TreeNode root;

    public BinaryTree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    public void insert(int data){
        insertNew(root, data);
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

    public int depth() {
        return depth(root);
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = depth(node.getNodeLeft());
            int rightDepth = depth(node.getNodeRigth());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public int levelOfNode(int data) {
        return levelOfNode(root, data, 0);
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

    public void printDepthOfNodes() {
        printDepthOfNodes(root, 0);
    }

    private void printDepthOfNodes(TreeNode node, int depth) {
        if (node != null) {
            System.out.println("Valor: " + node.getData() + ", Profundidade: " + depth);
            printDepthOfNodes(node.getNodeLeft(), depth + 1);
            printDepthOfNodes(node.getNodeRigth(), depth + 1);
        }
    }

    public int heightOfTree() {
        return height(root); // Calcula a altura da árvore (raiz)
    }


    public int heightOfNode(int data) {
        return heightOfNode(root, data);
    }

    private int heightOfNode(TreeNode node, int data) {
        if (node == null) {
            return -1;
        }
        if (node.getData() == data) {
            return height(node);
        }
        int leftHeight = heightOfNode(node.getNodeLeft(), data);
        int rightHeight = heightOfNode(node.getNodeRigth(), data);

        return Math.max(leftHeight, rightHeight);
    }


    public void printHeightOfNodes() {
        printHeightOfNodes(root); // Inicia a impressão da altura da raiz
    }

    private void printHeightOfNodes(TreeNode node) {
        if (node != null) {
            System.out.println("Valor: " + node.getData() + ", Altura: " + height(node));
            printHeightOfNodes(node.getNodeLeft()); // Chamada recursiva para o nó esquerdo
            printHeightOfNodes(node.getNodeRigth()); // Chamada recursiva para o nó direito
        }
    }

    private int height(TreeNode node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = height(node.getNodeLeft());
        int rightHeight = height(node.getNodeRigth());

        return Math.max(leftHeight, rightHeight) + 1;
    }


    public void printIndentedTree() {
        printIndentedTree(root, 0);
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
