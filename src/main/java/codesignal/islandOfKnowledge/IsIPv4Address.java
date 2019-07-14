package codesignal.islandOfKnowledge;
/*An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses
the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses.
One of them is the IPv4 address.
IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255 inclusive,
separated by dots, e.g., 172.16.254.1.
Given a string, find out if it satisfies the IPv4 address naming rules.
Example
For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;*/

import java.util.regex.Pattern;

public class IsIPv4Address {
    boolean isIPv4Address(String inputString) {
        return Pattern.matches("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)", inputString);
    }
}
