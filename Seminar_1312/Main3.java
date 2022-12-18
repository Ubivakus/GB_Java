import java.util.*;

class Main3 {
  public static void main(String[] args) {
    ArrayList<Integer> startList = new ArrayList<>();
    ArrayList<Integer> evenList = new ArrayList<>();
    ArrayList<Integer> finalList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size: ");
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      System.out.println("Add Element " + (i + 1) + ":");
      startList.add(sc.nextInt());
    }
    for (int j = 0; j < size; j++) {
      if (startList.get(j) % 2 == 0) {
        evenList.add(startList.get(j));
      }
    }
    Collections.sort(evenList);
    int counter = 0;
    for (int m = 0; m < size; m++) {
      if (startList.get(m) % 2 == 0) {
        finalList.add(evenList.get(counter++));
      } else if (startList.get(m) % 2 != 0) {
        finalList.add(startList.get(m));
      }
    }
    for (Integer el : finalList) {
      System.out.print(el + " ");
    }
    sc.close();
  }
}