package ru.calculate;

public class Fit {
    public static double manWeight (short height) {
        double rslt = -100 * 1.15;
        return rslt;
    }
    public static double womanWeight (short height) {
        double rslt = -110 * 1.15;
        return rslt;
    }
    public static void main (String[] args) {
        short height_man = 187;
        short height_woman = 163;
        double man = Fit.manWeight(height_man);
        double woman = Fit.womanWeight(height_woman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 163 is " + woman);

    }
}
