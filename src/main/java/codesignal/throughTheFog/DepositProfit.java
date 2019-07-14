package codesignal.throughTheFog;

/*You have deposited a specific amount of money into your bank account. Each year your balance increases at the same growth rate. With the assumption that you don't make any additional deposits, find out how long it would take for your balance to pass a specific threshold.
 */
public class DepositProfit {
    int depositProfit(int deposit, int rate, int threshold) {
        int counter = 1;

        double depositPlusRate = deposit + deposit * (double) rate / 100;
        while (depositPlusRate < threshold) {
            counter++;
            depositPlusRate += depositPlusRate * (double) rate / 100;
        }

        return counter;
    }
}
