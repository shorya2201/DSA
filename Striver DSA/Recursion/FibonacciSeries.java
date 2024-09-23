package Recursion;

public class FibonacciSeries {

    public static void printSeries(int n, int i, int a, int b) {
        if (i == n) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printSeries(n, i + 1, b, c);
    }

    public static void main(String[] args) {
        // int a = 0;
        // int b = 1;
        // int n = 7;
        // int i = 1;
        // System.out.print("The series is : ");
        // printSeries(n, i, a, b);
        System.out.println(fab(7));
    }

    public static int fab(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fab(n - 1) + fab(n - 2);
    }
}
