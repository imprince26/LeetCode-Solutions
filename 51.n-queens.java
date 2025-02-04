/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), n, 0);
        return res;
    }

    private void backtrack(List<List<String>> res, List<String> temp, int n, int row) {
        if (row == n) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!isValid(temp, row, col)) {
                continue;
            }
            temp.add(generateString(col, n));
            backtrack(res, temp, n, row + 1);
            temp.remove(temp.size() - 1);
        }
    }

    private boolean isValid(List<String> temp, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (temp.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (temp.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < temp.get(0).length(); i--, j++) {
            if (temp.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }

    private String generateString(int col, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == col) {
                sb.append('Q');
            } else {
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
// @lc code=end
