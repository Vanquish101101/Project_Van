package calculate;

public class Fit{
    public static double manWeight (short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight (short height) {
        return (height - 110) * 1.15;
    }

    public static void main (String[] args) {
        short manHeight = 163;
        short womanHeight = 187;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 163 is " + woman);
    }
}
