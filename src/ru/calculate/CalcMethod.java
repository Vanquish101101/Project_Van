package ru.calculate;
public class CalcMethod {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static void main(String[] args) {
        CalcMethod.plus(1, 2);
    }
}
