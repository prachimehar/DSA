package Arrays;

import java.util.Arrays;

public class singleN {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4,7,4};
        int ans = 0;
        boolean []visited = new boolean[arr.length];
        Arrays.fill(visited,false);

        for (int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;
            int c=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    c++;
                }
            }
            if(c==1){
                ans = arr[i];
            }
        }
        System.out.println(ans );
    }
}
