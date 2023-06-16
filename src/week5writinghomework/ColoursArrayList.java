package week5writinghomework;

import java.util.ArrayList;

public class ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("RED");
        colorlist.add("BLUE");
        colorlist.add("GREEN");
        colorlist.add("GREEN");
        colorlist.add("YELLOW");
        colorlist.add("BLACK");
        colorlist.add("WHITE");
        colorlist.add("ORANGE");
        colorlist.add("PURPLE");
        colorlist.add("Cyan");
        for (String colourlist : colorlist) {
            System.out.println(colourlist + " ,");
        }
    }
}
