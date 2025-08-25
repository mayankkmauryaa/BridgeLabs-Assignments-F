
class letsay {

    int num;

    void set(int num) {
        this.num = num;
    }
}

public class q14 {

    public static void main(String[] args) {
        letsay d = new letsay();
        System.out.println(d.num);
        d.set(25);
        System.out.println(d.num);
    }
}
