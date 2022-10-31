package staticExample;




public class InnerClasses {
  static   class  A {
        String name;

      @Override
      public String toString() {
          return name;
      }

      public A(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        A a = new A("Jitesh");
        A b = new A("Prakash");
        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);

    }
}
