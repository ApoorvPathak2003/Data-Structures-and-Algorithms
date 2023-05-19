import java.util.HashSet;
import java.util.Scanner;

public class Unique_Subsequences {
    public static void unique_subsequences(String check_string_subsequences, int index, String subsequence_string, HashSet<String> hash_set) {
        if (index == check_string_subsequences.length()) {
            if (hash_set.contains(subsequence_string)) {
                return;
            }else{
                hash_set.add(subsequence_string);
                System.out.println(subsequence_string);
                return;
            }
        }
        char current_character = check_string_subsequences.charAt(index);
        unique_subsequences(check_string_subsequences, index + 1, subsequence_string + current_character, hash_set);
        unique_subsequences(check_string_subsequences, index + 1, subsequence_string, hash_set);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<String> hash_set = new HashSet<>();

        System.out.print("Enter the string to check for the subsequences: ");
        String check_string_subsequences = input.next();

        unique_subsequences(check_string_subsequences, 0, "", hash_set);

        input.close();
    }
}