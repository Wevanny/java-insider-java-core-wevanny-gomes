package operatorarithmetic;
@SuppressWarnings("all")
public class OperatorArithmetic {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 5;
        int d = a + b - c;
        int e = a * b - c;
        System.out.println(d);
        System.out.println(e);

        int f = 4;
        int g = 2;
        int h = f * (g / f);
        System.out.println(h);
    }
}
