package BinarySearch;

public class FindSqrtOgfN {
    public static void main(String[] args) {
        int n = 50;
        int l =1,h = n;
        while(l<=h){
            long mid = (l+h)/2;
            if((mid * mid)<= (long)n){
                l = (int)mid + 1;
            }
            else{
                h = (int)mid - 1;
            }
        }
        System.out.println(h);
    }
}
