
class letsay {

    int x = 100;

    void print() {
        int x = 50;
        System.out.println("Local x = " + x);
        System.out.println("Instance x = " + this.x);
    }
}

public class q18 {

    public static void main(String[] args) {
        new letsay().print();
    }
}
