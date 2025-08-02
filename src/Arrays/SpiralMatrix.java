package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, bottom = mat.length-1;
        int left = 0, right = mat[0].length-1;
        while(top <= bottom && left <= right){
            for(int i = left; i<= right; i++){
                list.add(mat[top][i]);
            }
            top++;
            for(int i =top; i<= bottom; i++){
                list.add(mat[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));

    }
}
