package Arrays;

public class thirdMax {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5,6,7,8,9,7,5};
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == max){
                i++;
            }else{
                max = 0;
                max = Math.max(max,nums[i]);
            }
        }
        System.out.println(max);
    }
}
