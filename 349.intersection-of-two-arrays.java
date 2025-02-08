/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>(); 
        for (int num : nums1) set.add(num);
        List<Integer> list = new ArrayList<>(); 
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}
// @lc code=end

