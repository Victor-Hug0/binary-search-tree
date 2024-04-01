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

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    """

                            Estolha uma opção:\s
                            0 - ENCERRAR PROGRAMA \s
                            1 - NÍVEL DE UM NÓ\s
                            2 - NÍVEL DA ÁRVORE\s
                            3 - PROFUNDIDADE DE CADA NÓ\s
                            4 - PROFUNDIDADE DA ÁRVORE\s
                            5 - ALTURA DE CADA NÓ\s
                            6 - ALTURA DA ÁRVORE\s
                            7 - ÁRVORE IDENTADA\s
                            8 - PÓS ORDEM\s
                            9 - PRÉ ORDEM\s
                            10 - EM ORDEM
                            """
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
                    System.out.println("Nível da árvore: " + binaryTree.levelOfTree());
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
                case 8:
                    System.out.print("Pós ordem: ");
                    binaryTree.posOrder();
                    break;
                case 9:
                    System.out.print("Pre ordem: ");
                    binaryTree.preOrder();
                    break;
                case 10:
                    System.out.print("Em ordem: ");
                    binaryTree.inOrder();
                    break;
                default:
                    System.out.println("Escolha um valor válido!");
            }
        }
    }
}