package Arrays;

import java.util.Arrays;

import static java.util.Collections.swap;

public class leftRotationByKPlaces {
    public static void leftRotationByK(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        rev(arr,0,k-1);
        rev(arr, k,n-1);
        rev(arr,0,n-1);

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
    public static void leftRotation(int[] arr,int k){
        // tc - o(n*k) tc - o(1)
        k = k % arr.length;
        for (int i = 0; i <k; i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length ; j++) {
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
    }
    public static int[] rotateLeftBruteForce(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[n];
        d=d%n;

        // Copy from d to end
        int index = 0;
        for (int i = d; i < n; i++) {
            temp[index++] = arr[i];
        }

        // Copy from 0 to d-1
        for (int i = 0; i < d; i++) {
            temp[index++] = arr[i];
        }

        return temp;
    }
    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[n];
        d=d%n;

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i+d)%n];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();
        int[] arr4 = arr1.clone();

        leftRotation(arr1, 7); // O(n*k)
        System.out.println("O(n*k) brute force:     " + Arrays.toString(arr1));

        int[] ans = rotateLeftBruteForce(arr2, 7); // O(n) extra space
        System.out.println("Brute force with temp:  " + Arrays.toString(ans));

        leftRotationByK(arr3, 7); // Optimal reverse algorithm
        System.out.println("Optimal reverse algo:   " + Arrays.toString(arr3));

        int[] temp = rotateLeft(arr4,7);
        System.out.println("by modulo log :   " + Arrays.toString(temp));

    }
}
