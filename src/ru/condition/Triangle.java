package condition;

public class Triangle {

    public static boolean exist(double ab, double bc, double ac) {

        return (ac + bc > ab) && (ab + ac > bc) && (ab + bc > ac) ? true: false;

    }

    public static void main(String[] args) {
        System.out.println(exist( 2,2,3));
    }
}