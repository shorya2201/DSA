package Hashing;

public class CountFrequency {
    static int count(int a[], int key) {
        int frequency[] = new int[a.length];
        for (int i = 0; i < frequency.length; i++) {
            frequency[a[i]] += 1;
        }
        return frequency[key];

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 2 };
        // pre compute
        int frequency[] = new int[arr.length];
        for (int i = 0; i < frequency.length; i++) {
            frequency[arr[i]] += 1;
        }
        // fetch
        System.out.println(frequency[4]);
    }
}
