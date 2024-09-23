package Hashing;

public class CountCharacter {
    public static void main(String[] args) {
        String s = "malayalam";
        // pre-compute
        int frequency[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
            frequency[(int) (s.charAt(i))] += 1;
        }
        // fetch
        System.out.println(frequency['m']);
    }
}
