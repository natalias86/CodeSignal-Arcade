package codesignal.islandOfKnowledge;
/* You are given an array of integers representing coordinates of obstacles situated on a straight line.
 Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer. Find the minimal length of the jump enough to avoid all the obstacles.
        Example
        For inputArray = [5, 3, 6, 7, 9], the output should be
        avoidObstacles(inputArray) = 4.*/
import java.util.Arrays;

public class AvoidObstacles {
    int avoidObstacles(int[] inputArray) {
        Arrays.sort(inputArray);

        int k = 2;
        int result = inputArray[inputArray.length - 1] + 1;
        for (int j = k; j <= (inputArray[inputArray.length - 1]); j = j + k) {
            for (int i = 0; i < inputArray.length; i++) {
                if (j == inputArray[i]) {
                    result = inputArray[inputArray.length - 1] + 1;
                    k = k + 1;
                    j = 0;
                    break;
                } else {
                    result = k;
                }
            }
        }
        return result;
    }
}
