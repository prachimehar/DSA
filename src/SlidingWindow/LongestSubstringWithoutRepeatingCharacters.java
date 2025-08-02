package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(map.get(ch) + 1, left);
            }

            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static int lengthOfLongestSubstringWithoutRepeating(String s) {
        int n = s.length();
        int l = 0, r = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (r < n) {
            char ch = s.charAt(r);
            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;

    }
    public static void main(String[] args) {
        String s = "aabbaaab";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringWithoutRepeating(s));


    }
}
