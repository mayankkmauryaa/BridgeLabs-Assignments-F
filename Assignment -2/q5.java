public class q5 {
    public static void printFib(int n){
        int a=0;int b=1;
        int c=0;
        for(int i=1;i<=n;i++){
            a=b;
            b=c; 
            c=a+b;
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        printFib(10);
        
    }
}
