package Oct.ex_29102024_Arrays_Part1;

import java.util.Arrays;
public class Lab138_Array_Itreate {

    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length); // 1
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks); // {51,87,90,91,100};
        int item_index = Arrays.binarySearch(marks, 100);
        System.out.println(item_index);


    }
}
