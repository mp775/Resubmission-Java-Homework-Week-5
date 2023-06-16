package week5writinghomework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitlist = new ArrayList<>();
        fruitlist.add("APPLE");
        fruitlist.add("BANANA");
        fruitlist.add("GRAPE");
        fruitlist.add("MANGO");
        fruitlist.add("KIWI");
        fruitlist.add("ORANGE");
        fruitlist.add("BLACKBERRY");
        fruitlist.add("STRAWBERRY");
        fruitlist.add("CHERRY");
        ListIterator<String> iterate = fruitlist.listIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + " ,");
        }
    }
}
