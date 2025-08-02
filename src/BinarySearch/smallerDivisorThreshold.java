package BinarySearch;

public class smallerDivisorThreshold {

    public static int sumOfDivisor(int[] nums,int d){
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum += (int)Math.ceil((double)nums[i]/(double)d);
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold) {

        if(nums.length > threshold) return -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            max = Math.max(max,nums[i]);
        }

        int l = 1, h = max;
        while(l<=h){
            int mid = (l+h)/2;
            if(sumOfDivisor(nums,mid) <= threshold){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;

    }
    public static void main(String[] args) {

        int[] arr = {1,2,5,9};
        int threshold = 6;
        int ans = smallestDivisor(arr,threshold);
        System.out.println(ans);

    }


}
