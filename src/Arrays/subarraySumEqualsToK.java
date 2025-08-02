package Arrays;

public class subarraySumEqualsToK {
    public static int subarraySum(int[] nums, int k) {
        int c=0;
        for (int i = 0; i < nums.length ; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k){
                    c++;
                }
            }
        }
        return c;

    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,4,-1};
        int k = 3;
        System.out.println(subarraySum(nums,k));
    }
}
