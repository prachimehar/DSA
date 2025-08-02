package Arrays;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int[] arr ={1,3,7,7,5,4,4,9,2};
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited,false);

        for (int i = 0; i < arr.length ; i++) {
            if(visited[i]) continue;
            int c = 1;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    c++;
                }
            }

            System.out.println(arr[i]+" -> "+c);
        }
    }
}
