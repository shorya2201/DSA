package Recursion;

public class ReverseArray {
    static void reverse(int left, int right, int arr[]) {
        if (left == right) {
            printArr(arr, 0);
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(left + 1, right - 1, arr);
    }

    static void printArr(int arr[], int start) {
        if (start >= arr.length)
            return;
        System.out.print(arr[start] + " ");
        printArr(arr, start + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 1 };
        reverse(0, arr.length - 1, arr);
    }
}
