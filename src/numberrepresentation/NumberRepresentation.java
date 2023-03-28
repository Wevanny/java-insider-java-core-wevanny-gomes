package numberrepresentation;
@SuppressWarnings("all")
public class NumberRepresentation {
    public static void main(String[] args) {
        long a = 20_000_000_000l;
        double d = 435.567654;

        int i = 0b1010_1111_0101;
        System.out.println(i);

        int i2 = 0x12AF_2020;
        System.out.println(i2);

        int i3 = 0444;
        System.out.println(i3);
    }
}
