package SlidingWindow;

import java.util.Arrays;

public class countOccurrenceOfAnagram {
    public static int search(String pat, String txt) {
        int c = 0;
        int k = pat.length();
        int patFreq[] = new int[26];

        for(int i=0; i<k; i++){
            int index = pat.charAt(i)-97;
            patFreq[index]++;
        }
        int txtFreq[] = new int[26];
        for(int i=0; i<k; i++){
            int index = txt.charAt(i)-97;
            txtFreq[index]++;
        }
        if(Arrays.equals(txtFreq,patFreq)){
            c++;
        }
        int n = txt.length();
        for(int i=1; i<n-k+1; i++){
            int remove = txt.charAt(i-1)-97;
            int add = txt.charAt(i+k-1)-97;
            txtFreq[add]++;
            txtFreq[remove]--;

            if(Arrays.equals(txtFreq,patFreq)){
                c++;
            }

        }
        return c;
    }
    public static void main(String[] args) {
        String pat= "for";
        String txt = "forxxorfxdofr";
        System.out.println(search(pat,txt));

    }
}
