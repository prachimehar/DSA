package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MedianofTwoSortedArrays {
    public static double BruteApproach(int[] nums1, int[] nums2) {
        int i = 0,j = 0,k = 0;
        List<Integer> list = new ArrayList<>();
        while(i<nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i++]);
            }
            else{
                list.add(nums2[j++]);
            }
        }
        while(i<nums1.length){
            list.add(nums1[i++]);
        }
        while(j<nums2.length){
            list.add(nums2[j++]);
        }
        int n = nums1.length + nums2.length;
        if(n%2 !=0){
            return list.get(n/2);
        }
        double median = ((double) list.get(n/2) + (double) list.get((n/2)-1))/2.0;
        return median;

    }
    public static double BetterApproach(int[] nums1, int[] nums2) {
        int i = 0,j = 0,k = 0;
        int n = nums1.length + nums2.length;
        int ind1 = n/2 , ind2 = ind1-1;
        int c = 0, indx1 = -1,indx2 = -1;

        while(i<nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                if (c == ind2) indx1 = nums1[i];
                if (c == ind1) indx2 = nums1[i];
                c++;
                i++;
            }
            else{
                if(c == ind2) indx1 = nums2[j];
                if(c == ind1) indx2 = nums2[j];
                c++;
                j++;
            }
        }
        while(i<nums1.length){
            if(c == ind2) indx1 = nums1[i];
            if(c == ind1) indx2 = nums1[i];
            c++;
            i++;
        }
        while(j<nums2.length){
            if(c == ind2) indx1 = nums2[j];
            if(c == ind1) indx2 = nums2[j];
            c++;
            j++;
        }
        if(n%2 !=0){
            return (double)indx2;
        }
        double median = ((double) indx1 + (double) indx2)/2.0;
        if(median < 0) return 0.00000;

        return median;

    }
    public static double OptimalApproach(int[] nums1, int[] nums2) {
       int n1= nums1.length,n2= nums2.length;
       if(n1>n2) return OptimalApproach(nums2,nums1);
       int l = 0, h = n1;
       int left = (n1+n2+1)/2;
       int n = n1+n2;

       while(l<=h){
           int m1 = (l+h)/2;
           int m2 = left-m1;
           int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE,r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
           if(m1 < n1) r1 = nums1[m1];
           if(m2 < n2) r2 = nums2[m2];
           if(m1-1 >= 0) l1 = nums1[m1-1];
           if(m2-1 >= 0) l2 = nums2[m2-1];
           if(l1<= r2 && l2 <= r1){
               if(n%2 != 0){
                   return Math.max(l1,l2);
               }
               return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
           }
           else if(l1 > r2){
               h = m1 -1;
           }
           else{
               l = m1 + 1;
           }
       }
       return 0;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double ans = BruteApproach(nums1,nums2);
        System.out.println("BruteApproach "+ans);
        double ans1 = BetterApproach(nums1,nums2);
        System.out.println("better solution by not using extra space "+ans1);
        double ans2 = OptimalApproach(nums1,nums2);
        System.out.println("Optimal solution by binary search "+ans2);
    }
}
