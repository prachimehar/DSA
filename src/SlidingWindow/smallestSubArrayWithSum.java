package SlidingWindow;

public class smallestSubArrayWithSum {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int minLen = n+1;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j = i; j< n; j++){
                sum += arr[j];
                if(sum > x){
                    minLen = Math.min(minLen,j - i + 1);
                    break;
                }
            }
        }
        return (minLen == n + 1) ? 0 : minLen;
    }
    public static int smallestSubarrayWithSum(int x, int[] arr) {
        int n = arr.length;
        int i=0, j=0;
        int sum =0;
        int minLen = Integer.MAX_VALUE;
        while (j < n) {
            sum += arr[j];

            while (sum > x) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= arr[i];
                i++;
            }

            j++;
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        // byu brute force
        System.out.println(smallestSubWithSum(x,arr));

        //by sliding window
        System.out.println(smallestSubarrayWithSum(x,arr));
    }
}
