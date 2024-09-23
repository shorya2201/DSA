package Recursion;

public class SumOfNnatural {

    private static int printSum(int n) {
        if (n == 0) {
            return 0;// Base Condition
        }
        // int Snm1 = printSum(n - 1);// Recursive call
        // int Sn = n + Snm1;
        return n + printSum(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(printSum(5));

    }
}
