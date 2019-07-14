package codesignal.divingDeeper;

import java.util.HashSet;
import java.util.Set;

/* Given a string, find the number of different characters in it.
    Example
    For s = "cabca", the output should be
    differentSymbolsNaive(s) = 3.*/

public class DifferentSymbolsNaive {
    int differentSymbolsNaive(String s) {
        char [] strToArray = s.toCharArray();
        Set<Character> tempSet = new HashSet<Character>();
        for (char k:strToArray){
            tempSet.add(k);
        }
        return tempSet.size();
    }
}
