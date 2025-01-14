// reverse integer
public class Problem7 {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Problem7 solution = new Problem7();
        System.out.println(solution.reverse(123)); // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120)); // Output: 21
        System.out.println(solution.reverse(0)); // Output: 0
    }
}