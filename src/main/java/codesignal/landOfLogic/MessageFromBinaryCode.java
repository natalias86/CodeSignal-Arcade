package codesignal.landOfLogic;

/*You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue, you've found a binary code written on the wall behind a vase, and realized that it must be an encrypted message. After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended ASCII code.
Assuming that your hunch is correct, decode the message.
Example
For code = "010010000110010101101100011011000110111100100001", the output should be
messageFromBinaryCode(code) = "Hello!".*/

public class MessageFromBinaryCode {
    String messageFromBinaryCode(String code) {

        String[] arr = new String[code.length() / 8];
        int index = 0;
        for (int i = 0; i < code.length() - 7; i += 8) {
            arr[index] = code.substring(i, i + 8);
            index++;
        }
        char temp;
        char[] outputArray = new char[arr.length];
        for (int j = 0; j < arr.length; j++) {
            outputArray[j] = (char) Integer.parseInt(arr[j], 2);
        }

        return String.copyValueOf(outputArray);
    }
}
