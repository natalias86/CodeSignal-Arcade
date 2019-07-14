package codesignal.landOfLogic;

import java.util.Set;
import java.util.TreeSet;

/*Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

Example

For
grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7],
        [4, 6, 5, 8, 7, 9, 3, 2, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
sudoku(grid) = true;

For
grid = [[1, 3, 2, 5, 4, 6, 9, 2, 7],
        [4, 6, 5, 8, 7, 9, 3, 8, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
sudoku(grid) = false.*/
public class Sudoku {
    boolean sudoku(int[][] grid) {
        boolean result = false;
        int line = 0;
        Set<Integer> rowSet = new TreeSet<>();
        Set<Integer> colSet = new TreeSet<>();
        Set<Integer> squareSet = new TreeSet<>();

        while (line < grid.length) {
            for (int i = 0; i < grid.length; i++) {
                rowSet.add(grid[line][i]);
                colSet.add(grid[i][line]);
            }

            if (rowSet.size() < grid.length || colSet.size() < grid.length) {
                result = false;
                break;
            } else {
                result = true;
            }

            if (line == 0 || line == 3 || line == 6) {
                squareSet.add(grid[line][line]);
                squareSet.add(grid[line][line + 1]);
                squareSet.add(grid[line][line + 2]);
                squareSet.add(grid[line + 1][line]);
                squareSet.add(grid[line + 1][line + 1]);
                squareSet.add(grid[line + 1][line + 2]);
                squareSet.add(grid[line + 2][line]);
                squareSet.add(grid[line + 2][line + 1]);
                squareSet.add(grid[line + 2][line + 2]);
                if (squareSet.size() < 9) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            rowSet.clear();
            colSet.clear();
            squareSet.clear();
            line++;
        }
        return result;
    }
}

