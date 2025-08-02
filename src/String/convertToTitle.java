package String;

public class convertToTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (((columnNumber) % 26) + 'A'));
            columnNumber = (columnNumber) / 26;
        }

        String s = ans.reverse().toString();
        System.out.println(s);
    }
}
