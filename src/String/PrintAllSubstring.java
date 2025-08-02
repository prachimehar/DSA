package String;

public class PrintAllSubstring {
    public static void allSubstrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length() ; j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static int allSubstring(String s){
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length() ; j++) {
                String sh = s.substring(i,j);
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String s  = "abc";
        allSubstrings(s);
        System.out.println(allSubstring(s));

    }
}
