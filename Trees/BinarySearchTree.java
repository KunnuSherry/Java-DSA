import java.util.Scanner;

public class BinarySearchTree {
    public BinarySearchTree() {

    }


    private static class Node {
        int value;
        BinarySearchTree.Node left;
        BinarySearchTree.Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private BinarySearchTree.Node root;

    // insert elements
    public void insert(int val){
        Node node = new Node(val);
        if(root==null){
            root = node;
            return;
        }
        insert(node,root);
    }
    private void insert(Node node, Node root) {
        if (node.value > root.value) {
            if (root.right == null) {
                root.right = node; // Insert node if right child is null
            } else {
                insert(node, root.right); // Recurse right
            }
        } else {
            if (root.left == null) {
                root.left = node; // Insert node if left child is null
            } else {
                insert(node, root.left); // Recurse left
            }
        }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(BinarySearchTree.Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(BinarySearchTree.Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}
