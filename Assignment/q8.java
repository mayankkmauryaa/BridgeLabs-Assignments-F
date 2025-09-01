
class letsay {

    static int x;

    static {
        x = 42;
        System.out.println("Static block executed");
    }
}

public class q8 {

    public static void main(String[] args) {
        System.out.println(letsay.x);
    }
}
