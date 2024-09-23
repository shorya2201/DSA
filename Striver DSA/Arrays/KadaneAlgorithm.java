package Arrays;

public class KadaneAlgorithm {

    // We can solve this problem using very Brute Force Solution of Two nested loops

    // OPTIMAL: To acheive TC of O(n), we use Kadane algorithm

    // Acc to this algo, if the sum becomes sum<0, then make sum=0. Otherwise keep
    // adding to the sum and storing maximum of sum and max with each iteration.

    // If also want to print the array of maximum sum, then take two variable as
    // START & END.
    // Assign START with i, whenever the sum is 0.
    // Assign END with the index whenever the max variable changes.

    // Then use another for loop to print using START & END indexes.

    // Using this same approach, we can also solve Largest Subarray of Sum equals K
    // & Smallest Subarray of Sum equals K.
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0)
                sum = 0;
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
