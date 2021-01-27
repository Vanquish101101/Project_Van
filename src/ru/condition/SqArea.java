package ru.condition;

public class SqArea {
    public static double square (int p, int k) {
        int b = p / (2 * (k + 1));
        int a = b * k;
        int s = a * b;
        return s;
    }
    public static void main (String[] args) {
        double result = SqArea.square(6,2);
        System.out.println("Если периметр: p = 4, а соотношение длины к высоте: k = 1, тогда площадь s = " + result);
    }
}

