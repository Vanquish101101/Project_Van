package calculate;
public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(70);
        System.out.println("140 rubles are " + euro + " euro(s)");
        System.out.println("70 rubles are " + dollar + " dollar(s)");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 euros. Test result : " + passed);

    }
}

