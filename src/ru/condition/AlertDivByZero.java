package condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleNegativeNumbDiv(-1);

    }

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
    }

    public static void possibleNegativeNumbDiv(int number) {
        boolean result = number == -1;
        if (result) {
            System.out.println("This is negative numbers");
        }
    }
}

