package BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class singleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, h = n - 1;

        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        while (l <= h) {
            int mid = l + (h - l) / 2;

            // Unique check (now safe because we know mid won't be 0 or n-1)
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // If the pairing to the “right” is intact, go right; else go left
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1; // never reached for valid input
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                i += 2;
            } else {
                System.out.println(arr[i]);
                i++;
            }
        }

        if (i == arr.length - 1) {
            System.out.println(arr[i]);
        }

        int ans = singleNonDuplicate(arr);
        System.out.println(ans);



//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int n: arr) {
//            map.put(n, map.getOrDefault(n,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> e : map.entrySet()){
//            if(e.getValue() == 1){
//                System.out.println(e.getKey());
//            }
//        }

    }
}
