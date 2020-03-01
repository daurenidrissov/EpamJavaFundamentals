package kz.idrissov.optional.two.entity;

import java.util.Arrays;

public class ArraySort {
    public static int[] byLength(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array,0, newArray, 0, array.length);
        Arrays.sort(newArray);
        return newArray;
    }
}
