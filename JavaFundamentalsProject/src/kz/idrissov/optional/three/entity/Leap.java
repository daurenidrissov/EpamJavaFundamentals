package kz.idrissov.optional.three.entity;

public class Leap {
    public String isLeap(int year) {
        String s = "";
        if(year % 4 == 0) {
            s = "leap year";
        } else {
            s = "not a leap year";
        }
        return s;
    }
}
