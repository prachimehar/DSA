package BinarySearch;

public class CapacitytoShipPackageswithinDDays {
    public static int findDays(int[] weights,int capacity){
        int n = weights.length;

        int days = 1, load = 0;
        for(int i=0; i<n; i++){
            if(load + weights[i] > capacity){
                days = days + 1;;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;

    }
    public static int shipWithinDays(int[] weights, int days) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<weights.length; i++){
            sum += weights[i];
            max = Math.max(max,weights[i]);
        }

        int l = max, h = sum;
        while(l<=h){
            int mid = l+(h-l)/2;
            int daysReq = findDays(weights,mid);
            if(daysReq <= days){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shipWithinDays(arr,days);
        System.out.println(ans);

    }
}
