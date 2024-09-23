package Recursion;

import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearch(int key, int arr[], int start, int end) {
        if (start > end) {
            return -1;// Base condition
        }

        int mid = (start + end) / 2;

        if (arr[mid] == key) {
            return mid; // If key got found
        } else if (key > arr[mid]) {
            return BinarySearch(key, arr, mid + 1, end);// Recursive calls
        } else {
            return BinarySearch(key, arr, start, mid - 1);// Recursive calls
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 5, 8, 9, 15, 18, 19, 20 };
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Please enter a key to search: ");
        int key = sc.nextInt();

        if (BinarySearch(key, arr, start, end) == -1) {
            System.out.println("Key NOT found!!!");
        } else {

            System.out.println("Key is FOUND at index : " + BinarySearch(key, arr, start, end));
        }
    }
}
