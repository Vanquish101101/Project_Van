package ru.calculate;

public class ConditionPoint {
    public static double distance (int x1, int x2, int y1, int y2) {
        double x_rslt = x2 - x1;
        double y_rslt = y2 - y1;
        double rslt_pow = 2;
        double x_pow = Math.pow(x_rslt, rslt_pow);
        double y_pow = Math.pow(y_rslt, rslt_pow);
        double sum_rslt = x_pow + y_pow;
        double rslt_sqrt = Math.sqrt(sum_rslt);
        return rslt_sqrt;
    }
    public static void main (String[] args) {
        double result =  ConditionPoint.distance(1,2,4,5);
        System.out.println("result (0, 0) to (2, 0)" + result);
    }
}
