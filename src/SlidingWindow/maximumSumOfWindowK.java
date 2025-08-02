package SlidingWindow;

public class maximumSumOfWindowK {
    public static int bySlidingWindow(int[] arr,int k){
        int i = 0, j = k-1;
        int sum = 0,maxSum=0;
        for (int l = 0; l < k; l++) {
            sum += arr[l];
        }
        maxSum = sum;

        while(j<arr.length-1){
            sum = sum -arr[i];
            i++;
            j++;
            sum = sum + arr[j];
            maxSum = Math.max(maxSum, sum);
        }

//        for (int l = k; l < arr.length ; l++) {
//            sum = sum - arr[l-k] + arr[l];
//            maxSum = Math.max(maxSum, sum);
//        }

        return maxSum;
    }
    public static void main(String[] args) {

        // by brute force -------------
        int[] arr = {-1,2,8,-4,5,6,-2,15};
        int k = 3;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i <= arr.length-k; i++) {
            for (int j = i; j < i+k; j++) {
                sum = sum + arr[j];

            }
            maxSum = Math.max(sum,maxSum);
            sum =0;
        }

        System.out.println(maxSum);

        //by sliding window maximum sub array of size k
        int max = bySlidingWindow(arr,3);
        System.out.println(max);

    }
}
