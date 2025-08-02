package Recursion;

public class factorialOfN {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n =5;
        int fact = fact(n);
        System.out.println(fact);
    }
}
