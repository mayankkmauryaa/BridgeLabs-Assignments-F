
class letsay {

    void print() {
        int x;
        // System.out.println(x);
        System.out.println("The local variable x may not have been initialized");
    }
}

public class q16 {

    public static void main(String[] args) {
        letsay x = new letsay();
        x.print();
    }
}
