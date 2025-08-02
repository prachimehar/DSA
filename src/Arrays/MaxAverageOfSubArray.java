package Arrays;

public class MaxAverageOfSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int l = 0, j = k; j < nums.length; l++, j++) {
            sum = sum - nums[l] + nums[j];
            max = Math.max(max, sum);
        }

        return max / (double) k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k =4;
        double max = Integer.MIN_VALUE;
        int sum=0;

        for(int i = 0; i<= nums.length -k; i++){
            sum = 0;
            for(int j = i; j<i+k; j++){
                sum += nums[j];
            }
            max= Math.max(max, sum);
        }

        double ans = max/(double)k;
        System.out.println(ans);

        System.out.println(findMaxAverage(nums,k));
    }
}
