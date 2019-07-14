package codesignal.divingDeeper;

/* Given array of integers, find the maximal possible sum of some of its k consecutive elements.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMaxConsecutiveSum {
    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        List<Integer> tempList = new ArrayList<>();
        int sum=0;

        for (int i =0; i<k ;i++) {
            sum+= inputArray[i];}
        tempList.add(sum);
        int a=k;
        while ( a <inputArray.length){
            sum=sum+inputArray[a]-inputArray[a-k];
            tempList.add(sum);
            a++;
        }
        return Collections.max(tempList);
    }
}
