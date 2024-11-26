package arvores;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Inserindo elementos:");
        bst.insertIterative(50);
        bst.insertIterative(30);
        bst.insertIterative(70);
        bst.insertIterative(20);
        bst.insertIterative(40);
        bst.insertIterative(60);
        bst.insertIterative(80);

        System.out.println("Travessia em ordem:");
        bst.inOrderTraversal(); // Saída esperada: 20 30 40 50 60 70 80
        System.out.println();

        System.out.println("Travessia pré-ordem:");
        bst.preOrderTraversal(); // Saída esperada: 50 30 20 40 70 60 80
        System.out.println();

        System.out.println("Travessia pós-ordem:");
        bst.postOrderTraversal(); // Saída esperada: 20 40 30 60 80 70 50
        System.out.println();

        System.out.println("Altura da árvore: " + bst.height()); // Saída esperada: 3

        System.out.println("Pesquisando elementos:");
        System.out.println("40 encontrado? " + bst.searchIterative(40)); // Saída esperada: true
        System.out.println("90 encontrado? " + bst.searchRecursive(90)); // Saída esperada: false
    }
}