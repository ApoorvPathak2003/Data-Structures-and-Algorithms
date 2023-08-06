public class Minimum_Coins {
    public static int minimum_coins(int[] coins, int sum) {
        int[][] solution = new int[coins.length + 1][sum + 1];

        for (int i = 0; i <= coins.length; i++) {
            solution[i][0] = 0;
        }

        for (int i = 0; i <= sum; i++) {
            solution[0][i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] > j) {
                    solution[i][j] = solution[i - 1][j];
                } else {
                    solution[i][j] = min(solution[i - 1][j], 1 + solution[i][j - coins[i - 1]]);
                }
            }
        }

        return solution[coins.length][sum];
    }
    public static int min(int x, int y) {
        if (x >= y) {
            return y;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10};
        int sum = 48;

        System.out.print("Given Denominations: ");
        for (int i = 0; i < coins.length; i++) {
            System.out.print(coins[i] + " ");
        }

        System.out.print("\nMinimum number of coins required of the given denominations to make a sum of '" + sum + "': " + minimum_coins(coins, sum));
    }
}