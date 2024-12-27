/*==== 
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.
====*/
import java.util.HashMap;
class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int maxLength=0;
        HashMap<Character,Integer> map=new HashMap();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                st=Math.max(st,map.get(ch)+1);
            }
            map.put(ch,i);
            maxLength=Math.max(maxLength,i-st+1);
        }
        return maxLength;       
    }
}