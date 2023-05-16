import java.util.Scanner;

public class First_Last_Occurence {
    static int first_presence = -1;
    static int last_presence = -1;

    public static void occurence_check(char element, String string, int index) {
        if(index == string.length()){
            System.out.println("First Index Element Location: " + first_presence);
            System.out.println("Last Index Element Location: " + last_presence);
            return;
        }
        char character = string.charAt(index);
        if(character == element){
            if(first_presence == -1){
                first_presence = index;
            }else{
                last_presence = index;
            }
        }
        occurence_check(element, string, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string in which we will check the element's presence: ");
        String string = input.next();
        System.out.print("Enter the element to check it's presence: ");
        char element = input.next().charAt(0);

        occurence_check(element, string, 0);

        input.close();
    }
}