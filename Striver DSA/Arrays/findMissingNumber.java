package Arrays;

import java.util.HashMap;

public class findMissingNumber {
    // Find missing number
    public static void main(String[] args) {
        int n = 5;// size of array
        int arr[] = { 1, 2, 4, 5 };// given array

        // Hashing(Pre-Computing)
        int frequency[] = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            frequency[arr[i]] += 1;
        }
        // identifying missing element
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] == 0)
                System.out.println(i);
        }

    }
}
