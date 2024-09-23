package Arrays;

/**
 * MooreVotingAlgorithm
 */
public class MooreVotingAlgorithm {

    // BRUTE FORCE: O(N^2) We can solve this problem using brute force of very basic
    // two nested loop approach.

    // BETTER SOLUTION : O(NlogN) + O(N) Using HashMap and incrementing value of
    // each key with each iteration then iterating the map to find the biggest one.

    // OPTIMAL SOLUTION : To solve this in O(n), we use MOORE'S VOTING ALGORITHM.

    // According to this algorithm, we assume that first element is our answer, then
    // we iterate through the array if arr[i]==element, then we increase COUNT by 1.
    // Otherwise we decrease COUNT by 1. If the COUNT<=0, then we assume the next
    // element as our answer & repeat the process till the loop ends.

    // In this way we got our majority element (IF EXISTS) because for majority of
    // an element --> ElementOccurence > arr.length/2 .
    public static void main(String[] args) {
        int arr[] = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int ele = arr[0]; // assuming that this element is our majority element.
        int cnt = 0; // initializing the count

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ele) {// if same element appear count++
                cnt++;
            } else {// if different element then count--
                cnt--;
            }
            if (cnt <= 0) {// if count<=0 then assign assume next element as our answer
                ele = arr[i + 1];
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                cnt1++;
        }
        if (cnt1 > arr.length / 2)
            System.out.println(ele);
        else
            System.out.println(-1);
    }
}