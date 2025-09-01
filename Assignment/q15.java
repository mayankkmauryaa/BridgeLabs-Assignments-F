
class letsay {

    int x;

    void setX(int value) {
        x = value;
    }

    void printX() {
        System.out.println(x);
    }
}

public class q15 {

    public static void main(String[] args) {
        letsay d = new letsay();
        d.setX(100);
        d.printX();
    }
}
