import java.util.Arrays;

// LeetCode Problem 14: Longest Common Prefix

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                ans.append(first.charAt(i));
            } else {
                return ans.toString();
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Problem14 solution = new Problem14();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs));
    }
}