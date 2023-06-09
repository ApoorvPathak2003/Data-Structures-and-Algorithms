import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int element = 1;

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(element + " ");
                element = element * (i - k) / k;
            }
            
            System.out.println();
        }

        input.close();
    }    
}