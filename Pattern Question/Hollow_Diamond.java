import java.util.Scanner;

public class Hollow_Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            if(i == 0){
                System.out.println("*");
            }else{
                System.out.print("*");
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        input.close();
    }
}