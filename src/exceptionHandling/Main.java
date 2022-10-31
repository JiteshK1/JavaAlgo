package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        String name = "jitesh";

        try {
            if(name.equals("jitesh")){
                throw new MyException("YAS");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will Always run");
        }




    }
    static int divide(int a , int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please do not enter Zero");
        }
        return a / b;
    }
}
