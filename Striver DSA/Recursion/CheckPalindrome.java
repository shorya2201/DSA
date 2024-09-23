package Recursion;

public class CheckPalindrome {

    static boolean check(String str, int left, int right) {
        if (left == right)
            return true;

        if (str.charAt(left) == str.charAt(right)) {
            return check(str, left + 1, right - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(check(s, 0, s.length() - 1));
    }
}
