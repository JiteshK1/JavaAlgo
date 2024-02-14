package heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(22);
        heap.insert(14);
        heap.insert(2);
        heap.insert(64);

        ArrayList<Integer> sorted=heap.heapSort();
        System.out.println(sorted);
    }
}
