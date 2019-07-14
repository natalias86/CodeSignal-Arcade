package codesignal.landOfLogic;
/*Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
Example
For
matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
differentSquares(matrix) = 6.*/

import java.util.*;


public class DifferentSquares {

 /*   public static void main(String[] args) {
        int[][] matrix = {{1, 2, 1},
                {2, 2, 2}, {2, 2, 2}, {1, 2, 3}, {2, 2, 1},
        };
        int[][] matrix2 = {{3}};
        System.out.println(differentSquares(matrix2));
    }*/

    static int differentSquares(int[][] matrix) {

        List<int[][]> list = new ArrayList<>();
        List<int[][]> listNoDups = new ArrayList<>();
        if (matrix.length < 2 || matrix[0].length < 2) {
            return 0;
        } else {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    int[][] temp = {{matrix[i][j], matrix[i][j + 1]}, {matrix[i + 1][j], matrix[i + 1][j + 1]}};
                    list.add(temp);
                }
            }
            int counter = 1;
            int listSize = list.size();
            for (int k = 0; k < listSize - 1; k++) {
                for (int l = k + 1; l < listSize; l++) {
                    if (Arrays.deepEquals(list.get(k), list.get(l))) {
                        counter = 1;
                        break;
                    } else {
                        counter++;
                    }

                }
                if (counter != 1)
                    listNoDups.add(list.get(k));
            }
            listNoDups.add(list.get(list.size() - 1));
            return listNoDups.size();
        }
    }
}
