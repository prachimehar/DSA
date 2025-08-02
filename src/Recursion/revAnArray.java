package Recursion;

import java.util.Arrays;

public class revAnArray {
    public static void rev(int[] arr,int s,int e){
        if(s==e){
            return;
        }
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;

        rev(arr,s+1,e-1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
