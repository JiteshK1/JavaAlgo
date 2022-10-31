package access;

 class SubClass extends  A{
    SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(19,"Jitesh");
        int n = obj.num;
    }
}
