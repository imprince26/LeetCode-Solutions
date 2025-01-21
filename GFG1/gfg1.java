// remove consecutive duplicates
public class gfg1 {
    public static String removeConsecutiveDuplicates(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        char prevChar = s.charAt(0);
        result.append(prevChar);

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "aabb";
        String s2 = "aabaa";
        String s3 = "abcddcba";

        System.out.println(removeConsecutiveDuplicates(s1)); // Output: "ab"
        System.out.println(removeConsecutiveDuplicates(s2)); // Output: "aba"
        System.out.println(removeConsecutiveDuplicates(s3)); // Output: "abcdcba"
    }

}