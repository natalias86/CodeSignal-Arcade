package codesignal.landOfLogic;

import java.util.*;

/*You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example

For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].*/
public class FileNaming {
  /*  public static void main(String[] args) {
        String[] names = {"doc", "doc", "image", "doc(1)", "doc"};
        //String[] names = {"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
        System.out.println(Arrays.toString(fileNaming(names)));
    }
*/
     String[] fileNaming(String[] names) {
        List<String> outputList = new ArrayList<>();
        String temp;
        int counter = 0;

        for (int j = 0; j < names.length; j++) {

            temp = names[j];
            while (outputList.contains(temp)) {
                counter++;
                temp = (names[j] + "(" + counter + ")");
            }
            outputList.add(temp);
            counter = 0;


        }
        String[] arr = new String[outputList.size()];
        for (int i = 0; i < outputList.size(); i++)
            arr[i] = outputList.get(i);

        return arr;
    }
}