package String;

import java.util.Arrays;

public class StringReverse {
    public static String reverse(String s) {
        if (s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "Prachi mehar";
        // by recursion
        System.out.println(reverse(s));

        // by string builder
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);

        //by rev
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);

        // converting to char[] then using 2 pointer
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length-1;
        while(i <= j){
            char t = ch[i];
            ch[i] = ch[j];
            ch[j] = t;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(ch));
        String cha = new String(ch);
        System.out.println(cha);

        StringBuilder ans = new StringBuilder(s);
        int n = s.length();
        for (int k = 0; k < n/2; k++) {
            char first = ans.charAt(k);
            char second = ans.charAt(n-1-k);
            ans.setCharAt(k,second);
            ans.setCharAt(n-1-k,first);
        }
        System.out.println(ans);
    }
}
