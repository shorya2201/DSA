package Recursion;

public class FirstOccurenceInArr {

    private static int checkOccurence(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;// base condition
        }

        if (arr[i] == key) {
            return i;
        }

        return checkOccurence(arr, i + 1, key);// recursive call

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 6, 9, 7, 5, 8, 5 };
        System.out.println(checkOccurence(arr, 0, 5));

    }
}
