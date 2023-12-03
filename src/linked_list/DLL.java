package linked_list;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        size=0;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        Node last=tail;
        while (last!=null){
            System.out.print(last.value +" -> ");
            last=last.prev;
        }
        System.out.print("START");
        System.out.println();
    }

    public void insertLast(int value){
        Node node= new Node(value);
        Node last = head;
        if (head==null){
            node.prev=null;
            head=node;
            tail=node;
             return;
        }

        while (last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
        node.next=null;
        tail=node;
        size+=1;

    }
    public Node getVal(int value){
        Node node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return node;
    }
    public void insert(int after, int val){
       Node prevNode=getVal(after);
       if (prevNode==null){
           System.out.println("does not exist");
           return;
       }
       Node node= new Node(val);
        node.next=prevNode.next;
       prevNode.next=node;
       node.prev=prevNode;
       if (node.next!=null){
           node.next.prev=node;
       }

    }
    private Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public  void insertFirst(int val){
        Node node = new Node(val);
        if (head ==null){
            head=node;
            head.next=null;
            head.prev=null;
            tail=head;
            size+=1;
            return;
        }
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
        size+=1;
    }

    private class Node{

        private int value;
        private  Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
