package operatorlogic;
@SuppressWarnings("all")
public class OperatorLogic {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

        System.out.println(a || b && !a);
        System.out.println(a && b && !a);

        boolean r = 15 - 5 * 2 > (3 - 1) / 2 && 4 <= 2 || !(2 != 4);
        System.out.println(r);
    }
}
