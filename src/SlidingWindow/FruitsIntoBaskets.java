package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FruitsIntoBaskets {
    public static int totalFruit(int[] fruits) {
        int maxLen = 0;
        int n = fruits.length;
        for(int i=0; i<n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<n; j++){
                set.add(fruits[j]);
                if(set.size() <= 2){
                    maxLen = Math.max(maxLen, j-i+1);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
    public static int totalFruitsInBasket(int[] fruits) {
        int l = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            int fruit = fruits[r];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            while (map.size() > 2) {
                int leftFruit = fruits[l];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println("by brute force :" + totalFruit(fruits));
        System.out.println("by using sliding window: "+ totalFruitsInBasket(fruits));

    }
}
