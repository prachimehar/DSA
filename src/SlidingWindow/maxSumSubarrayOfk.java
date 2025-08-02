package SlidingWindow;

public class maxSumSubarrayOfk {
    public static int maximumSumSubArray(int[] arr, int k) {
        int n = arr.length;

        int max = 0;
        for(int i=0; i<n-k+1; i++){
            int sum =  0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }

        return max;

    }
    public static long maxSumSubArray(int[] arr, int k) {
        int n = arr.length;

        long max = 0;
        long sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        max = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maximumSumSubArray(arr,k));
        System.out.println(maxSumSubArray(arr,k));

    }
}
