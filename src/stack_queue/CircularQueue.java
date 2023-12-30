package stack_queue;

public class CircularQueue {
    protected  int[] data;
    private static final int DEFAULT_SIZE=10;

    public int getSize() {
        return size;
    }

    protected int front=0;
    protected int end=0;
    private  int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        data=new int[size];
    }

    public  boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue Empty");
        }
        return data[front];
    }

    public  int remove() throws  Exception{

        if (isEmpty()){
            throw  new Exception("Queue Empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;

        return removed;
    }

    public void display()  throws  Exception{
        if (isEmpty()){
            throw  new Exception("Queue Empty");
        }
        int i =front;
        do {
            System.out.print(data[i]+" -> ");
            i++;
            i=i%data.length;
        }while (i!=end);
        System.out.print("END");
        System.out.println();
    }
    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return  size==0;
    }
}
