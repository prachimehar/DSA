package String;

public class removeSpecialChar {
    public static void main(String[] args) {
        String s = "Prachi@34#$%$%mehar%";

        System.out.println(s.replaceAll("[^a-zA-Z]",""));

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <='z')){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
