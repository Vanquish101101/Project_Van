package calculate;

public class Types {
    public static void main(String[] Args) {
//        byte b = 100;
//        short s = b;
//        int i = s;
//        long l = i;
//        System.out.println("Вывод в консоль: " + l);
//
//        int h = 2147483600;
//        float f = h;
//        System.out.println("Вывод в консоль значения после преобразования: " + f );
//
//        int j = 10000;
//        byte d = (byte) j;
//        short k = (short) j;
//        System.out.println("Вывод в консоль значения после преобразования: " + d);
//        System.out.println("Вывод в консоль значения после преобразования: " + k);
//
//        double dk = 94.984751;
//        int ik = (int) dk;
//        System.out.println("Вывод в консоль значения после преобразования: " + ik);
//
//        double ds = 94.984751;
//        int is = (int) Math.round(ds);
//        System.out.println("Вывод в консоль значения после преобразования: " + is);
//
//        int iw = 100;
//        double df = 85.6;
//        double rsl = iw + df;
//        System.out.println("Результат вычисления: " + rsl);

        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println("Результат вычисления: " + b);

        // 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("Результат вычисления: " + rsl);

        // 3 выражение
        char c = 45000;
        float ii = c;
        System.out.println("Результат вычисления: " + ii);

        // 4 выражение
        double d = 121.19;
        byte bb = (byte) d;
        System.out.println("Результат вычисления: " + bb);

        // 5 выражение
        short s = 1500;
        char cc = (char) s;
        double dd = cc;
        System.out.println("Результат вычисления: " + dd);

    }
}
