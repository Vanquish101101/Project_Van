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

//    Периметр прямоугольника вычисляется по следующей формуле:
//    p = 2 * (a + b); где a - длина, b - высота.

//    В задании известно, что длина больше высоты в k раз.
//    a = b * k;

//    формула для вычисления площади прямоугольника..
//    s = a * b;

//    Теперь запишем все формулы, необходимые для вычисления.
//    b = p / (2 * (k + 1)); -> расписать последовательно или можно так?
//    a = b * k;
//    s = a * b;