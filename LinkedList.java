public class LinkedList {
    public Node head=new Node();
    public Node tail=new Node();
    public void addToTail(int data) {
        //your code is here
         Node node1=new Node();

         node1.value=data;

        if(head.next==null){
         head.next=node1;
        }
        if(tail.next!=null){
            tail.next.next=node1;

        }
        tail.next=node1;

    }

    public boolean contains(int value) {
        //your code is here
        Node node1 =head;
        while(node1.next!=null){
            if(node1.value==value){
                return true;
            }
            node1=node1.next;
        }
        if(node1.value==value){
            return true;
        }
        return false;
    }

    public int removeHead() {
        //your code is here
        if(head.next!=null){
            if(head.next.next==null){
                tail.next=null;
            }
            Node node1=head.next;
            head.next=node1.next;
            return node1.value;
        }
        else return 0;

    }

    public void printList() {
        //your code is here
    }

//    public int getHead() {
//        //your code is here
//    }

    public class Node {
        //your code is here
        public int value ;
        public Node next;
    }

}