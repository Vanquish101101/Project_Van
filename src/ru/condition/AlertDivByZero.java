package condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleNegativeDiv(-1);

    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
    }

    public static void possibleNegativeDiv(int number) {
        if (number == -1) {
            System.out.println("This is negative numbers");
        }
    }
}

