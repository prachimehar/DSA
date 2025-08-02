package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithKUnique {

    public static int getLongestSubstringWithKUnique(String s, int k) {
        int maxLen = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            Set<Character> uniqueChars = new HashSet<>();
            StringBuilder current = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                current.append(ch);
                uniqueChars.add(ch);

                if (uniqueChars.size() > k) break;

                if (uniqueChars.size() == k && current.length() > maxLen) {
                    maxLen = current.length();
                    longest = current.toString();
                }
            }
        }

        return longest.length();
    }
    public static int longestSubstrings(String s, int k) {
        // by sliding window
        int i = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char endChar = s.charAt(j);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            // Shrink the window if we exceed k distinct characters
            while (map.size() > k) {
                char startChar = s.charAt(i);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                i++; // slide window from left
            }

            // Update max length when window is valid
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
    public static int longestSubstring(String s, int k) {
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.clear();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size() <= k){
                    max = Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aabaaab";
        int k = 2;
        int result = getLongestSubstringWithKUnique(s, k);
        System.out.println("Longest substring with " + k + " unique characters: " + result);
        System.out.println("Longest substring with " + k + " unique characters: " + longestSubstring(s,k));
        System.out.println("by sliding window :"+ longestSubstrings(s,k));

    }


}
