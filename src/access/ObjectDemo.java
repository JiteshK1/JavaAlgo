package access;

import java.util.Objects;

public class ObjectDemo {
    int num;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectDemo)) return false;
        ObjectDemo that = (ObjectDemo) o;
        return num == that.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    ObjectDemo(int num){
        this.num = num;

    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(22);
        ObjectDemo obj2 = new ObjectDemo(19);

        System.out.println(obj2.hashCode());
    }
}
