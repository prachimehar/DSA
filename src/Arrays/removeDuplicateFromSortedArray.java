package Arrays;

public class removeDuplicateFromSortedArray {
    public static  int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i=0,j = 1;
        while(i<arr.length-1){
            if (arr[i] != arr[i+1]) {
                arr[j] = arr[i+1];
                j++;
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,9,9,11,11};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}
