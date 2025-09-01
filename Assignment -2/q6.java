public class q6 {
    public static boolean check(String s){
        int start=0;
        int end = s.length()-1;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(check("madam"));
    }
}
