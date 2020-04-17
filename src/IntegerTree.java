public class IntegerTree {
    Node root;
    int size;
    public IntegerTree(){

    }
    private static class Node {
        Node left;
        Node right;
        int number;
        public Node(int number){
            this.number = number;
        }
    }
    public void insert(int number){
        if( root == null)
            root = new Node(number);
        else{
            Node parent = null;
            Node current = root;
            while (current != null){
                if( number > current.number){
                    parent = current;
                    current = current.right;
                } else if( number < current.number){
                    parent = current;
                    current = current.left;
                } else
                    System.out.println("Cant insert : " +number);
            }
            if( number > parent.number)
                parent.right = new Node(number);
            if( number < parent.number)
                parent.left = new Node(number);
        }
        size++;
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node root){
        if(root == null)
            return;
        System.out.print(root.number + " , ");
        preorder(root.left);
        preorder(root.right);
    }
}
