package codesignal.smoothSailing;

import java.util.List;
import java.util.stream.Collectors;

/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.
Input strings will always be well-formed with matching ()s.
Example:
For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
 */
public class ReverseInParentheses {

    String reverseInParentheses(String inputString) {

        List<Character> inputStringToList = inputString.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        int lengthOfTable = inputStringToList.size();
        for (int i = 0; i < lengthOfTable; i++) {
            int counter = 0;
            char temp;
            char newValue;
            int j = i - 1;

            if (inputStringToList.get(i).equals(')')) {

                while (!inputStringToList.get(j).equals('(')) {
                    counter++;
                    j--;
                }

                if (inputStringToList.get(j).equals('(')) {
                    for (int k = i - 1; k > j; k--) {

                        if (counter <= 0) {
                            break;
                        }
                        if (counter > 0) {
                            counter--;
                            temp = inputStringToList.get(k);
                            newValue = inputStringToList.get(k - counter);
                            inputStringToList.set(k, newValue);
                            inputStringToList.set(k - counter, temp);
                            counter--;
                        }
                    }
                    inputStringToList.remove(i);
                    inputStringToList.remove(j);
                    lengthOfTable = inputStringToList.size();
                    i = 0;
                }
            }
        }

        char[] chars = inputStringToList.toString().toCharArray();
        String outputStringWithSignes = String.valueOf(chars);
        String outputString = outputStringWithSignes.replaceAll("\\W", "");
        return outputString;
    }
}
