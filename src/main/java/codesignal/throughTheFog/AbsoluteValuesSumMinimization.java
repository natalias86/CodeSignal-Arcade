package codesignal.throughTheFog;

import java.util.*;

/* Given a sorted array of integers a, find an integer x from a such that the value of
    abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
    is the smallest possible (here abs denotes the absolute value).
    If there are several possible answers, output the smallest one.*/
public class AbsoluteValuesSumMinimization {
    int absoluteValuesSumMinimization(int[] a) {
        int output = 0;
        Map<Integer, Integer> mapResults = new HashMap<>();
        List<Integer> listOfMinResults = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                output += Math.abs(a[j] - a[i]);
            }
            mapResults.put(a[i], output);
            output = 0;
        }
        int minValue = mapResults.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
        for (Map.Entry<Integer, Integer> entry : mapResults.entrySet()) {
            if (entry.getValue().equals(minValue)) {
                listOfMinResults.add(entry.getKey());
            }
        }
        return Collections.min(listOfMinResults);
    }
}
