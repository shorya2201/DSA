package Arrays;

public class DNFdutchNationalFlagAlgo {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        // This question can be solved using brute force method very easily.
        // But we can use Dutch National Flag (DNF) Algorithm to sort it in O(n)
        // Time Complexity.
        // Acc to DNF algorithm, we create 3 pointers i.e. LOW, MID & HIGH.
        // We assume that from 0 --> LOW-1 contains only 0's.
        // From LOW --> MID-1 contains only 1's.
        // From HIGH + 1 --> N-1 contains only 2's.

        // And from MID --> HIGH this area contains unsorted numbers.

        // Therefore we iterate through the array, mark the LOW , MID & HIGH with
        // desired indexes.
        // If arr[mid]==0 we swap value of mid and low indexes and increment values of
        // LOW & MID
        // If arr[mid]==1 we dont do anything just increment the MID
        // And elsewise we swap values of MID & HIGH and decrement HIGH.

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[mid]; // swapping
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp1;
                    high--;
                    break;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}
