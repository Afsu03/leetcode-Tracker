// Last updated: 7/9/2026, 9:55:03 AM
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Create arrays of HashSets for rows, columns, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize each HashSet
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse the Sudoku board
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char current = board[row][col];

                // Ignore empty cells
                if (current == '.') {
                    continue;
                }

                // Calculate the box number
                int box = (row / 3) * 3 + (col / 3);

                // Check for duplicates
                if (rows[row].contains(current) ||
                    cols[col].contains(current) ||
                    boxes[box].contains(current)) {

                    return false;
                }

                // Store the number
                rows[row].add(current);
                cols[col].add(current);
                boxes[box].add(current);
            }
        }

        return true;
    }
}