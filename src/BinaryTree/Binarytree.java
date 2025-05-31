package BinaryTree;

public class Binarytree {
        public Node root;
        public void inorder(Node root){
            if(root == null) return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public void preorder(Node root){
            if (root == null) return;
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
}
