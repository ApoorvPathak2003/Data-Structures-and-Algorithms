public class Fibonacci_Series {
    public static void fibbonaci_series(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");

        fibbonaci_series(b, c, n - 1);
    }
    public static void main(String[] args) {
        int first_num = 0;
        int second_num = 1;
        int n = 10;
        
        System.out.print(first_num + " " + second_num + " ");

        fibbonaci_series(first_num, second_num, n);
    }
}