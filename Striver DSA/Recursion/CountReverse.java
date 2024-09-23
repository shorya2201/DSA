package Recursion;

/**
 * CountReverse
 */
public class CountReverse {

    public static void printReverse(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(end);
        printReverse(start, end - 1);
    }

    public static void main(String[] args) {
        int s = 1;
        int e = 5;
        printReverse(s, e);
    }
}