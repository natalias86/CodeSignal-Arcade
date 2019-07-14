package codesignal.rainbowOfClarity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
Example
For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.*/
public class DeleteDigit {
    int deleteDigit(int n) {
        String nSt = String.valueOf(n);
        List<String> list = new ArrayList<>();
        String tempSt;

        for (int i = 0; i < nSt.length(); i++) {
            tempSt = nSt.substring(0, i) + nSt.substring(i + 1);
            list.add(tempSt);
        }
        Collections.sort(list, Collections.reverseOrder());
        return Integer.parseInt(list.get(0));
    }
}
