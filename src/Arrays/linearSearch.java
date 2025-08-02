package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 5;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                ans = i;
            }
        }
        System.out.println(ans);

    }
}
