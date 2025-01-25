/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        int maxProduct = nums[0];
        max.add(nums[0]);
        min.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                max.add(Math.max(max.get(i - 1) * nums[i], nums[i]));
                min.add(Math.min(min.get(i - 1) * nums[i], nums[i]));
            } else {
                max.add(Math.max(min.get(i - 1) * nums[i], nums[i]));
                min.add(Math.min(max.get(i - 1) * nums[i], nums[i]));
            }
            maxProduct = Math.max(maxProduct, max.get(i));
        }
        return maxProduct;
    }
}
// @lc code=end

