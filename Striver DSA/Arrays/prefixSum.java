package Arrays;

import java.util.*;

public class prefixSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        int k = 3;
        int len = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int prefixSum = 0;

            for (int j = i; j < arr.length; j++) {
                prefixSum += arr[j];
                if (prefixSum != k) {
                    hm.put(prefixSum, i);
                } else {
                    if (hm.containsKey(prefixSum - k)) {
                        len = Math.max(len, hm.get(prefixSum - k));
                    }
                }
            }
        }
        System.out.println(len);
    }
}
