// Problem-49: Group Anagrams
import java.util.*;

public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Problem49 solution = new Problem49();
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = solution.groupAnagrams(input);
        System.out.println(result);
    }
}