package String;

import java.util.ArrayList;
import java.util.List;

public class validPallindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        // Step 1: Convert to lowercase
        String ans = s.toLowerCase();

        // Step 2: Remove non-alphanumeric characters
        StringBuilder sb = new StringBuilder();
        for (char ch : ans.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        String reversed = sb.reverse().toString();
        String original = sb.reverse().toString();
        System.out.println(original.equals(reversed));

        System.out.println(original);

    }
}
