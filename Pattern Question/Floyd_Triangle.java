import java.util.Scanner;

public class Floyd_Triangle{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int n = input.nextInt();

        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        input.close();
    }
}