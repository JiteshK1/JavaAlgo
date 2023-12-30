package stack_queue;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack=new DynamicStack(2);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(
//                stack.peek()
//        );
//        stack.pop();
//        System.out.println(
//                stack.peek()
//        );

        CircularQueue queue = new CircularQueue(5);
        queue.insert(22);
        queue.insert(10);
        queue.insert(66);
        queue.insert(15);
        queue.insert(30);
        queue.insert(45);

        queue.display();
        queue.remove();
        queue.display();


    }
}
