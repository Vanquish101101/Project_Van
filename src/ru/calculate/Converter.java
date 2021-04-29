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
        public static void main (String[] args) {
            int euro = Converter.rubleToEuro(140);
            int dollar = Converter.rubleToDollar(70);
            System.out.println("140 rubles are " + euro + " euro(s)");
            System.out.println("70 rubles are " + dollar + " dollar(s)");

            System.out.println("Тест проверки конвертера валют: ");
            int in1 = 140;
            int in2 = 70;
            int expected1 = 2;
            int expected2 = 1;
            int out1 = Converter.rubleToEuro(in1);
            int out2 = Converter.rubleToDollar(in2);
            boolean passed1 = expected1 == out1;
            boolean passed2 = expected2 == out2;
            System.out.println("140 rubles are 2. Test result : " + passed1);
            System.out.println("140 rubles are 2. Test result : " + passed2);
            }
        }

