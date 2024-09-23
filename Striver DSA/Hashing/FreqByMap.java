package Hashing;

import java.util.*;

public class FreqByMap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 3, 2 };
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            frequency.put(arr[i], frequency.get(arr[i]) + 1);
        }

        System.out.println(frequency.get(2));
    }
}
