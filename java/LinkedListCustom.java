public class LinkedList {
    Node head;
    static class Node {
        //(value-next)
int value;
Node next;
Node(int d){
    value=d;
    next=null;
}

    }




    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        //assign
        list.head= new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node (5);

        // Connect
        list.head.next = second;
        second.next = third;
        third.next= fourth;
        fourth.next=fifth;

        //print(Be careful of empty Linked List !)
        while(list.head !=  null){
            System.out.println(list.head.value);
            list.head=list.head.next;
        }


    }
}


// How to create Custom Linked List ?
//  create LinkedList contains (no:1-3)
//  1- a head Node
//  2- Class To the Node (contains : next , value)
//      3- constructor of the Node class (take d ) & initialize the (next , value)
// ______________(in the main method )______________
//   1- create an obj from the linked list class .
//   2- Assign the values of the ele in the linkedList .
//   3- Connect the nodes .
//   4- print the Nodes .
