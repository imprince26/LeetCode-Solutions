import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    private static final String[] KEYS = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, digits, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = KEYS[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            backtrack(result, digits, current + letter, index + 1);
        }
    }

    public static void main(String[] args) {
        Problem17 solution = new Problem17();
        System.out.println(solution.letterCombinations("23"));
    }
}