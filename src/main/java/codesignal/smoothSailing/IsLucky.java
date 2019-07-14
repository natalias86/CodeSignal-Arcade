package codesignal.smoothSailing;
/*
Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.
Example
For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.

*/
public class IsLucky {
    boolean isLucky(int n) {
        String nToString = String.valueOf(n);
        char[] numberToCharArray = nToString.toCharArray();
        int valueToCompare1 =0;
        int valueToCompare2 =0;
        int index = numberToCharArray.length/2;
        for (int i=0; i<index;i++){
            valueToCompare1+=numberToCharArray[i];
            valueToCompare2+=numberToCharArray[index+i];
        }
        return (valueToCompare1==valueToCompare2);

    }
}
