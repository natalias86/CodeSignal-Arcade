package codesignal.exploringTheWater;

/*3
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
Given two arrays a and b, check whether they are similar.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreSimilar {
    boolean areSimilar(int[] a, int[] b) {
        int temp;
        int counter = 0;
        boolean value;
        List<Integer> tempList = new ArrayList<>();
        for (int j = 0; j < a.length; j++) {
            if (a[j] != b[j]) {
                counter++;
                tempList.add(j);
            } else {
                continue;
            }
        }
        if (counter == 2) {
            temp = a[tempList.get(1)];
            a[tempList.get(1)] = a[tempList.get(0)];
            a[tempList.get(0)] = temp;
        }

        if (counter == 0) {
            value = true;
        } else if (counter > 2 || counter == 1) {
            value = false;
        } else if (counter == 2 && Arrays.equals(a, b)) {
            value = true;
        } else {
            value = false;
        }


        return value;
    }
}
