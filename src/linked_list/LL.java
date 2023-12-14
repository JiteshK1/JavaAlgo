package linked_list;

import javax.print.attribute.standard.SheetCollate;
import java.security.PublicKey;

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

    public void insertRec(int index, int value) {
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(index - 1, value, node.next);
        return node;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    private Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        size--;
        tail.next = null;
        return val;
    }

    public Node getVal(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
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

        public Node() {

        }
    }


    public Node duplicate() {
        Node node = head;
        if (head == null) {
            return node;
        }

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        return node;
    }

    public Node merge(Node list1, Node list2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = list1 != null ? list1 : list2;
        return dummyHead.next;
    }

    public boolean linkedListCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int cycleLength() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        int length = 0;
        Node f = head;
        Node s = head;
//find the length of the cycle;
        while (f != null & f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                length = cycleLength();
                break;
            }
        }

        //move s and f to the start
        s = head;
        f = head;

        // move s to the length of the cycle times
        while (length > 0) {
            s = s.next;
            length--;
        }
        // keep moving forward till s and f are equal;
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        if (length == 0) return null;
        return f;
    }


    Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = middleNode(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left, right);
    }

    static Node middleNode(Node head) {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    // bubbleSort
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        Node first = get(col);
        Node second = get(col + 1);

        if (col < row) {
            if (first.value > second.value) {
                if (first == head) {
                    first.next = second.next;
                    second.next = first;
                    head = second;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }

    }

    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public Node reverse(Node head, int left, int right) {
        if (left == right) {
            return head;
        }
        Node prev = null;
        Node current = head;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        Node last = prev;
        Node newEnd = current;

        //reverse between left and right
        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    public boolean ispalindrome(Node head){
        Node mid=middleNode(head);
        Node secondHead= reverseList(mid);
        Node rereverse= secondHead;

        while (head!=null && secondHead!=null){
            if (head.value!=secondHead.value){
                break;
            }else {
                head=head.next;
                secondHead=secondHead.next;
            }
        }
        reverseList(rereverse);
        return head==null || secondHead == null;
    }

    public void rotateList(Node head){
          if (head==null && head.next==null) {
              return;
          }

          Node mid = middleNode(head);
          Node hs=reverseList(mid);
          Node hf=head;

          while (hf!=null && hs!=null){
              Node temp = hf.next;
              hf.next=hs;
              hf=temp;

              temp=hs.next;
              hs.next=hf;
              hs=temp;
          }

          if (hf!=null){
              hf.next = null;
          }

    }

    public  Node reverseKGroup(Node head , int k){
        if (k<=1 || head==null){
            return head;
        }

        Node prev= null;
        Node current= head;
        while (true){
            Node next = current.next;
            Node last=prev;
            Node newEnd=current;
            for (int i = 0; current!=null &&  i <k ; i++) {
                  current.next=prev;
                  prev=current;
                  current=next;
                  if (next!=null){
                      next=next.next;
                  }
            }
            if (last!=null){
                last.next=prev;

            }else {
                head=prev;
            }
                newEnd.next=current;
            if (current==null){
                break;
            }
        }
        return head;


    }
    int getDecimalValue(Node  head) {
        StringBuilder builder = new StringBuilder();
        Node temp=head;
        while(temp!=null){
            builder.append(temp.value);
            temp=temp.next;
        }

        return Integer.parseInt(builder.toString(),2);
    }


    public static Node listRotate(Node head , int k){
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    public static void main(String[] args) {
//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//        second.insertLast(4);
//        second.insertLast(4);
//        second.insertLast(9);
//        second.insertLast(7);
//
//
//        first.display();
//        second.display();
        //   LL list3= LL.merge(first,second);
        //   list3.display();
        LL list = new LL();
       list.insertFirst(4);
       list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
 list.display();
      list.listRotate(list.head,1);
        list.display();
    }
}
