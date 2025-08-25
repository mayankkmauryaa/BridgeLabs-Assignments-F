
class letsay {

    int x = 100;

    void print(int x) {
        System.out.println("Local x = " + x);
        System.out.println("Instance x = " + this.x);
    }
}

public class q6 {

    public static void main(String[] args) {
        new letsay().print(50);
    }
}
