/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
          int oddCount = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray() ){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch) % 2 == 1){
                oddCount++;
            }else{
            oddCount--;
            }
        }
        if(oddCount > 1){
            return s.length() - oddCount + 1;
        }
        return s.length();
    }
}
// @lc code=end

