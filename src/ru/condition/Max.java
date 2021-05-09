package condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.max(33, 44);
        System.out.println(msg);
    }
}



