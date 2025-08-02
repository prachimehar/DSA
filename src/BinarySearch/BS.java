package BinarySearch;

public class BS {
    public static int binarySearch(int[] arr,int target){
        //by iterations : ----------
        int l = 0 ,h = arr.length-1;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                l = mid +1;
            }
            else{
                h = mid-1;
            }
        }

        return -1;
    }
    public static int BinarySearch(int[] arr,int l,int h,int target){
        if(l > h) return -1;
        int mid = (l+h)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target){
            return BinarySearch(arr,mid+1,h,target);
        }
        else{
            return BinarySearch(arr,l,mid-1,target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
        int answer = BinarySearch(arr,0,arr.length-1,target);
        System.out.println(answer);
    }
}
