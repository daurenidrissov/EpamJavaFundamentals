package kz.idrissov.optional.three;

import kz.idrissov.optional.three.entity.Leap;

import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        System.out.print("Enter any integer number from 1 to 12: ");
        int input = scan.nextInt();

        Leap leap = new Leap();

        //returns a month name & throws ex if input is out of range
        System.out.println(year + " " + Month.of(input) + " - " + leap.isLeap(year));
    }
}
