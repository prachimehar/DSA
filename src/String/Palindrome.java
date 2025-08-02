package String;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        // by 2 pointer
        boolean isPalindrome = true;
        int i=0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        // by stringBuilder
        StringBuilder reverse= new StringBuilder();
        for (int k = s.length()-1; k >= 0 ; k--) {
            reverse.append(s.charAt(k));
        }
        if(s.equals(reverse.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
