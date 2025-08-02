package BinarySearch;

public class findMinimumInRotatedSortedArray {
    public static int minimumInRotatedArr(int[] arr){
        int l = 0, h = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[l]<= arr[mid]){
                min = Math.min(min,arr[l]);
                l = mid +1;
            }
            else{
                min = Math.min(min,arr[mid]);
                h = mid + 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = minimumInRotatedArr(arr);
        System.out.println(ans);
    }
}
