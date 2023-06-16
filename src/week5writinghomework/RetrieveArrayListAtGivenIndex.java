package week5writinghomework;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("MUSHROOM");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("BITTER_GOURD");
        System.out.println(vegetableList);
        System.out.println("Please enter an index number:");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("Index !!");
        }
    }
}
