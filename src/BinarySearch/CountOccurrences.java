package BinarySearch;

import com.sun.jdi.connect.Connector;

public class CountOccurrences {
    public static int countOccurrencesInSortedArray(int[] arr, int x){
        //brute force ----------- tc - o(n)
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                c++;
            }
        }
        return c;
    }
    public static int first(int[] arr, int target) {

        int l =0, h = arr.length-1;
        int first = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == target){
                first = mid;
                h = mid - 1;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return first;
    }
    public static int last(int[] arr, int target) {

        int l =0, h = arr.length-1;
        int last = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == target){
                last = mid;
                l = mid + 1;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return last;
    }
    public static int countOccurrences(int[] arr, int x){
        // by binary search -- tc - o(log n)

        int first = first(arr,x);
        int last = last(arr,x);

        if(first == -1) return 0;

        return last-first+1;
    }
    public static void main(String[] args) {
        int[] arr =  {1, 1, 2, 2, 2, 2, 2, 3};
        int x = 2;
        int ans = countOccurrencesInSortedArray(arr,x);
        System.out.println(ans);
        int ans1 = countOccurrences(arr,x);
        System.out.println(ans1);


    }
}
