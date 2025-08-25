
class letsay {

    final int num = 10;

    void change() {
        System.out.println(this.num);
        // num = 20;
        System.out.println(num);
    }
}

public class q7 {

    public static void main(String[] args) {
        new letsay().change();
    }
}


/*
 * error: cannot assign a value to final variable num
 *        num = 20;
 *        ^
 * 1 error
 */
