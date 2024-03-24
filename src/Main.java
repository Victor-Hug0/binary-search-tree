import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(45);

        binaryTree.insert(30);
        binaryTree.insert(20);
        binaryTree.insert(10);
        binaryTree.insert(25);
        binaryTree.insert(27);
        binaryTree.insert(40);
        binaryTree.insert(35);
        binaryTree.insert(42);
        binaryTree.insert(60);
        binaryTree.insert(50);
        binaryTree.insert(49);
        binaryTree.insert(52);
        binaryTree.insert(75);
        binaryTree.insert(70);
        binaryTree.insert(80);

        binaryTree.printIndentedTree();
        System.out.println(binaryTree.depth());
        binaryTree.printDepthOfNodes();
        System.out.println(binaryTree.heightOfTree());
        System.out.println(binaryTree.heightOfNode(45));

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "Estolha uma opção: \n" +
                    "0 - ENCERRAR PROGRAMA  \n" +
                    "1 - NÍVEL DE UM NÓ \n" +
                    "2 - NÍVEL DA ÁRVORE \n" +
                    "3 - PROFUNDIDADE DE CADA NÓ \n" +
                    "4 - PROFUNDIDADE DA ÁRVORE \n" +
                    "5 - ALTURA DE CADA NÓ \n" +
                    "6 - ALTURA DA ÁRVORE \n" +
                    "7 - ÁRVORE IDENTADA"
            );

            int escolha = scanner.nextInt();

            switch (escolha){
                case 0: return;
                case 1:
                    System.out.println("Escolha um nó da árvore: ");
                    int node = scanner.nextInt();
                    System.out.println("Nível do nó " + node + ": " + binaryTree.levelOfNode(node));
                    break;
                case 2:
                    System.out.println("Nível da árvore: " + binaryTree.depth());
                    break;
                case 3:
                    System.out.println("Profundidade de cada nó");
                    binaryTree.printDepthOfNodes();
                    break;
                case 4:
                    System.out.println("Profundidade da árvore: " + binaryTree.depth());
                    break;
                case 5:
                    System.out.println("Altura de cada nó: ");
                    binaryTree.printHeightOfNodes();
                    break;
                case 6:
                    System.out.println("Altura da árvore: " + binaryTree.heightOfTree());
                    break;
                case 7:
                    System.out.println("Árvore identada: ");
                    binaryTree.printIndentedTree();
                    break;
            }

        }
    }
}