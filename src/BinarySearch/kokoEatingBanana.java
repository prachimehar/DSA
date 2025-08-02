package BinarySearch;

public class kokoEatingBanana {

    public static int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i],max);
        }
        return max;
    }
    public static int calculateTotalHours(int[] piles,int h){
        int totalHour = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHour += (int)Math.ceil((double)piles[i]/(double) h);
        }
        return totalHour;
    }

    public static int kokoEating(int[] piles,int hour){
        int l = 1, h = findMax(piles);
        while(l <= h){
            int mid = (l+h)/2;
            int totalHours = calculateTotalHours(piles,mid);
            if(totalHours <= hour){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = kokoEating(piles,h);
        System.out.println(ans);

    }
}
