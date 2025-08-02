package String;

public class ToggleEachChar {
    public static void main(String[] args) {
        String s = "PrAchiMehAr";
        String sh = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                sh = sh + Character.toLowerCase(s.charAt(i));
            }
            else{
                sh = sh + Character.toUpperCase(s.charAt(i));
            }
        }
    }
}

