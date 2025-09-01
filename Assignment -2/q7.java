public class q7 {
    public static int fact(int n){
        int fact=1;
        if(n<=1){
            return fact;
        }
        return n*(fact(n-1));
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
