package Arrays;

/**
 * longestSubarraySumK
 */
public class longestSubarraySumK {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;
        int fin = 0, len = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0, sum = 0;
            for (int j = i; j < arr.length; j++) {
                count++;
                sum += arr[j];
                if (sum == k)
                    len = count;
            }
            fin = Math.max(fin, len);
        }
        System.out.println(fin);
    }
}