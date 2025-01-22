/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int low=1, high=n;
        while(low <= high){
            int mid = (low + high)/2;

            if(mid == n/mid) return mid;
            else if(mid < n/mid) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
}
// @lc code=end

