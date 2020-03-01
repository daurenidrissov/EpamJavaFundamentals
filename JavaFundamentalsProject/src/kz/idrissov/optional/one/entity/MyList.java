package kz.idrissov.optional.one.entity;

import java.util.ArrayList;

public class MyList {
    public int sum(ArrayList<Integer> list) {
        int result = 0;
        for(int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }

    public int mult(ArrayList<Integer> list) {
        int prod = 1;
        for(int i = 0; i < list.size(); i++) {
            prod *= list.get(i);
        }
        return prod;
    }
}
