package String;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Prachi Mehar";
        s = s.toLowerCase();
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);

    }
}
