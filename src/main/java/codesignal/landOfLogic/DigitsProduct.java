package codesignal.landOfLogic;
/*Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DigitsProduct {

    static int digitsProduct(int product) {
        StringBuilder result = new StringBuilder(0);
        if (product == 0) return 10;
        if (product == 1) {
            return 1;
        } else {
            do {
                if (product % 9 == 0) {
                    product = product / 9;
                    result.append(9);
                } else if (product % 8 == 0) {
                    product = product / 8;
                    result.append(8);
                } else if (product % 7 == 0) {
                    product = product / 7;
                    result.append(7);
                } else if (product % 6 == 0) {
                    product = product / 6;
                    result.append(6);
                } else if (product % 5 == 0) {
                    product = product / 5;
                    result.append(5);
                } else if (product % 4 == 0) {
                    product = product / 4;
                    result.append(4);
                } else if (product % 3 == 0) {
                    product = product / 3;
                    result.append(3);
                } else if (product % 2 == 0) {
                    product = product / 2;
                    result.append(2);
                } else {
                    result.replace(0, result.length(), "-1");
                    product = 1;
                }
            } while (Integer.valueOf(product) != 1);

            String resultSt = result.toString();

            int resultInt = Integer.valueOf(resultSt);

            if (resultInt == -1) {
                return -1;
            } else {
                int len = resultSt.length();

                int[] arr = new int[len];
                for (int i = 0; i < len; i++) {
                    arr[i] = resultInt % 10;
                    resultInt = resultInt / 10;
                }
                Arrays.sort(arr);
                int num = 0;
                for (int i = 0; i < len; i++) {
                    num = (num * 10) + arr[i];
                }


                return num;
            }
        }
    }

}
