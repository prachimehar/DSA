package BinarySearch;

public class howManyTimesArrayIsRotated {
    public static int findKRotation(int[] arr){

        int l=0,h=arr.length-1;
        int ans = Integer.MAX_VALUE;
        int i=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[l] <= arr[h]){
                if(arr[l]<ans){
                    i = l;
                    ans = arr[l];
                }
                break;
            }
            if(arr[l]<= arr[mid]){
                if(arr[l]<ans){
                    i = l;
                    ans = arr[l];
                }
                l = mid +1;
            }
            else{
                h = mid + 1;
                if(arr[mid] < ans){
                    i = mid;
                    ans = arr[mid];
                }
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int ans = findKRotation(nums);
        System.out.println(ans);

    }
}
