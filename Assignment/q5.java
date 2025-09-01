
class count {

    static int value1 = 0;
    int value2 = 0;
}

public class q5 {

    public static void main(String[] args) {
        count c1 = new count();
        count c2 = new count();

        c1.value1 = 5;
        System.out.println(c2.value1);  //local
        System.out.println(c2.value2);  //global
    }
}
