package kz.idrissov.optional.one;

import kz.idrissov.optional.one.entity.Hello;
import kz.idrissov.optional.one.entity.MyList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hello hi = new Hello();
        MyList list = new MyList();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name...");
        String name = in.nextLine();

        System.out.println(hi.hello(name));

        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println("Enter numbers...");
        String s = in.nextLine();
        String[] stringArray = s.split(" ");
        for(int i = 0; i < stringArray.length; i++) {
            myList.add(Integer.parseInt(stringArray[i]));
        }

        System.out.println("Sum of the numbers: " + list.sum(myList)
                            + ", multiplication is: " + list.mult(myList));
    }
}
