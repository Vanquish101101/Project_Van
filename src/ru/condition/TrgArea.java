package ru.condition;

public class TrgArea {
    public static double area (double a, double b, double c) {
        double p1 = (a + b + c) / 2; /* нахождение полупериметра_1 */
        double p2 = p1 * (p1 - a) * (p1 - b) * (p1 - c); /* вычмсление площади_операция 1 */
        double s = Math.sqrt(p2); /* вычисление площади_оперция 2. Исходя из предидущих значений */
        return s;
    }
    public static void main (String[] args) {
        double rslt = TrgArea.area(4,3,5);
        System.out.println("area triangle: (a = 4, b = 3, c = 5) = " + rslt);
    }
}


//    1. где a, b и с - это длины сторон,

//    2. P - это полупериметр.
//    Полупериметр вычисляется как сумма всех сторон, деленная на 2.
//    a + b + c / 2

//    3. Площадь рассчитывается по формуле Геррона:
//       a. p1 * (p1 - a) * (p1 - b) * (p1 - c);
//       b. s = Math.sqrt(p2);
