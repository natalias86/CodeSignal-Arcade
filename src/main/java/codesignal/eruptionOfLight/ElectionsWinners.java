package codesignal.eruptionOfLight;
/* Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.
        The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.
        Example
        For votes = [2, 3, 5, 2] and k = 3, the output should be
        electionsWinners(votes, k) = 2.*/
import java.util.Arrays;

public class ElectionsWinners {
    int electionsWinners(int[] votes, int k) {
        int result = 0;
        int length = votes.length;
        Arrays.sort(votes);
        int max=votes[length-1];

        if(k==0&&votes[length-2]==max){
            return 0;}
        else if(k==0&&votes[length-2]!=max){
            return 1;
        }else {
            for (int g = 0; g < length; g++) {
                if (votes[g] + k > max) {
                    result++;
                }
            }
        }
        return result;
    }
}
