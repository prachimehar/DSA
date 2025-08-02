package String;

import java.util.Arrays;

public class CheckTwoStringsAnagramsOrNot {
    public static boolean isAnagramOrNot(String s, String t) {
        int[] freq = new int[26];
        int[] freq2 = new int[26];

        if (s.length() != t.length()) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            freq[ch - 97]++;
        }
        for (char ch : t.toCharArray()) {
            freq2[ch - 97]++;
        }
        if (Arrays.equals(freq, freq2)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isAnagram(String s1,String s2) {
        if(s1.length() != s2.length()) return false;

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1,str2);
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1,s2));
        System.out.println(isAnagramOrNot(s1,s2));
    }
}
