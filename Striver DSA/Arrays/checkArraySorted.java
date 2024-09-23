package Arrays;

public class checkArraySorted {
    // check if array is sorted
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 76, 7, 8, 9 };
        boolean indicate = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1])
                continue;
            else
                indicate = false;

        }

        System.out.println(indicate);

    }
}