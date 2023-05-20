import java.util.Scanner;

public class Permutation_String {
    public static void print_permutation(String permutation_string, String permutation) {
        if (permutation_string.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < permutation_string.length(); i++) {
            char current_character = permutation_string.charAt(i);
            String new_string = permutation_string.substring(0, i) + permutation_string.substring(i + 1);
            print_permutation(new_string, permutation + current_character);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string for which you wish to get the permutations: ");
        String permutation_string = input.next();

        print_permutation(permutation_string, "");

        input.close();
    }
}