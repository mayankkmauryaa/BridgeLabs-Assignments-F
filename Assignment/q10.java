
class letsay {

    int instance = 10;
    static int Static = 20;

    void print(int local) {
        System.out.println(this.instance);
        System.out.println(Static);
        System.out.println(local);
    }
}

public class q10 {

    public static void main(String[] args) {
        new letsay().print(30);
    }
}
