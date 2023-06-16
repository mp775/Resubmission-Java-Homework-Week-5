package week5writinghomework;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 34, 54, 67, 78};
        System.out.println("Original array:" + Arrays.toString(array));
        ReverseArray obj = new ReverseArray();
        System.out.println("Reverse array:");
        obj.reverseAnArray(array);
    }

    public void reverseAnArray(int[] list) {
        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(list));
    }
}
