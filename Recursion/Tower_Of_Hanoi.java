import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void tower_hanoi(int n, String src, String helper, String dest) {
        if(n == 1){
            System.out.println("Transfering disk " + n + " from " + src + " to " + dest);
            return;
        }
        tower_hanoi(n - 1, src, dest, helper);
        System.out.println("Transfering disk " + n + " from " + src + " to " + dest);
        tower_hanoi(n - 1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the count of disks in the Tower of Hanoi: ");
        int disk_count = input.nextInt();
        tower_hanoi(disk_count, "Source(S1)", "Helper(H1)", "Destination(D1)");

        input.close();
    }
}