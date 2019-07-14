package codesignal.eruptionOfLight;

/* Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.
        Example
        For st = "abcdc", the output should be
        buildPalindrome(st) = "abcdcba".
*/
public class BuildPalindrome {
    String buildPalindrome(String st) {
        StringBuilder newSt = new StringBuilder(st);
        for (int i = 0; i < newSt.length(); i++) {
            StringBuilder newStRev = new StringBuilder(newSt);
            if (newSt.toString().equals(newStRev.reverse().toString())) {
                break;
            } else {
                newSt.insert(newSt.length() - i, newSt.charAt(i));
            }
        }
        return newSt.toString();
    }
}
