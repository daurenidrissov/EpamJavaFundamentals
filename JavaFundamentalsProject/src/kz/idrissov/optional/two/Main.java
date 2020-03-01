package kz.idrissov.optional.two;

import kz.idrissov.optional.two.entity.ArrayLength;
import kz.idrissov.optional.two.entity.ArrayNumber;
import kz.idrissov.optional.two.entity.ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArraySort sort = new ArraySort();
        ArrayLength len = new ArrayLength();
        ArrayNumber num = new ArrayNumber();

        System.out.print("Enter any positive integer number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Самое короткое число: " + len.minDigit(array) + ", его длина: " + len.numberOfDigits(len.minDigit(array)) +
                            "\nСамое длинное число: " + len.maxDigit(array) + ", его длина: " + len.numberOfDigits(len.maxDigit(array)));
        System.out.println("Число с минимальным количеством различных цифр: " + num.unique(array));

//        System.out.println("Sorted array: " + Arrays.toString(sort.byLength(array)));
//        System.out.println("Average length of the numbers: " + len.mean(array));
//        System.out.println("Numbers with length more than average length: "
//                + Arrays.toString(len.moreThanMean(array).toArray()));
//        System.out.println("First number with minimum amount of different digits: "
//                + num.unique(array));
    }
}
