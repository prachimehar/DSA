package Arrays;
import java.util.*;

public class subset {
    public static boolean isSubset(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0,j=0;
        int c = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                c++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(c == b.length) return true;
        return false;
    }
}
