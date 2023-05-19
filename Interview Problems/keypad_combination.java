import java.util.Scanner;

public class keypad_combination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void keypad_Comb(String keypad_input, int index, String combination) {
        if (index == keypad_input.length()) {
            System.out.println("Combination of the keypad letters: " + combination);
            return;
        }

        char current_character = keypad_input.charAt(index);
        String map = keypad[current_character - '0'];

        for (int i = 0; i < map.length(); i++) {
            keypad_Comb(keypad_input, index + 1, combination + map.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to get the keypad combination: ");
        String keypad_input = input.next();

        keypad_Comb(keypad_input, 0, "");

        input.close();
    }
}