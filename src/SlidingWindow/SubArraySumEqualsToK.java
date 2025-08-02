package SlidingWindow;

import java.util.HashMap;

public class SubArraySumEqualsToK {
    public static int longestSubarray(int[] arr, int k) {
        // for using sliding window -- works only for positive numbers -- if there any number then use map
        int maxLength = 0;

        int i=0,j=0;
        int sum = 0;

        while(j < arr.length){
            sum += arr[j];

            if(sum > k){
                while(sum > k){
                    sum -= arr[i];
                    i++;
                }
            }
            if(sum == k){
                maxLength = Math.max(maxLength, (j - i + 1));

            }

            j++;

        }
        return maxLength;

    }
    public static int subArraySumOfK(int[] nums, int k) {
        //brute force

        int c = 0;
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j = i; j< nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    c++;
                }
            }
        }
        return c;

    }
    public static int subarraySum(int[] nums, int k) {
        //by using hashmap

        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
    public static void main(String[] args) {
        //sliding window variable size
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println("by hashmap: "+ subarraySum(nums,k));
        System.out.println("by brute force: "+ subArraySumOfK(nums,k));
        System.out.println("for +ve number only using sliding window : "+ longestSubarray(nums,k));

    }
}
