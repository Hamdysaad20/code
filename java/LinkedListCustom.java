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
