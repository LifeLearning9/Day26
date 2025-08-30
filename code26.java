import java.util.*;

class Main {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq1 = new int[256]; 
        int[] freq2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

   
    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        String doubled = s1 + s1;

       
        for (int i = 0; i <= doubled.length() - s2.length(); i++) {
            int j = 0;
            while (j < s2.length() && doubled.charAt(i + j) == s2.charAt(j)) {
                j++;
            }
            if (j == s2.length()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (isAnagram(s1, s2) && isRotation(s1, s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
