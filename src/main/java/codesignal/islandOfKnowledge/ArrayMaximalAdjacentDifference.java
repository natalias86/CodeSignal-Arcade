package codesignal.islandOfKnowledge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
Example
For inputArray = [2, 4, 1, 0], the output should be arrayMaximalAdjacentDifference(inputArray) = 3.*/

public class ArrayMaximalAdjacentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int distance = 0;
        List<Integer> listDistance = new ArrayList<>();
        for (int i = 1; i < inputArray.length; i++) {
            distance = Math.abs(inputArray[i - 1] - inputArray[i]);
            listDistance.add(distance);
        }
        return Collections.max(listDistance);
    }
}
