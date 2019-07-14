/*Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
Example
For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.
7 and 3 produce the largest product.*/

package codesignal.edgeOfTheOcean;

public class AdjacentElementsProduct {
    int adjacentElementsProduct(int[] inputArray) {
        int b=inputArray[0] * inputArray[1];
        for (int i = 2; i < inputArray.length; i++) {


            if (inputArray[i - 1] * inputArray[i] >= b) {
                b = inputArray[i - 1] * inputArray[i];
            }
        }    return b;
    }
}
