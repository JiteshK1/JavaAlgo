package linked_list;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();

//        ll.insert(22,4);
//        ll.display();
//        System.out.println("size ="+ll.getSize());
//        System.out.println("deleted element is "
//                + ll.deleteFirst()
//        );
//        ll.display();
//        System.out.println("size ="+ll.getSize());
//        System.out.println("deleted element is "
//                +
//                ll.delete(2)
//        );
//        System.out.println("size ="+ll.getSize());
//
//        ll.display();

//        CLL cll = new CLL();
//        cll.insert(1);
//        cll.insert(22);
//        cll.insert(884);
//          cll.delete(22);
//        cll.display();

        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(4);
        ll.insertLast(55);
        ll.display();
      ll.insertRec(2,88);
        ll.display();

    }
}
