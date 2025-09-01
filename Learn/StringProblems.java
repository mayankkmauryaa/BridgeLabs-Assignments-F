
import java.util.*;

public class StringProblems {

    // 1. Check if two strings are equal (case-sensitive & insensitive)
    public static void checkEqualStrings(String s1, String s2) {
        System.out.println("Case-sensitive: " + s1.equals(s2));
        System.out.println("Case-insensitive: " + s1.equalsIgnoreCase(s2));
    }

    // 2. Convert to uppercase without toUpperCase()
    public static String toUpperManual(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    // 3. Count vowels
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // 4. Find length without .length()
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // 5. Palindrome check
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    // 6. First non-repeating character using HashMap
    public static char firstNonRepeating(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    // 6. First non-repeating character using character array
    public static void firstNonRepeating2(String str) {
        str = str.toLowerCase();
        int abc[] = new int[26];

        for (char c : str.toCharArray()) {
            abc[c - 'a']++;
        }
        for (char c : str.toCharArray()) {
            if (abc[c - 'a'] == 1) {
                System.out.println(c);
                break;
            }
        }

        // for (int i = 0; i < 26; i++) {
        //     if (abc[i] == 1) {
        //         System.out.println((char) (i + 'a'));
        //         break;
        //     }
        // }
    }

    // 7. Count words using StringTokenizer
    public static int countWords(String str) {
        StringTokenizer st = new StringTokenizer(str);
        return st.countTokens();
    }

    // 7. Count words using  split() 
    public static void printWords2(String str) {
        int count = 0;
        String[] words = str.split("\\s+"); // split by whitespace
        for (String word : words) {
            System.out.println(word);
            count++;
        }
        System.out.println("Numver of words: " + count);
    }

    // Print words using StringTokenizer
    public static void printWords(String str) {
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    // 8. Replace spaces with hyphens with replace function
    public static String replaceSpaces(String str) {
        return str.replace(' ', '-');
    }

    // 8. Replace spaces with hyphens
    public static void replaceSpaces2(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                result.append('-');
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }

    // 9. Print ASCII values
    public static void printAscii(String str) {
        for (char c : str.toCharArray()) {
            System.out.println(c + " -> " + (int) c);
        }
    }

    // 10. Reverse each word
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            result.append(new StringBuilder(w).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    // 11. Remove duplicate characters
    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

    // 12. Check anagram
    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.toCharArray(), b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    // 13. Remove digits
    public static String removeDigits(String str) {
        return str.replaceAll("\\d", "");
    }

    // 14. Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    // 15. Check only digits
    public static boolean onlyDigits(String str) {
        return str.matches("\\d+");
    }

    // 16. Compress string
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    // 17. Toggle case
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    // 18. Longest word
    public static String longestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }
        return longest;
    }

    // 19. Character frequency
    public static Map<Character, Integer> charFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    // 20. Custom split
    public static List<String> mySplit(String str, char delimiter) {
        List<String> result = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == delimiter) {
                result.add(word.toString());
                word.setLength(0);
            } else {
                word.append(c);
            }
        }
        result.add(word.toString());
        return result;
    }

    // 21. Substring check without contains
    public static boolean hasSubstring(String str, String sub) {
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                return true;
            }
        }
        return false;
    }

    // 22. Custom equals
    public static boolean myEquals(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // 23. Group anagrams
    public static Collection<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : words) {
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        return map.values();
    }

    // 24. Longest common prefix
    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String first = arr[0], last = arr[arr.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    // 25. All permutations
    public static void permute(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            permute(rest, ans + c);
        }
    }

    // 26. Valid shuffle of two strings
    public static boolean isShuffle(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) {
            return false;
        }
        int i = 0, j = 0, k = 0;
        while (k < c.length()) {
            if (i < a.length() && a.charAt(i) == c.charAt(k)) {
                i++;
            } else if (j < b.length() && b.charAt(j) == c.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return true;
    }

    // 27. Custom replace
    public static String myReplace(String str, char oldCh, char newCh) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == oldCh) {
                sb.append(newCh);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 28. Remove consecutive duplicates
    public static String removeConsecutiveDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // 29. Simple regex matcher (* and ?)
    public static boolean match(String text, String pattern) {
        if (pattern.isEmpty()) {
            return text.isEmpty();
        }
        if (pattern.length() > 1 && pattern.charAt(1) == '*') {
            return match(text, pattern.substring(2))
                    || (!text.isEmpty() && text.charAt(0) == pattern.charAt(0) && match(text.substring(1), pattern));
        }
        if (!text.isEmpty() && (pattern.charAt(0) == '.' || text.charAt(0) == pattern.charAt(0))) {
            return match(text.substring(1), pattern.substring(1));
        }
        if (pattern.length() > 1 && pattern.charAt(1) == '?') {
            return match(text, pattern.substring(2))
                    || (!text.isEmpty() && match(text.substring(1), pattern.substring(2)));
        }
        return false;
    }

    // main to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        replaceSpaces2(str);
        sc.close();
    }
}
