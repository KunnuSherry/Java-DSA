import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        tree.inOrder();

//        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(15);
//        bst.insert(10);
//        bst.insert(5);
//        bst.insert(25);
//        bst.insert(12);

    }
}
