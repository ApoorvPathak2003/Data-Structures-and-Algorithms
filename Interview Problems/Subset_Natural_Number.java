import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Natural_Number {
    public static void subset_n_natural_number(int n_natural_number, ArrayList<Integer> subset) {
        if (n_natural_number == 0) {
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;
        }

        subset.add(n_natural_number);
        subset_n_natural_number(n_natural_number - 1, subset);
        
        subset.remove(subset.size() - 1);
        subset_n_natural_number(n_natural_number - 1, subset);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> subset = new ArrayList<>();

        System.out.print("Enter the count of natural numbers to print all it's subsets: ");
        int n_natural_number = input.nextInt();

        subset_n_natural_number(n_natural_number, subset);

        input.close();
    }
}