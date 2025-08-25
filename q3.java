
class letsay {

    void print() {
        int x = 10;
        System.out.println(x);
    }
}

public class q3 {

    public static void main(String[] args) {
        letsay d = new letsay();
        d.print();
        // System.out.println(x);
    }
}

/*
 * error: cannot find symbol
 *        System.out.println(x);
 *                           ^
 *  symbol:   variable x
 *  location: class q3
 * 1 error
 */
