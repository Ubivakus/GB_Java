// На вход методу приходят два ArrayList<Integer> и целое число num.
// Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 7, 3, 2, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7, 5, 2, 9, 3));
        System.out.println(findNumCount(list1, list2, 9));
    }

    public static boolean findNumCount(ArrayList<Integer> list1, ArrayList<Integer> list2, int num) {
        int count = 0;
        for (Integer i : list1) {
            if (i == num) {
                count++;
            }
        }
        for (Integer i : list2) {
            if (i == num) {
                count--;
            }
        }
        return count == 0;
    }
}