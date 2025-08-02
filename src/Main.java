//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ka = new int[m+n];
        int i=0,j=0,k=0;
        while(i!=0){
            if(nums1[i]<nums2[i]){
                ka[i] = nums1[i];
            }
            else{
                ka[i]=nums2[i];
            }
        }
        return ka;
    }
    public static void main(String[] args){

    }
}