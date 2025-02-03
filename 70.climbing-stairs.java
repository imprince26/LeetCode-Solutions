/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        int[] ans = new int[n + 1];
        // base case
        ans[1] = 1;
        ans[2] = 2;
        // dp
        for (int i = 3; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];

    }
}
// @lc code=end