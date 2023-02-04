public class first{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }

    }
        public static Node head;
        public static Node tail;

    public void addF(int data){
        // step 1 create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step 2 newNode next = head;
        newNode.next  = head; // link
        // step 3 head = newNode
        head = newNode; // updateing head
    }
    public void addL(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        if(head == null){
            System.out.print("Linked list is Empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(" Null");
    }

    public static void main(String args[]){

        first ll = new first();
        ll.print();
        ll.addF(1);
        ll.print();
        ll.addF(2);
        ll.print();
        ll.addL(3);
        ll.print();
        ll.addL(4);
        ll.print();
        ll.addF(5);
        ll.print();

    }
}
