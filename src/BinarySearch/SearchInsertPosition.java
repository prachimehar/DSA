package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] arr,int x){
        int l =0,h=arr.length-1;
        int ans = arr.length;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid] >= x){
                //look for smaller index on the left
                ans = mid;
                h = mid - 1;
            }
            else{
                // look on the right
                l= mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,9,45};
        int x = 32;
        int answer = searchInsert(arr,x);
        System.out.println(answer);

    }
}
