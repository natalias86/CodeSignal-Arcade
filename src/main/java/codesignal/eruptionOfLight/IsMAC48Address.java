package codesignal.eruptionOfLight;

import java.util.regex.Pattern;

/* A media access control address (MAC address) is a unique identifier assigned to network interfaces for communications on the physical network segment.
The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).
Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.
Example
For inputString = "00-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = true;
For inputString = "Z1-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = false;*/
public class IsMAC48Address {
    boolean isMAC48Address(String inputString) {
        return Pattern.matches("(([0-9][A-F]|[A-F][0-9]|[0-9][0-9]|[A-F][A-F])\\-){5}([0-9][A-F]|[A-F][0-9]|[0-9][0-9]|[A-F][A-F])", inputString);
    }
}
