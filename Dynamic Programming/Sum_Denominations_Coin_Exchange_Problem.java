public class Sum_Denominations_Coin_Exchange_Problem {
    // minimum number of coins of certain denominations required to make a given sum
    public static int problem_solver(int[] coins, int sum) {

        int[][] ways = new int[coins.length + 1][sum + 1];

        for (int i = 0; i <= coins.length; i++) {
            ways[i][0] = 1;
        }

        for (int i = 0; i <= sum; i++) {
            ways[0][1] = 0;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    ways[i][j] = ways[i - 1][j] + ways[i][j - coins[i - 1]];
                } else {
                    ways[i][j] = ways[i - 1][j];
                }
            }
        }

        return ways[coins.length][sum];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int sum = 45;

        System.out.print("Given Denominations: ");
        for (int i = 0; i < coins.length; i++) {
            System.out.print(coins[i] + " ");
        }

        System.out.print("\nMinimum coins required of given denominations to make a sum of '" + sum + "': " + problem_solver(coins, sum));
    }
}