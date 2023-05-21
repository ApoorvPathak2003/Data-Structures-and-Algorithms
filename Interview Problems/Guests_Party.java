import java.util.Scanner;

public class Guests_Party{
    public static int ways_cal_guests(int guest_count) {
        if (guest_count < 0) {
            System.out.println("Invalid Guest Count!!");
            return 0;
        }

        if (guest_count == 1 || guest_count == 0) {
            return 1;
        }

        int single = ways_cal_guests(guest_count - 1);
        int pair = (guest_count - 1) * ways_cal_guests(guest_count - 2);

        return single + pair;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people coming to a party: ");
        int guest_count = input.nextInt();

        System.out.print("Total number of ways to call " + guest_count + " guests: " + ways_cal_guests(guest_count));

        input.close();
    }
}