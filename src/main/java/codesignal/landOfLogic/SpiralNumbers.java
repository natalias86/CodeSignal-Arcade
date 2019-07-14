package codesignal.landOfLogic;

import java.util.Arrays;

/*Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.
Example
For n = 3, the output should be
spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]*/
public class SpiralNumbers {


  int[][] spiralNumbers(int n) {
        int[][] outputMatrix = new int[n][n];
        int currentNumber=1;
        int maxNumber=n*n;
        int nrOfCol=n-1;
        int nrOfRow=n-1;
        int firstCol=0;
        int firstRow=0;

        while(currentNumber <=maxNumber) {

            for (int i = firstCol; i <=nrOfCol; i++) {
                    outputMatrix[firstRow][i] = currentNumber;
                    currentNumber++;


                }
            firstRow++;
            for (int i = firstRow; i <=nrOfRow; i++) {
                outputMatrix[i][nrOfCol] = currentNumber;
                currentNumber++;


            }
            nrOfCol--;
            for (int i = nrOfCol; i >=firstCol; i--) {
                outputMatrix[nrOfRow][i] = currentNumber;
                currentNumber++;

            }
            nrOfRow--;
            for (int i = nrOfRow; i >=firstRow; i--) {
                outputMatrix[i][firstCol] = currentNumber;
                currentNumber++;

            }
            firstCol++;
        }

        return outputMatrix;
    }
}
