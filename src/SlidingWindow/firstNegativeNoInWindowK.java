package SlidingWindow;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeNoInWindowK {
    // brute force --
    public static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n-k+1; i++){
            boolean negative = false;

            for(int j = i; j< i+k; j++){
                if(arr[j] < 0){
                    list.add(arr[j]);
                    negative = true;
                    break;
                }
            }

            if(!negative){
                list.add(0);
            }
        }

        return list;
    }

    public static List<Integer> firstNegativeInEachWindow(int[] arr, int k) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if(arr[i] <0){
                q.offer(i);
            }
        }
        if(q.isEmpty()) list.add(0);
        else list.add(arr[q.peek()]);

        for(int i = 1; i< n-k+1; i++){
            if(arr[i-1] < 0){
                q.poll();
            }
            if(arr[i+k-1] < 0){
                q.offer(i+k-1);
            }
            if(q.isEmpty()) list.add(0);
            else list.add(arr[q.peek()]);
        }

        return list;
    }
    public static void main(String[] args) {
        // brute force o(n*k)
        int[] arr = {12, -1, -7, 8, -15, 30, 13, 28};
        int k = 3;
        // by brute force
        System.out.println(firstNegInt(arr,k));

        // by sliding window o(n)
        List<Integer> ans = firstNegativeInEachWindow(arr,k);
        System.out.println(ans);


    }
}
