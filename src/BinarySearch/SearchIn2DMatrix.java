package BinarySearch;

public class SearchIn2DMatrix {
    public static boolean BruteForce(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return  false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int l =0, h=( n*m) - 1;
        while(l<=h) {
            int mid = (l+h)/2;
            int row = mid / m, col= mid % m;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,6}};
        System.out.println(searchMatrix(matrix,13));
        System.out.println(BruteForce(matrix,23));
}}
