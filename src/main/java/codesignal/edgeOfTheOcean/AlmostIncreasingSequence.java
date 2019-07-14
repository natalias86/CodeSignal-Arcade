/*Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].*/

package codesignal.edgeOfTheOcean;

public class AlmostIncreasingSequence {
    boolean almostIncreasingSequence(int[] sequence) {

        int lengthOfSequence = sequence.length;
        int a = -1;
        int c = 0;

        for (int i = 1; i < lengthOfSequence; i++)
            if (sequence[i-1]>=sequence[i]){
                a=i;
                c++;
            }

        if (c > 1) return false;
        if (c == 0) return true;
        if (a == lengthOfSequence-1 || a == 1) return true;
        if (sequence[a-1] < sequence[a+1]) return true;
        if (sequence[a-2] < sequence[a]) return true;
        return false;

    }

}
