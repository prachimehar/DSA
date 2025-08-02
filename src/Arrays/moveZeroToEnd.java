package Arrays;

import java.util.Arrays;

public class moveZeroToEnd {
    public static void pushAllZerosToEnd(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
            arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,7,0,7,0,0,4,0,77,8};
        pushAllZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
