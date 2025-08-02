package Arrays;

import java.util.Arrays;

public class rightRotationByKPlaces {
    public static void rightRotationByK(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        rev(arr,0,n-1);
        rev(arr, 0,k-1);
        rev(arr,k,n-1);

    }
    public static void rev(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rightRotationByBruteForce(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i+k)%n] = arr[i];
        }
        return temp;
    }

    public static void rightRotationByBrute(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0]= temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};



        rightRotationByK(arr,2);
        System.out.println(Arrays.toString(arr));
        int[] temp = rightRotationByBruteForce(arr2,2);
        System.out.println(Arrays.toString(temp));
        rightRotationByBrute(arr3,2);
        System.out.println(Arrays.toString(arr3));


    }
}
