package String;

public class longestWord {
    public static void main(String[] args) {
        String s = "Go to settings to activate windows";
        String[] words = s.split(" ");
        String longest = "";
        for (String w : words) {
            if(w.length() > longest.length()){
                longest = w;
            }
        }
        System.out.println(longest);
    }
}
