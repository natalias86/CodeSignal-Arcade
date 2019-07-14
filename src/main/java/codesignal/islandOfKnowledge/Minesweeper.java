package codesignal.islandOfKnowledge;
/*In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.*/
public class Minesweeper {
    int[][] minesweeper(boolean[][] matrix) {
        int counter = 0;
        int[][] outputMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i - 1 >= 0&&matrix[i - 1][j] == true) {
                    counter++;
                }
                if (j - 1 >= 0&&matrix[i][j - 1] == true) {
                    counter++;
                }
                if (j + 1 < matrix[0].length&&matrix[i][j + 1] == true) {
                    counter++;
                }

                if (i + 1 < matrix.length&&matrix[i + 1][j] == true) {
                    counter++;
                }
                if (i -1>=0&&j-1>=0&&matrix[i -1][j-1] == true) {
                    counter++;
                }
                if (i -1>=0&&j+1<matrix[0].length&&matrix[i -1][j+1] == true) {
                    counter++;
                }
                if (i +1<matrix.length&&j-1>=0&&matrix[i+1][j-1] == true) {
                    counter++;
                }
                if (i +1<matrix.length&&j+1<matrix[0].length&&matrix[i +1][j+1] == true) {
                    counter++;
                }
                outputMatrix[i][j] = counter;
                counter = 0;
            }
        }
        return outputMatrix;
    }
}
