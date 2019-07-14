package codesignal.divingDeeper;
/*Find the leftmost digit that occurs in a given string.
Example
For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';*/
public class FirstDigit {
    char firstDigit(String inputString) {
        char [] strToArray = inputString.toCharArray();
        char outputChar = 0;
        for (char output : strToArray){
            if(Character.isDigit(output)){
                outputChar = output;
                break;
            }
        }
        return outputChar;}
}
