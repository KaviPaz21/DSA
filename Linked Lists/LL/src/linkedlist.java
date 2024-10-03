class Node{
    int data;
    Node pointer;

    public Node(int k){
        this.data = k;
    }

}
public class linkedlist {
    Node root;

    //calling node insertion function
    public void nodeenter(int K){
        root = createNodes(root , K);
    }

    //calling node traversal function
    public void nodeprint(){
        traversal(root);
    }


    //Node insertion function
    public Node createNodes(Node root , int K){
        if (root == null){ // check weather root is available
            root = new Node(K);
        }else {
            root.pointer = createNodes(root.pointer , K);
        }

        return root; //return the root node
    }



    //node traversal
    public void traversal(Node root){
        if (root != null){
            System.out.println("node is " + root.data);
            traversal(root.pointer);
        }
    }

}
