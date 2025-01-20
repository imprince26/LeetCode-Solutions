public class Problem69 {
    public int mySqrt(int n) {
        int low=1, high=n;
        while(low <= high){
            int mid = (low + high)/2;

            if(mid == n/mid) return mid;
            else if(mid < n/mid) low = mid+1;
            else high = mid-1;
        }
        return high;
    }

    public static void main(String[] args) {
        Problem69 solution = new Problem69();
        System.out.println(solution.mySqrt(4)); // Output: 2
        System.out.println(solution.mySqrt(8)); // Output: 2
    }
}