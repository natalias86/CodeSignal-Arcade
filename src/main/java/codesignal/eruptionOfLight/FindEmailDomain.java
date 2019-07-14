package codesignal.eruptionOfLight;
/* Given a valid email address, find its domain part.
        Example
        For address = "prettyandsimple@example.com", the output should be
        findEmailDomain(address) = "example.com";*/

public class FindEmailDomain {

    String findEmailDomain(String address) {
        int index = 0;

        for (int i = address.length() - 1; i > 0; i--) {
            if (address.charAt(i) == '@') {
                index = i + 1;
                break;
            }
        }
        return address.substring(index);
    }
}
