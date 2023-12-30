package stack_queue;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> first;
    Stack<Integer> second;

    public QueueUsingStacks() {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void insert(int item){
        first.push(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removed= second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
 public int peek(){
     while (!first.isEmpty()){
         second.push(first.pop());
     }
     int peeked= second.peek();
     while (!second.isEmpty()){
         first.push(second.pop());
     }
     return peeked;
 }
}
