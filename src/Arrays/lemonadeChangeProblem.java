package Arrays;

public class lemonadeChangeProblem {
    public static boolean lemonadeChange(int[] bills) {
        int c5=0;
        int c10=0;

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                c5++;
            }
            else if(bills[i] == 10){
                if(c5 == 0) return false;
                c10++;
                c5--;

            }
            else if(bills[i] == 20){
                if(c5 > 0 && c10 > 0){
                    c10--;
                    c5--;
                }
                else if(c5 >= 3){
                    c5 -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));

    }
}
