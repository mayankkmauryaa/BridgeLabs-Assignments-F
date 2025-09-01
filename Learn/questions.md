# 📘 Java String Problems & Solutions

## 🟢 Level 1 – Basics

### 1. Check if two strings are equal (case-sensitive & case-insensitive)

```java
String s1 = "Hello", s2 = "hello";
System.out.println(s1.equals(s2));          // false
System.out.println(s1.equalsIgnoreCase(s2)); // true
```

### 2. Convert string to uppercase without `toUpperCase()`

```java
String str = "hello";
StringBuilder sb = new StringBuilder();
for(char c : str.toCharArray()) {
    if(c >= 'a' && c <= 'z') c = (char)(c - 32);
    sb.append(c);
}
System.out.println(sb.toString()); // HELLO
```

### 3. Count vowels in a string

```java
String str = "Hello World";
int count = 0;
for(char c : str.toLowerCase().toCharArray()) {
    if("aeiou".indexOf(c) != -1) count++;
}
System.out.println(count); // 3
```

### 4. Find length without `.length()`

```java
String str = "BridgeLabs";
int length = 0;
for(char c : str.toCharArray()) length++;
System.out.println(length); // 10
```

### 5. Check palindrome

```java
String str = "madam";
String rev = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(rev)); // true
```

### 6. First non-repeating character

```java
String str = "swiss";
Map<Character,Integer> map = new LinkedHashMap<>();
for(char c : str.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
for(char c : map.keySet()) {
    if(map.get(c) == 1) { System.out.println(c); break; }
}
```

### 7. Count words (StringTokenizer)

```java
String str = "Hello world from Java";
StringTokenizer st = new StringTokenizer(str);
System.out.println(st.countTokens()); // 4
```

### 8. Replace spaces with hyphens

```java
String str = "Hello World Java";
System.out.println(str.replace(' ', '-')); // Hello-World-Java
```

### 9. ASCII value of each character

```java
String str = "AB";
for(char c : str.toCharArray()) {
    System.out.println(c + " -> " + (int)c);
}
```

---

## 🟡 Level 2 – Intermediate

### 10. Reverse each word in a sentence

```java
String str = "Hello World";
String[] words = str.split(" ");
StringBuilder result = new StringBuilder();
for(String w : words) {
    result.append(new StringBuilder(w).reverse()).append(" ");
}
System.out.println(result.toString().trim()); // olleH dlroW
```

### 11. Remove duplicate characters

```java
String str = "programming";
StringBuilder sb = new StringBuilder();
Set<Character> set = new LinkedHashSet<>();
for(char c : str.toCharArray()) set.add(c);
for(char c : set) sb.append(c);
System.out.println(sb.toString()); // progamin
```

### 12. Check anagrams

```java
String s1 = "listen", s2 = "silent";
char[] a = s1.toCharArray(), b = s2.toCharArray();
Arrays.sort(a); Arrays.sort(b);
System.out.println(Arrays.equals(a,b)); // true
```

### 13. Remove digits

```java
String str = "a1b2c3";
System.out.println(str.replaceAll("\\d","")); // abc
```

### 14. Capitalize first letter of each word

```java
String str = "hello world java";
String[] words = str.split(" ");
StringBuilder sb = new StringBuilder();
for(String w : words) {
    sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
}
System.out.println(sb.toString().trim()); // Hello World Java
```

### 15. Check only digits

```java
String str = "12345";
System.out.println(str.matches("\\d+")); // true
```

### 16. String compression

```java
String str = "aaabbcc";
StringBuilder sb = new StringBuilder();
int count = 1;
for(int i=1;i<=str.length();i++) {
    if(i<str.length() && str.charAt(i)==str.charAt(i-1)) count++;
    else { sb.append(str.charAt(i-1)).append(count); count=1; }
}
System.out.println(sb.toString()); // a3b2c2
```

### 17. Toggle case

```java
String str = "AbC";
StringBuilder sb = new StringBuilder();
for(char c : str.toCharArray()) {
    if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
    else sb.append(Character.toUpperCase(c));
}
System.out.println(sb.toString()); // aBc
```

### 18. Longest word in sentence

