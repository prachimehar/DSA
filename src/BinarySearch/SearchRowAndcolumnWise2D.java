package BinarySearch;

public class SearchRowAndcolumnWise2D {
    public static boolean BruteForce(int[][] matrix, int target) {

        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean BS(int[] arr, int target){

        int l = 0, h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;

    }
    public static boolean BetterApproach(int[][] matrix, int target) {

        for(int i=0; i<matrix.length; i++){
            boolean index = BS(matrix[i],target);
            if(index){
                return true;
            }
        }
        return false;

    }
    public static boolean searchMatrixByOptimalApproach(int[][] matrix, int target) {

        int n = matrix.length, m= matrix[0].length;

        int row = 0, col = m-1;
        while( row < n && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row ++; // move down
            }
            else{
                col--; // move left
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 22;
        System.out.println("Brute Force: "+BruteForce(matrix,target));
        System.out.println("Better Approach: "+BetterApproach(matrix,target));
        System.out.println("Optimal Approach:" +searchMatrixByOptimalApproach(matrix,target));
    }
}
