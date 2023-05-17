import java.util.Scanner;

public class Move_Element_End {
    public static void move_last(char move_element, String string, String new_string, int count, int index) {
        // String new_string = "";
        if(index == string.length()){
            for (int i = 0; i < count; i++) {
                new_string += move_element;
            }
            System.out.print("New String: " + new_string);
            return;
        }
        
        char current_char = string.charAt(index);
        if(current_char == move_element){
            count++;
            move_last(move_element, string, new_string, count, index + 1);
        }else{
            new_string += current_char;
            move_last(move_element, string, new_string, count, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the element to be moved to the end: ");
        char move_element = input.next().charAt(0);
        
        System.out.print("Enter the string to move the '" + move_element + "' element to the last: ");
        String string = input.next();

        move_last(move_element, string, "", 0, 0);

        input.close();
    }
}