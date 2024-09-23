package Arrays;

public class secondLargestSmallest {

    // SECOND LARGEST OR SMALLEST IN THE ARRAY WITHOUT SORTING
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int l = arr[0];
        int sl = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sl && arr[i] < l) {
                sl = arr[i];
            }
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            }
        }
        System.out.println(l + " " + sl);
    }
}
