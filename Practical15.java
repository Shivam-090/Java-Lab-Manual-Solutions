// Write a program to implement Following operations using Binary Search Tree:
// 1.	Insertion
// 2.	Deletion
// 3.	Traversal [PREORDER, POSTORDER, INORDER]
// Shivam
// 21CSU090

public class Practical15 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.displ();
    }
}

class BSTNode{
    int data;
    BSTNode left, right;
    BSTNode(){
        left = right = null;
        data = 0;
    }

    BSTNode(int d){
        data = d;
    }

    void setLeft(BSTNode n){
        left = n;
    }
    
    void setRight(BSTNode n){
        right = n;
    }

    BSTNode getLeft(){
        return left;
    }

    BSTNode getRight(){
        return right;
    }

    void setData(int d){
        data = d;
    }

    int getData(){
        return data;
    }
}

class BST{
    BSTNode root;
    BST(){
        root = null;
    }
    boolean Isempty(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root,data);
    }

    BSTNode insert(BSTNode root, int data){
        if (root == null) {
            root = new BSTNode(data);
        }
        else{
            if (data <= root.getData()) {
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    void displ(){
        display(root);
    }

    void display(BSTNode root){
        if (root != null) {
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }
}