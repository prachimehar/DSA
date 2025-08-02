package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean canWePlace(int[] arr,int dist ,int cows){
        int count = 1, last = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] - last >= dist){
                count++;
                last = arr[i];
            }
            if(count >= cows){
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int limit = arr[arr.length-1]-arr[0];
        for (int i = 0; i <= limit; i++) {
            if(!canWePlace(arr, i, cows)){
                return (i-1);
            }
        }
        return -1;
    }
    public static int aggressiveCowsByBinarySearch(int[] arr, int cows) {
        Arrays.sort(arr);
        int l = 1,h = arr[arr.length-1]-arr[0];
        while(l<=h){
            int mid =(l+h)/2;
            if(canWePlace(arr,mid,cows)){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
        int ans1 = aggressiveCowsByBinarySearch(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans1);

    }
}
