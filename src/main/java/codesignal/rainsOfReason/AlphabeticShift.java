package codesignal.rainsOfReason;

/* Given a string, replace each of its character by the next one in the English alphabet (z would be replaced by a).
        Example
        For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".*/
public class AlphabeticShift {
    String alphabeticShift(String inputString) {
        int temp;

        StringBuilder output = new StringBuilder(inputString);

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 122) {
                output.setCharAt(i, 'a');
            } else {
                temp = inputString.charAt(i) + 1;
                output.setCharAt(i, (char) temp);
            }
        }
        return String.valueOf(output);
    }
}
