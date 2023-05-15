public class Power_Calculation {
    public static int cal_power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int power_num = n * cal_power(n, p - 1);
        return power_num;
    }
    public static void main(String[] args) {
        int number = 4;
        int power = 3;

        System.out.print(cal_power(number, power));
    }
}