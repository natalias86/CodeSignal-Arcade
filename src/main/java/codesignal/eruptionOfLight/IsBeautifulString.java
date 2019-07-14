package codesignal.eruptionOfLight;

import java.util.Map;
import java.util.TreeMap;

/* A string is said to be beautiful if each letter of the alphabet appears at most as many times as than the previous letter; ie: b occurs no more times than a; c occurs no more times than b; etc.
 Given a string, check whether it is beautiful.
 Example
 For inputString = "bbbaacdafe", the output should be isBeautifulString(inputString) = true;*/

public class IsBeautifulString {
    boolean isBeautifulString(String inputString) {
        Map<Integer, Integer> lettersMap = new TreeMap<>();
        for (int j = 97; j < 123; j++) {
            lettersMap.put(j, 0);
        }
        int a;
        for (int i = 0; i < inputString.length(); i++) {
            a = inputString.charAt(i);
            lettersMap.put(a, lettersMap.get(a) + 1);
        }
        boolean result = false;
        for (int k = 97; k < 122; k++) {
            if (lettersMap.get(k) >= lettersMap.get(k + 1)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
