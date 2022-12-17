//На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 7, 3, 2, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7, 5, 2, 9, 3));
        System.out.println(equalLists(list1, list2));
    }

    public static boolean equalLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                int itemList1 = list1.get(i);
                int itemList2 = list2.get(i);
                if (itemList1 != itemList2) {
                    return false;
                }
            }
            return true;
        }
    }
}