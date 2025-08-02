package String;

public class reverseString3 {

    public static void rev(char[] arr,int i,int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int len = s.length();
        int start = 0;
        for(int end = 0; end <= len; end++){
            if(end == len || arr[end] == ' '){
                rev(arr,start,end-1);
                start = end + 1;
            }

        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));


    }
}
