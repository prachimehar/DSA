package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {45, 12, 56, 69, 44};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int arr[], int s, int e) {
        if (s >= e) return;
        int m = s + (e - s) / 2;
        divide(arr, s, m);
        divide(arr, m + 1, e);
        merge(arr, s, m, e);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int ans[] = new int[high - low + 1];
        int left = low, right = mid + 1, i = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                ans[i++] = arr[left++];
            } else {
                ans[i++] = arr[right++];
            }
        }
        while (
                left <= mid) {
            ans[i++] = arr[left++];
        }
        while (
                right <= high) {
            ans[i++] = arr[right++];
        }
        int k = low;
        for (int j = 0; j < ans.length; j++) {
            arr[k++] = ans[j];
        }

    }
}
