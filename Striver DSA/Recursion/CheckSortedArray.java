package Recursion;

public class CheckSortedArray {

    private static boolean checkSortedArray(int[] arr, int i) {
        if (i >= arr.length - 1) {
            return true;// base condition
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return checkSortedArray(arr, i + 1);// recursive call
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        boolean sorted = checkSortedArray(arr, 0);
        System.out.println(sorted);
    }
}
