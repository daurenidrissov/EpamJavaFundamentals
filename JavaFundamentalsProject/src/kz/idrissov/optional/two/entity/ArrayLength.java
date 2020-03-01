package kz.idrissov.optional.two.entity;

import java.util.ArrayList;

public class ArrayLength {
//    public static double mean(int[] array) {
//        int sumOfLength = 0;
//        double result;
//        for(int i = 0; i < array.length; i++) {
//            sumOfLength += numberOfDigits(array[i]);
//        }
//        result = (double) sumOfLength / array.length;
//        return result;
//    }

//    public static ArrayList moreThanMean(int[] array) {
//        ArrayList<Integer> newArray = new ArrayList<>();
//        for(int i = 0; i < array.length; i++) {
//            if(numberOfDigits(array[i]) > mean(array)) {
//                newArray.add(array[i]);
//            }
//        }
//        return newArray;
//    }

    public int numberOfDigits(int number) {
        int temp = number;
        int result = 0;
        if(number == 0) {
            return 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                result++;
            }
        }
        return result;
    }

    public int maxDigit(int[] array) {
        int maxD = -100;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(maxD < numberOfDigits(array[i])) {
                maxD = numberOfDigits(array[i]);
                result = array[i];
            }
        }
        return result;
    }

    public int minDigit(int[] array) {
        int minD = 10000;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(minD > numberOfDigits(array[i])) {
                minD = numberOfDigits(array[i]);
                result = array[i];
            }
        }
        return result;
    }
}
