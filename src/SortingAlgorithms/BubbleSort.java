package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int arr[], int n){
        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {45, 12, 56, 69, 44};
        int n = 5;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}