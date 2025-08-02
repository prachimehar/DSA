package String;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        String s = "madam sir";
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        System.out.println("Original string: " + s);
        System.out.println("After removing duplicates: " + result.toString());

    }
}
