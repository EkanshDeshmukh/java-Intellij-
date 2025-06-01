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
        public boolean find(Node root , int val){
            if (root == null){
                return false;
            }
            if(root.data == val){
                return true;
            }
             boolean lf =  find(root.left,val);
            boolean rf =  find(root.right,val);
            return lf || rf;
        }
        public int height(Node root){
            if(root == null){
                return  -1;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh) + 1;
        }

}
