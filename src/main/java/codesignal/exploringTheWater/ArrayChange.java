package codesignal.exploringTheWater;
/*4
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
Example:
For inputArray = [1, 1, 1], the output should be
arrayChange(inputArray) = 3.*/
public class ArrayChange {

    int arrayChange(int[] inputArray) {
        int counter =0;
        int iterator;

        for (int i=1; i<inputArray.length; i++){
            iterator=0;
            while(inputArray[i-1]>=(inputArray[i]+iterator)){
                counter++;
                iterator++;
            }
            inputArray[i] =inputArray[i]+iterator;
        }
        return counter;
    }
}
