public class Minimum_Coins {
    public static int minimum_coins(int[] coins, int sum) {
        if (sum <= 0) {
            return 0;
        }

        int[] solution = new int[sum + 1];

        for (int i = 1; i <= sum; i++) {
            solution[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if ((coins[j] <= i) && (solution[i - coins[j]] != Integer.MAX_VALUE)) {
                    solution[i] = Math.min(solution[i], 1 + solution[i - coins[j]]);
                }
            }
        }

        if (solution[sum] == Integer.MAX_VALUE) {
            return -1;
        }

        return solution[sum];
    }
    public static void main(String[] args) {
        int[] coins = {1, 5, 9};
        int sum = 51;

        System.out.print("Given Denominations: ");
        for (int i = 0; i < coins.length; i++) {
            System.out.print(coins[i] + " ");
        }

        System.out.print("\nMinimum number of coins required of the given denominations to make a sum of '" + sum + "': " + minimum_coins(coins, sum));
    }
}
