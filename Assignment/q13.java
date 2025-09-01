
class A {

    static int x = 10;
}

class B {

    void change() {
        System.out.println(A.x);
        A.x = 50;
        System.out.println(A.x);
    }
}

public class q13 {

    public static void main(String[] args) {
        new B().change();
    }
}
