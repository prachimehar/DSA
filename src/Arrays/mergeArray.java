package Arrays;

import java.util.Arrays;

public class mergeArray {

    public static void mergeInNum1(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;          // last index of actual elements in num1
        int j = n - 1;          // last index of num2
        int k = m + n - 1;      // last index of num1 including extra space

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        while (j >= 0) {
            num1[k--] = num2[j--];
        }
    }



    public static void main(String[] args) {
        int[] num1 = {4,3,7,0,0,0};
        int m = 3;
        int[] num2 = {1,2,6};
        int n = 3;

        mergeInNum1(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));


        int[] arr1 = {2,3,5},arr2 = {1,4,6};
        int[] temp = new int[arr1.length+arr2.length];
        int k=0;
        int i=0,j=0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i]<arr2[j]){
                temp[k++] = arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                temp[k++] = arr2[j++];

            }
        }
        while(i<arr1.length){
            temp[k++] = arr1[i++];
        }
        while(j<arr2.length){
            temp[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(temp));

    }
}
