class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BinaryTree {
    node root;
    void inorder(node n1){
        if(n1!=null){
           inorder (n1.left);
           System.out.print(n1.data+" ");
           inorder (n1.right);
        }
    }
    public static void main(String args[]){
        System.out.println("Binary tree main called");
        BinaryTree t = new BinaryTree();
        t.root = new node(1);
        t.root.left = new node(2);
        t.root.right = new node(3);
        t.root.left.left = new node(4);
        t.root.left.right = new node(5);
        t.root.right.left = new node(6);
        t.root.right.right = new node(7);
        t.inorder(t.root);
        
    }
}
