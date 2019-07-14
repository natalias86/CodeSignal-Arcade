/*Given the string, check if it is a palindrome.
Example
For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.*/

package codesignal.theJourneyBegins;

public class CheckPalindrome {

    boolean checkPalindrome(String inputString) {
        if (inputString.equals(new StringBuffer(inputString).reverse().toString())){
            return true;
        }
        return false;
    }
}
