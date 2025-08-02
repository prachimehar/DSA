package BinarySearch;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindRowWithMaximum1s2D {
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> a,int n, int m){
        int max = 0, index = -1;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m ; j++) {
                c += a.get(i).get(j);
            }
            if(c > max){
                max = c;
                index = i;
            }
        }
        return  index;
    }
    public static int lowerBoundByBS(ArrayList<Integer> a,int n,int target) {

        int l =0, h = n-1;
        int ans = n;
        while(l<=h){
            int mid = (l+h)/2;
            if(a.get(mid) >= target){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static int rowWithMax1sByUsingBS(ArrayList<ArrayList<Integer>> a,int n, int m){
        int max = 0, index = -1;
        for (int i = 0; i < n; i++) {
            int c = m-lowerBoundByBS(a.get(i),m,1);
            if(c > max){
                max = c;
                index = i;
            }
        }
        return  index;
    }
    public static void main(String[] args) {
       ArrayList< ArrayList<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1,1,1)));
        a.add(new ArrayList<>(Arrays.asList(0,0,1)));
        a.add(new ArrayList<>(Arrays.asList(0,0,0)));
        int n = 3 , m= 3;
        System.out.println("The row with the maximum number of 1's is: " +
                rowWithMax1s(a, n, m));
        System.out.println("The row with the maximum number of 1's by BS is: " +
                rowWithMax1sByUsingBS(a, n, m));
    }
}
