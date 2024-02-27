package threads;


class MyThread1 extends Thread{

    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run() {
while (true){
    System.out.println("THIS TREAD IS "+getName());
}
    }
}

public class Main {

    public static void main(String[] args) {
       MyThread1 t1 = new MyThread1("Jitesh2 Most Imptant");
        MyThread1 t2 = new MyThread1("Jitesh3");
        MyThread1 t3 = new MyThread1("Jitesh4");
        MyThread1 t4 = new MyThread1("Jitesh5");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
