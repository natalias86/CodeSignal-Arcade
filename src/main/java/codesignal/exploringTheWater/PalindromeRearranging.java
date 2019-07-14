package codesignal.exploringTheWater;

/*5
Given a string, find out if its characters can be rearranged to form a palindrome.
Example
For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.
We can rearrange "aabb" to make "abba", which is a palindrome.*/

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

    boolean palindromeRearranging(String inputString) {
        char[] inputStringToChar = inputString.toCharArray();
        int iterator2 = 0;
        Map<Character, Integer> charIterator = new HashMap<Character, Integer>();
        for (char item : inputStringToChar) {
            charIterator.put(item, charIterator.getOrDefault(item, 0) + 1);
        }
        for (Map.Entry<Character, Integer> pair : charIterator.entrySet()) {
            if (pair.getValue() % 2 != 0) {
                iterator2++;
            }
        }
        if (iterator2 > 1) {
            return false;
        } else {
            return true;
        }
    }
}
