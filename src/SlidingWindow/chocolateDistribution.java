package SlidingWindow;
import java.util.Arrays;

public class chocolateDistribution {
    public static int findMinDiff(int[] arr, int m) {
        int n = arr.length;
        if(arr.length == 0){
            return 0;
        }
        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;

        for(int i=0; i< n-m+1; i++){
            int min = arr[i];
            int max =arr[i+m-1];

            ans = Math.min(ans,max-min);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        System.out.println(findMinDiff(arr,m));

    }
}
