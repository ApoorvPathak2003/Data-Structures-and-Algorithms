import java.util.Scanner;

public class Strictly_Increasing_Array {
    public static void strict_increase(int[] check_array, int index) {
        if (index == check_array.length - 1) {
            System.out.print("Array is strictly increasing.");
            return;
        }
        if(check_array[index + 1] > check_array[index]){
            strict_increase(check_array, index + 1);
        }else{
            System.out.print("Array is NOT strictly increasing.");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array for which strict increasing pattern has to be checked: ");
        int size = input.nextInt();

        int[] check_array = new int[size];

        System.out.println("Enter the array for which we have to check strictly increasing: ");

        for (int i = 0; i < size; i++) {
            check_array[i] = input.nextInt();
        }

        strict_increase(check_array, 0);

        input.close();
    }
}