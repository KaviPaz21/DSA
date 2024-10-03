public class Main {
    public static void main(String[] args) {

        linkedlist lnk = new linkedlist();

        int[] arr = {5,9,7,6,3,11,15,25,63};


        //inserting each member inb array into linked list
        for (int i = 0;i<arr.length;i++){
            lnk.nodeenter(arr[i]);
        }

        //node printing method(traversal)
        lnk.nodeprint();
    }
}