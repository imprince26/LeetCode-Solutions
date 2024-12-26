/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. */

public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans[] = new int[m + n];
        double median;
        for (int i = 0; i < m + n; i++) {
            if (i < m) {
                ans[i] = nums1[i];
            } else {
                ans[i] = nums2[i - m];
            }
        }
        Arrays.sort(ans);
        if (ans.length % 2 == 0) {
            median = (ans[ans.length / 2 - 1] + ans[ans.length / 2]) / 2.0;
        } else {
            median = ans[ans.length / 2];
        }
        return median;

    }
}
