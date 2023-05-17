import java.util.Scanner;

public class Remove_Duplicate_Element {
    static boolean[] char_map = new boolean[26];
    public static void duplicate_remove(String remove_duplicate, int index, String no_duplicate_string) {
        if (index == remove_duplicate.length()) {
            System.out.print("String with NO duplicate character: " + no_duplicate_string);
            return;
        }
        char current_character = remove_duplicate.charAt(index);
        if (char_map[current_character - 'a'] == true) {
            duplicate_remove(remove_duplicate, index + 1, no_duplicate_string);
        }else{
            no_duplicate_string += current_character;
            char_map[current_character - 'a'] = true;
            duplicate_remove(remove_duplicate, index + 1, no_duplicate_string);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string to remove the duplicate elements: ");
        String remove_duplicate = input.nextLine();

        duplicate_remove(remove_duplicate, 0, "");

        input.close();
    }
}