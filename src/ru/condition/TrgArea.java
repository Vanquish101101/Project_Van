package condition;

public class TrgArea {
    public static double area (double a, double b, double c) {
        double p1 = (a + b + c) / 2;
        return Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
    }
    public static void main (String[] args) {
        double rslt = TrgArea.area(4,3,5);
        System.out.println("area triangle: (a = 4, b = 3, c = 5) = " + rslt);
    }
}


