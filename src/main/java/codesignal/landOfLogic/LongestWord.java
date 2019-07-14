package codesignal.landOfLogic;

import java.util.Arrays;

/*1 Define a word as a sequence of consecutive English letters. Find the longest word from the given string.
Example
For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".*/
public class LongestWord {
/*    public static void main(String[] args) {
        System.out.println(longestWord("Ready, steady, go!"));
    }*/
    static String longestWord(String text) {
        String[] textArray = text.split("[^a-zA-Z]");
        int lengthOfWord = 0;
        int index = 0;

    for (int i = 0; i < textArray.length; i++) {
            if (lengthOfWord < textArray[i].length()) {
                lengthOfWord = textArray[i].length();
                index = i;
            }
        }
        return textArray[index];
    }
}
