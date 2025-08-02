package Recursion;

public class palindromeOrNot {
    public static boolean isPalindrome(String s,int start,int end){
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    public static String rev(String s){
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
