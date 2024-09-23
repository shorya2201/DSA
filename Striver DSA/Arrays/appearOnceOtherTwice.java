package Arrays;

import java.util.HashMap;

public class appearOnceOtherTwice {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        HashMap<Integer, Integer> hm = new HashMap<>();// creating a hashmap
        int key = 0;
        for (int i = 0; i < arr.length; i++) {
            int freq = hm.getOrDefault(arr[i], 0);// getting the value present at the location of defined index in
                                                  // HashMap
            hm.put(arr[i], freq + 1);// now increasing the value we obtained from above by 1
        }
        for (int i = 1; i < hm.size(); i++) {
            if (hm.get(i) == 1) {// checking which number has frequency 1
                key = i;
                break;
            }
        }
        System.out.println("The Element appearing once is: " + key);
    }
}
