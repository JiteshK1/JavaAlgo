package stack_queue;

import java.util.Stack;

public class QueueUsingStacksRemove {
    Stack<Integer> first;
    Stack<Integer> second;

    public QueueUsingStacksRemove() {
        first=new Stack<>();
        second=new Stack<>();
    }

    public void insert(int item) throws  Exception{
      while (!first.isEmpty()){
          second.push(first.pop());
      }
      first.push(item);
      while (!second.isEmpty()){
          first.push(second.pop());
      }
    }

    public int remove(){
      return first.pop();
    }
 public int peek(){
     return first.peek();
 }
}
