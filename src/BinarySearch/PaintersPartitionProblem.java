package BinarySearch;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;
        int ans = minTime(arr, k);
        System.out.println("The answer is: " + ans);
    }
    public static int countPainter(int[] arr, int time){
        int n = arr.length;
        int painter = 1, boardPainter = 0;
        for(int i = 0; i<n ; i++){
            if(boardPainter + arr[i] <= time){
                boardPainter += arr[i];
            }
            else{
                painter++;
                boardPainter = arr[i];
            }
        }
        return painter;
    }
    public static int minTime(int[] arr, int k) {
        int n = arr.length;

        if(k > n) return -1;

        int l = arr[0], h = 0;

        for(int i=0; i<n; i++){
            l = Math.max(l,arr[i]);
            h += arr[i];
        }

        while(l<=h){
            int mid = l+(h-l)/2;

            if(countPainter(arr,mid) > k){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return l;
    }
}
