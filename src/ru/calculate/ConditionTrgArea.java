package ru.calculate;

public class ConditionTrgArea {
    public static double area (double a, double b, double c) {
        double p1 = (a + b + c) / 2; /* нахождение полупериметра */
        double p2 = p1 * (p1 - a) * (p1 - b) * (p1 - c);
        double s = Math.sqrt(p2); /* вычисление площади. Исходя из предидущих значений */
        return s;
    }
    public static void main (String[] args) {
        double rslt = ConditionTrgArea.area(2,2,2);
        System.out.println("area triangle: (a = 2, b = 2, c = 2) = " + rslt);
    }
}


//    где a, b и с - это длины сторон,
//    а P - это полупериметр.
//    Полупериметр вычисляется как сумма всех сторон, деленная на 2.
//    a + b + c / 2