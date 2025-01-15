// 35. Search Insert Position
public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Problem35 solution = new Problem35();
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(solution.searchInsert(nums, target)); // Output: 2

        target = 2;
        System.out.println(solution.searchInsert(nums, target)); // Output: 1

        target = 7;
        System.out.println(solution.searchInsert(nums, target)); // Output: 4

        target = 0;
        System.out.println(solution.searchInsert(nums, target)); // Output: 0
    }
}