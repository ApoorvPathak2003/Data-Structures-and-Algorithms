import java.util.Scanner;

public class Alternate_0_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print('1');
                }else{
                    System.out.print('0');
                }
            }
            System.out.println();
        }

        input.close();
    }
}