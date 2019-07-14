package codesignal.divingDeeper;

import java.util.ArrayList;
import java.util.List;

/* Given array of integers, remove each kth element from it.
        Example
        For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
        extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].*/
public class ExtractEachKth {
    int[] extractEachKth(int[] inputArray, int k) {
        List<Integer> list = new ArrayList<>();
        int counter = k - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (i != counter) {
                list.add(inputArray[i]);
            } else {
                counter += k;
            }
        }
        int[] listToArray = new int[list.size()];
        for (int i = 0; i < listToArray.length; i++) {
            listToArray[i] = list.get(i);
        }
        return listToArray;
    }
}
