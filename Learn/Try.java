
public class Try {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        String str = "swiss";
        // Map<Character, Integer> map = new HashMap<>();
        // for (char c : str.toCharArray()) {
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }
        // for (char c : map.keySet()) {
        //     if (map.get(c) == 1) {
        //         System.out.println(c);
        //         break;
        //     }

        // }
        str = str.toLowerCase();
        int abc[] = new int[26];

        for (char c : str.toCharArray()) {
            abc[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (abc[i] == 1) {
                System.out.println((char)(i+'a'));
                break;
            }
        }
        for (char c : str.toCharArray()) {
            if (abc[c - 'a'] == 1) {
                System.out.println(c);
                break;
            }
        }

    }
}
