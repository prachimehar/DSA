package SortingAlgorithms;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {45,12,56,69,44};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[1];//Select
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];//Placed
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
