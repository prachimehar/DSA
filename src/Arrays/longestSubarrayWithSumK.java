package Arrays;

public class longestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        //brute force -  give time limit exceed error
        int ans=0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i; j<arr.length; j++){
                sum +=arr[j];
                if(sum == k){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={10,5,2,7,1,-10};
        int k = 15;
        System.out.println(longestSubarray(arr,k));

    }
}
