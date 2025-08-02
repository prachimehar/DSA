package Arrays;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr ={1,0,1,1,0,1,0,0,0,1,1,1,1,0,1,1,1,1};

        int c=0,max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == 1){
                c++;
            }
            else{
                max = Math.max(c,max);
                c = 0;
            }
        }
        max = Math.max(c,max);
        System.out.println(max);

    }
}
