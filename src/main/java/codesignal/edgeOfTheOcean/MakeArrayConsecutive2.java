
/*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.*/

package codesignal.edgeOfTheOcean;

public class MakeArrayConsecutive2 {

    int makeArrayConsecutive2(int[] statues) {
        int z;
        do {
            z = 0;
            for (int i = 1; i < statues.length; i++) {
                if (statues[i - 1] > statues[i]) {
                    int pom = statues[i - 1];
                    statues[i - 1] = statues[i];
                    statues[i] = pom;
                    z = 1;

                }
            }
        }
        while (z == 1);

        int licznik = 0;
        for (int k = 1; k < statues.length; k++) {
            int y = 0;

            while (statues[k] - statues[k - 1] - y > 1) {

                y++;
            }
            licznik += y;
        }
        return licznik;
    }

}
