package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PickToys {
    public static int pickToys(String s) {
        int i = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char endChar = s.charAt(j);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            // Shrink the window if we exceed k distinct characters
            while (map.size() > 2) {
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
    public static void main(String[] args) {
        String s = "aabbaccaacb";
        System.out.println(pickToys(s));
    }
}
