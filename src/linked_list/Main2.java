package linked_list;

public class Main2 {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(1);
        dll.insertFirst(22);
        dll.insertFirst(3);
        dll.insertLast(44);
        dll.insert(44,121);
        dll.display();
    }
}
