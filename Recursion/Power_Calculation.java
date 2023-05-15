import java.util.Scanner;

public class Power_Calculation {
    public static int cal_power(int n, int p) {
        if (p == 0 && n == 0) {
            System.out.print("Invalid numbers entered!!");
            return 0;
        }
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
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number(base): ");
        int number = input.nextInt();
        System.out.print("Enter the number(power): ");
        int power = input.nextInt();

        System.out.print('Result: ' + cal_power(number, power));

        input.close();
    }
}
