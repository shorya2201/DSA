
package Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 11 };
        int key = 14;// the sum to be find
        boolean flag = false; // indicate wheather the element is found or not
        int left = 0; // starts from 0th index
        int right = arr.length - 1; // starts from last index
        // The whole idea is to first sort the array if we have unsorted array, then we
        // calculate sum , if the sum is smaller than target then we increase the left
        // pointer & if the sum is greater than the target then we decrease the right
        // pointer . This approach works in all cases of sorted array.
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[left] + arr[right];
            if (sum == key)
                flag = true;
            if (sum < key)
                left++;
            if (sum > key)
                right--;
        }
        System.out.println(flag);
    }
}