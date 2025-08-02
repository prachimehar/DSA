package BinarySearch;

import java.util.Arrays;

public class FindPeakElement2 {
    public static int findMax(int[][] arr,int n,int m, int col){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i][col] > max){
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
    public static int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int l = 0, h = m-1;
        while(l<=h){
            int mid = (l+h)/2;
            int maxRow = findMax(matrix,n,m,mid);
            int left = mid-1 >= 0? matrix[maxRow][mid-1] : -1;
            int right = mid+1 < m? matrix[maxRow][mid+1] : -1;
            if(matrix[maxRow][mid] > left && matrix[maxRow][mid] > right){
                return new int[] {maxRow,mid};
            }
            else if( right > matrix[maxRow][mid]){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));

    }
}
