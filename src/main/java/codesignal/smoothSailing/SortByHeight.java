package codesignal.smoothSailing;

import java.util.Arrays;

public class SortByHeight {
    int[] sortByHeight(int[] a) {

        int lengthNew = 0;
        int newIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                lengthNew++;
            }
        }
        int[] newSortedTable = new int[lengthNew];
        for (int j = 0; j < a.length; j++) {
            if (a[j] != -1) {
                newIndex++;
                newSortedTable[newIndex] = a[j];
            }
        }

        Arrays.sort(newSortedTable);

        int counter = 0;
        for (int k = 0; k < a.length; k++) {
            if (a[k] == -1) {
                continue;
            } else {
                a[k] = newSortedTable[counter];
                counter++;
            }
        }
        return a;
    }
}
