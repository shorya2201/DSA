package Arrays;

public class rotateArray {
    // left rotate arrray by 'd' places
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;
        // d=d%arr.length; Means if d id given 20 then 20%7=6, therefore we have to
        // rotate array by 6 places.
        int temp[] = new int[d];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        for (int j = d; j < arr.length; j++) {
            arr[j - d] = arr[j];
        }

        int i = 0;
        for (int j = (arr.length - d); j < arr.length; j++) {
            arr[j] = temp[i];
            i++;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
