package BinaryTree;


public class BinarytreeClient {
    public static void main(String [] args){
        Binarytree b = new Binarytree();
        b.root = new Node(10);
        b.root.left = new Node(20);
        b.root.right = new Node(30);
        b.root.left.left = new Node(40);

        b.inorder(b.root);
        System.out.println("----");
        b.preorder(b.root);
    }
}
