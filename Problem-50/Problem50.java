public class Problem50 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String args[]) {
        Problem50 solution = new Problem50();
        System.out.println(solution.myPow(2.0, 10)); // Output: 1024.0
        System.out.println(solution.myPow(2.1, 3)); // Output: 9.261
        System.out.println(solution.myPow(2.0, -2)); // Output: 0.25
    }
}