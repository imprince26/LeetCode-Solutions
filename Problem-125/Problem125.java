public class Problem125 {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
    
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
    
        String filtered = filteredString.toString();
        String reversed = filteredString.reverse().toString();
    
        return filtered.equals(reversed);
    }

    public static void main(String[] args) {
        Problem125 solution = new Problem125();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solution.isPalindrome("race a car")); // false
    }
}