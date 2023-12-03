package linked_list;

import ArrayPrac.PlusOne;
import org.w3c.dom.Node;

public class LL {

    private Node head;

    public int getSize() {
        return size;
    }

    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;

    }
//insertion using recursion

    public  void insertRec(int index , int value){
        head = insertRec(index,value,head);
    }

    private   Node insertRec(int index, int value , Node node){
        if (index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
       node.next= insertRec(index-1,value,node.next);
        return node;
    }
    public void insert(int value, int index){
        if (index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size+=1;

    }

    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        size--;
        return val;
    }

    private Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        size--;
        tail.next=null;
        return val;
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
    public int delete(int index) {
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node previous= get(index-1);
        int value= previous.next.value;
        previous.next=previous.next.next;
        size--;
        return value;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


public  Node duplicate(){
    Node node = head;
        if (head==null){
            return node;
        }

        while (node.next!=null){
            if (node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }

        return node;
}

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public boolean linkedListCycle(){
        Node fast=head;
        Node slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }
    public int cycleLength() {
        Node fast=head;
        Node slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
             Node temp=slow;
             int length=0;
             do {
                 temp=temp.next;
             length++;
             }while (temp!=slow);
             return length;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head){
        int length=0;
        Node f=head;
        Node s= head;
//find the length of the cycle;
        while (f!=null & f.next!=null){
            f=f.next.next;
            s=s.next;
            if (f==s){
                length=cycleLength();
                break;
            }
        }

        //move s and f to the start
        s=head;
        f=head;

        // move s to the length of the cycle times
        while (length>0){
            s=s.next;
            length--;
        }
        // keep moving forward till s and f are equal;
        while (f!=s){
            f=f.next;
            s=s.next;
        }
        if (length==0) return null;
        return f;
    }
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(4);
        second.insertLast(4);
        second.insertLast(9);
        second.insertLast(7);


        first.display();
        second.display();
        LL list3= LL.merge(first,second);
        list3.display();

    }
}
