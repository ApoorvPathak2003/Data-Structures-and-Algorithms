package BackTracking;

import java.util.Scanner;

public class All_Permutations {
    public static void print_all_permutations(String string_permutation, String permutated_string, int index) {
        if (string_permutation.length() == 0) {
            System.out.println(permutated_string);
            return;
        }

        for (int i = 0; i < string_permutation.length(); i++) {
            char current_character = string_permutation.charAt(i);
            String new_string = string_permutation.substring(0, i) + string_permutation.substring(i + 1);
            print_all_permutations(new_string, permutated_string + current_character, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string to print all its permutations: ");
        String string_permutation = input.next();
        
        System.out.println("All permutations of the input string are: ");
        print_all_permutations(string_permutation, "", 0);

        input.close();
    }
}