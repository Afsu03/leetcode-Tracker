// Last updated: 8/24/2026, 2:44:18 PM
class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = matrix.length - 1; j >= 0; j--) {

                result[i][n - 1 - j] = matrix[j][i];

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}