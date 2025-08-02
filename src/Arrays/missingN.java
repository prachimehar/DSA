package Arrays;

public class missingN {
    public static int missingValue(int[] arr,int n){
        int sum = (n*(n+1))/2;
        int sumOfArray = 0;
        for (int i = 0; i < n; i++) {
            sumOfArray += arr[i];
        }
        return sum-sumOfArray;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5};
        int ans = missingValue(arr,5);
        System.out.println(ans);

    }
}
