import java.util.Scanner;

public class Reverse_StringBuilder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter some text to reverse(String-Builder): ");
        String text = input.nextLine();

        StringBuilder text_StringBuilder = new StringBuilder(text);

        for (int i = 0; i < text_StringBuilder.length()/2; i++) {
            int init_index = i;
            int last_index = text_StringBuilder.length() - i - 1;

            char init_char = text_StringBuilder.charAt(init_index);
            char last_char = text_StringBuilder.charAt(last_index);

            text_StringBuilder.setCharAt(init_index, last_char);
            text_StringBuilder.setCharAt(last_index, init_char);
        }

        System.out.print("Reversed String-Builder: " + text_StringBuilder);

        input.close();
    }
}