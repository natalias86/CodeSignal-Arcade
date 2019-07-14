package codesignal.landOfLogic;
/*Check if the given string is a correct time representation of the 24-hour clock.
Example
For time = "13:58", the output should be
validTime(time) = true;
For time = "25:51", the output should be
validTime(time) = false;
For time = "02:76", the output should be
validTime(time) = false.*/

import java.util.regex.Pattern;

public class ValidTime{

  /*  public static void main(String[] args) {
        System.out.println(validTime("19:58"));
    }*/
       static boolean validTime(String time) {
return (Pattern.matches("([0-1][0-9]|[2][0-3])\\:[0-5][0-9]", time));
        }
}
