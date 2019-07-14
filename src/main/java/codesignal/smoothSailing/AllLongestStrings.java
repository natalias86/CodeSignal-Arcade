package codesignal.smoothSailing;

/* Given an array of strings, return another array containing all of its longest strings.
Example
For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
  */
public class AllLongestStrings {
    String[] allLongestStrings(String[] inputArray) {

        int result = 0;
        int counter = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (result < inputArray[i].length()) {
                result = inputArray[i].length();
            }
        }

        for (int k = 0; k < inputArray.length; k++) {
            if (inputArray[k].length() == result) {
                counter++;

            }
        }

        String[] outputString = new String[counter];
        int index = 0;
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j].length() == result) {
                outputString[index++] = inputArray[j];

            }
        }
        return outputString;
    }
}
