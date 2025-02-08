/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (s1, s2) -> {
            String s1Str = s1 + s2;
            String s2Str = s2 + s1;
            return s2Str.compareTo(s1Str);
        });
        if(strs[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s);
        }
        return sb.toString();
        
    }
}
// @lc code=end

