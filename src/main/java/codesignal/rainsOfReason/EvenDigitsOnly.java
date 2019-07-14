package codesignal.rainsOfReason;

/* Check if all digits of the given integer are even.
        Example
        For n = 248622, the output should be
        evenDigitsOnly(n) = true;
        For n = 642386, the output should be
        evenDigitsOnly(n) = false.
*/
public class EvenDigitsOnly {
    boolean evenDigitsOnly(int n) {
        char[] chars = ("" + n).toCharArray();
        int counter = 0;
        for (char element : chars) {
            if (element % 2 > 0) {
                counter++;
            }
        }
        if (counter > 0) {
            return false;
        } else {
            return true;
        }
    }
}
