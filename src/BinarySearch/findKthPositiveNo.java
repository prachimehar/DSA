package BinarySearch;

public class findKthPositiveNo {
    public static int findKthPositive(int[] arr, int k) {
        int l = 0, h = arr.length - 1;

        while (l<= h) {
            int mid = l + (h - l) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return l + k;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int ans = findKthPositive(arr,k);
        System.out.println(ans);

    }
}
