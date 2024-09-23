package Recursion;

public class Factorial {

    public static int calcFact(int n) {
        if (n == 1 || n == 0) {
            return 1; // Base COndition
        }

        // int fact_nm1 = calcFact(n - 1);// Recursive call (calculates fact(4))
        // int fact = n * fact_nm1;// multiply 5 with fact(4)

        return n * calcFact(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(calcFact(n));// Function call
    }
}
