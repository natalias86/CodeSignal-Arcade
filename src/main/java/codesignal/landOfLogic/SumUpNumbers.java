package codesignal.landOfLogic;

/*CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.
ample

For inputString = "2 apples, 12 oranges", the output should be
sumUpNumbers(inputString) = 14.
*/
public class SumUpNumbers {
  /*  public static void main(String[] args) {
        System.out.println(sumUpNumbers("Your payment method is invalid"));
    }*/

    static int sumUpNumbers(String inputString) {
        int sum = 0;
        StringBuilder temp = new StringBuilder("0");
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                temp = temp.append(inputString.charAt(i));
                if(i==inputString.length()-1)sum += Integer.parseInt(temp.toString());
            } else {
                sum += Integer.parseInt(temp.toString());
                temp = temp.replace(0,temp.length(), "0");
            }
        }
        return sum;
    }
}



