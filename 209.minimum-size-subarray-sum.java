/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
// @lc code=end