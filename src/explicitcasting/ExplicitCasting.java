package explicitcasting;

public class ExplicitCasting {
    public static void main(String[] args) {

        double d = 240.56;
        int i = (int) d;

        System.out.println(d);
        System.out.println(i);

        long l = 340000000000000L;
        int i2 = (int) l;

        System.out.println(l);
        System.out.println(i2);

        long l2 = 10L;
        int i3 = (int) l2;

        System.out.println(l2);
        System.out.println(i3);

        long l3 = 10L;
        byte b = (byte) l2;

        System.out.println(l3);
        System.out.println(b);
    }
}
