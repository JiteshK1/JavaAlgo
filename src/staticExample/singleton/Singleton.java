package staticExample.singleton;

import access.A;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public  static Singleton getInstance(){

        if (instance == null){
            instance = new Singleton();

        }
        return instance;
    }

}

  class  Subclass extends A {


    public Subclass(int num, String name) {
        super(num, name);
    }

      public static void main(String[] args) {
          Subclass obj = new Subclass(19,"Jitu");
          int n = obj.num;

          System.out.println( obj instanceof A);
      }

}
