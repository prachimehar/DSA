package String;

public class removeSpace {
    public static void main(String[] args) {
        String s = "Pra chi Me har";
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(ch != ' '){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

        //by using replace
        String st = s.replace(" ","");
        System.out.println(st);



    }
}
