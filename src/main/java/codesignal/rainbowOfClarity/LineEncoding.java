package codesignal.rainbowOfClarity;

/* Given a string, return its encoding defined as follows:
First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
Example
For s = "aabbbc", the output should be
lineEncoding(s) = "2a3bc".*/
public class LineEncoding {
    String lineEncoding(String s) {
        int counter = 0;
        char comparatorChar = s.charAt(0);

        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == comparatorChar) {
                counter++;
            } else {
                if (counter > 1) {
                    outputString.append(Integer.toString(counter) + comparatorChar);
                } else {
                    outputString.append(comparatorChar);
                }
                comparatorChar = s.charAt(i);
                counter = 1;
            }
        }
        if (counter > 1) {
            outputString.append(Integer.toString(counter) + comparatorChar);
        } else {
            outputString.append(comparatorChar);
        }
        return outputString.toString();
    }
}
