import java.util.Scanner;

public class Subsequences_String {
    public static void subsequences(String check_string_subsequences, int index, String subsequence_string) {
        if (index == check_string_subsequences.length()) {
            System.out.println(subsequence_string);
            return;
        }
        char current_character = check_string_subsequences.charAt(index);
        subsequences(check_string_subsequences, index + 1, subsequence_string + current_character);
        subsequences(check_string_subsequences, index + 1, subsequence_string);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string to check for the subsequences: ");
        String check_string_subsequences = input.next();

        subsequences(check_string_subsequences, 0, "");

        input.close();
    }
}