package BinarySearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {

        int l=0,h=nums.length-1;

        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid] == target) return mid;

            //left sorted check
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target <= nums[mid]){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            // right sorted check
            else{
                if(nums[mid] <= target && target <= nums[h]){
                    l = mid + 1;
                }
                else{
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int ans = search(nums,target);
        System.out.println(ans);
    }
}
