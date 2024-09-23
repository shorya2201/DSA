package Recursion;

import java.util.*;

public class FirstLastOccurence {

    private static int first = -1;
    private static int last = -1;

    private static void occurence(String str, int key, int i) {

        char currChar = str.charAt(i);

        if (i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (currChar == key) {
            if (first < 0) {
                first = i;
            } else {
                last = i;
            }
        }
        occurence(str, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
