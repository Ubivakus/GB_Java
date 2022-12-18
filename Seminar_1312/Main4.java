//На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)

import java.util.*;

class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(500, 455, 657, 448, 311, 982, 747));
        System.out.println(removeEven(listOfNumbers));
    }

  
    public static ArrayList<Integer> removeEven(ArrayList<Integer> list) {
        list.removeIf(integer -> integer % 2 == 0);
        return list;
    }
}