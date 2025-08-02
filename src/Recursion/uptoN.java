package Recursion;

public class uptoN {
    public static void N(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        N(n-1);

    }
    public static void revN(int n){
        if(n == 0){
            return;
        }
        revN(n-1);
        System.out.print(n+" ");

    }
    public static void printNameNTimes(String name, int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        printNameNTimes(name,n-1);

    }
    public static void main(String[] args) {
        int n = 5;
        N(n);
        System.out.println();
        revN(n);
        System.out.println();
        printNameNTimes("name",7);
    }
}
