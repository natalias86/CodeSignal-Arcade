package codesignal.smoothSailing;
/* Given two strings, find the number of common characters between them.
Example
For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.*/

public class CommonCharacterCount {
    int commonCharacterCount(String s1, String s2) {
        int iterator1 = 0;
        int iterator2 = 0;
        int counter=0;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        for (int i = 0; i<(c1.length+c2.length);i++) {
            if (iterator1>=c1.length||iterator2>=c2.length){
                break;
            } else if (c1[iterator1] == c2[iterator2]) {
                counter++;
                iterator1++;
                iterator2++;
            } else if (c1[iterator1] > c2[iterator2]){
                iterator2++;
            } else if (c1[iterator1] < c2[iterator2])
                iterator1++;

        }
        return counter;
    }
}
