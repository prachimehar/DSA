package String;

public class replaceCharWithAnotherChar {
    public static void main(String[] args) {
        String s = "prachimehar";
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if(ch != 'a'){
                sb.append(ch);
            }
            else{
                sb.append('A');
            }
        }
        System.out.println(sb.toString());


    }
}