```java
String str = "I love programming in Java";
String[] words = str.split(" ");
String longest = "";
for(String w : words) if(w.length()>longest.length()) longest = w;
System.out.println(longest); // programming
```

### 19. Frequency of each character

```java
String str = "hello";
Map<Character,Integer> map = new HashMap<>();
for(char c : str.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
System.out.println(map); // {e=1, h=1, l=2, o=1}
```

---

## 🔴 Level 3 – Advanced

### 20. Implement custom `split()`

```java
public static List<String> mySplit(String str, char delimiter) {
    List<String> result = new ArrayList<>();
    StringBuilder word = new StringBuilder();
    for(char c : str.toCharArray()) {
        if(c==delimiter) { result.add(word.toString()); word.setLength(0); }
        else word.append(c);
    }
    result.add(word.toString());
    return result;
}
```

### 21. Check substring without `contains()`

```java
String str = "hello world", sub = "world";
boolean found = false;
for(int i=0;i<=str.length()-sub.length();i++) {
    if(str.substring(i,i+sub.length()).equals(sub)) { found = true; break; }
}
System.out.println(found); // true
```

### 22. Custom `equals()`

```java
public static boolean myEquals(String a, String b) {
    if(a.length()!=b.length()) return false;
    for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
    return true;
}
```

### 23. Group anagrams

```java
String[] words = {"listen","silent","cat","act"};
Map<String,List<String>> map = new HashMap<>();
for(String w : words) {
    char[] arr = w.toCharArray();
    Arrays.sort(arr);
    String key = new String(arr);
    map.computeIfAbsent(key,k->new ArrayList<>()).add(w);
}
System.out.println(map.values());
```

### 24. Longest common prefix

```java
String[] arr = {"flower","flow","flight"};
Arrays.sort(arr);
String first = arr[0], last = arr[arr.length-1];
int i=0;
while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)) i++;
System.out.println(first.substring(0,i)); // fl
```

### 25. All permutations

```java
public static void permute(String s, String ans) {
    if(s.length()==0) { System.out.println(ans); return; }
    for(int i=0;i<s.length();i++) {
        char c = s.charAt(i);
        String rest = s.substring(0,i)+s.substring(i+1);
        permute(rest, ans+c);
    }
}
```

### 26. Valid shuffle of two strings

```java
public static boolean isShuffle(String a, String b, String c) {
    if(a.length()+b.length()!=c.length()) return false;
    int i=0,j=0,k=0;
    while(k<c.length()) {
        if(i<a.length() && a.charAt(i)==c.charAt(k)) i++;
        else if(j<b.length() && b.charAt(j)==c.charAt(k)) j++;
        else return false;
        k++;
    }
    return true;
}
```

### 27. Custom `replace()`

```java
public static String myReplace(String str, char oldCh, char newCh) {
    StringBuilder sb = new StringBuilder();
    for(char c : str.toCharArray()) {
        if(c==oldCh) sb.append(newCh);
        else sb.append(c);
    }
    return sb.toString();
}
```

### 28. Remove consecutive duplicates

```java
String str = "aabbccdde";
StringBuilder sb = new StringBuilder();
for(int i=0;i<str.length();i++) {
    if(i==0 || str.charAt(i)!=str.charAt(i-1)) sb.append(str.charAt(i));
}
System.out.println(sb.toString()); // abcde
```

### 29. Simple regex matcher (`*`, `?`)

```java
public static boolean match(String text, String pattern) {
    if(pattern.isEmpty()) return text.isEmpty();
    if(pattern.length()>1 && pattern.charAt(1)=='*') {
        return match(text, pattern.substring(2)) ||
               (!text.isEmpty() && (text.charAt(0)==pattern.charAt(0)) && match(text.substring(1), pattern));
    }
    if(!text.isEmpty() && (pattern.charAt(0)=='.' || text.charAt(0)==pattern.charAt(0))) {
        return match(text.substring(1), pattern.substring(1));
    }
    if(pattern.length()>1 && pattern.charAt(1)=='?') {
        return match(text, pattern.substring(2)) ||
               (!text.isEmpty() && match(text.substring(1), pattern.substring(2)));
    }
    return false;
}
```
