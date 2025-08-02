package BinarySearch;

public class BookAllocationProgram {
    public static int countStudents(int[] arr, int pages) {
        int st=1, pagesStudent = 0;
        for (int i = 0; i < arr.length; i++) {
            if(pagesStudent+arr[i] <= pages){
                pagesStudent += arr[i];
            }
            else{
                st++;
                pagesStudent = arr[i];
            }
        }
        return st;
    }
    public static int findPages(int[] arr, int k) {
       int n = arr.length;
       if(k > n) return -1;
       int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
            sum += arr[i];
        }
        int l = max, h = sum;
        for (int i = l; i <= h; i++) {
            if(countStudents(arr,i) == k){
             return i;
            }
        }
        return l;
    }
    public static int findPagesByBS(int[] arr, int k) {
        int n = arr.length;
        if (k > n){
            return -1;}
        int sum =0,max=Integer.MIN_VALUE;
        for(int i = 0; i<n ; i++){
            max = Math.max(max,arr[i]);
            sum = sum + arr[i];
        }

        int low = max;
        int high = sum;

        while(low <= high){
            int mid = (low+high)/2;
            if(countStudents(arr,mid) > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;

  }
    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int k = 4;
        int ans = findPages(arr,k);
        System.out.println(ans);
        int ans1 = findPagesByBS(arr,k);
        System.out.println(ans1);
    }
}
