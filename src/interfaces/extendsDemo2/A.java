package interfaces.extendsDemo2;

public interface A {
    static  void  greeting(){
        System.out.println("Greeting from A");
    }
  default   void fun(){
      System.out.println("Default");
  };
}
