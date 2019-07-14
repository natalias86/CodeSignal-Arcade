package codesignal.throughTheFog;
/*Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.
Note: You're only rearranging the order of the strings, not the order of the letters within the strings!
Example
For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false.*/
import java.util.ArrayList;
public class StringsRearrangement {
    boolean stringsRearrangement(String[] inputArray) {

        ArrayList<Boolean> listOfResults = new ArrayList<>();
        permute(inputArray, 0, inputArray.length - 1, listOfResults);
        if (listOfResults.contains(true))
            return true;
        return false;
    }

    void swapTemp(String[] array, int i, int j) {
        String temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    void permute(String[] array, int p, int r, ArrayList<Boolean> listOfStringsChecked) {
        if (p == r) {
            listOfStringsChecked.add(stringChecker(array));
        } else {
            for (int i = p; i <= r; i++) {
                swapTemp(array, p, i);
                permute(array, p + 1, r, listOfStringsChecked);
                swapTemp(array, p, i);
            }
        }
    }
    boolean stringChecker(String[] inputArray) {
        int stringLngth = inputArray[0].length();
        boolean output = false;
        for (int k = 0; k < inputArray.length - 1; k++) {
            if (!inputArray[k + 1].equals(inputArray[k])) {
                int diff = 0;

                for (int j = 0; j < stringLngth; j++) {
                    if (inputArray[k + 1].charAt(j) != inputArray[k].charAt(j)) {
                        diff++;
                    }
                }
                if (diff > 1) {
                    output = false;
                    break;
                } else if (diff <= 1 && k == inputArray.length - 2) {
                    output = true;
                } else {
                    continue;
                }
            } else {
                output = false;
                break;
            }
        }
        return output;
    }
}
