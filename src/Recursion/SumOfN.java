package Recursion;

public class SumOfN {
    public static int sumOfNo(int n ){
        if(n <= 0){
            return 0;
        }
        return n + sumOfNo(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        int sum = sumOfNo(n);
        System.out.println(sum);

    }
}
