package ru.ivan;

public class Calculate {

    public class Variables {

        public static void main(String[] args) {

            byte mem = 1;
            System.out.println(mem);

            short size = 1;
            System.out.println(size);

            int length = 100500;
            System.out.println(length);

            long money = 900500;
            System.out.println(money);

            float weight = 1.05F;
            System.out.println(weight);

            double distance = 100500.99;
            System.out.println(distance);

            boolean exists = true;
            System.out.println(exists);

            char gender = 'Y';
            System.out.println(gender);

            System.out.println(
                    "short– числа от-32,768 до32,767\n" +
                    "int– числа от - 2 в степени 31 до 2 в степени 31 минус 1.\n" +
                    "long– числа от - 2 в степени 63 до 2 в степени 63 минус 1.\n" +
                    "float– числа с плавающей точкой. Диапазон примерно такой же, как и у int.\n" +
                    "double– числа с плавающей точкой. Диапазон примерно такой же, как и у long.\n" +
                    "boolean– true или false.\n" +
                    "char– Любой символ. Символ в Java описывается одинарными кавычками.");

        }

    }
}
