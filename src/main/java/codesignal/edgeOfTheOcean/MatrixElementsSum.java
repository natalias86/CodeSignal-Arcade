/*After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).
Example
For
matrix = [[0, 1, 1, 2],
          [0, 5, 0, 0],
          [2, 0, 3, 3]]
the output should be
matrixElementsSum(matrix) = 9.
example 1
There are several haunted rooms, so we'll disregard them as well as any rooms beneath them. Thus, the answer is 1 + 5 + 1 + 2 = 9.
For
matrix = [[1, 1, 1, 0],
          [0, 5, 0, 1],
          [2, 1, 3, 10]]
the output should be
matrixElementsSum(matrix) = 9.*/

package codesignal.edgeOfTheOcean;

public class MatrixElementsSum {
    int matrixElementsSum(int[][] matrix) {
        int result=0;
        for (int i =0; i<matrix.length; i++){
            for (int k=0; k<matrix[i].length;k++) {
                if(i==0 && matrix[i][k]!=0) {
                    result += matrix[i][k];
                }else if(i==0&& matrix[i][k]==0){
                    continue;
                }else if (i!=0&&matrix[i][k]!=0&&matrix[i-1][k]!=0){
                    result += matrix[i][k];
                }else if(matrix[i][k]==0||matrix[i-1][k]==0){
                    matrix[i][k]=0;
                }
            }
        }
        return result;
    }
}
