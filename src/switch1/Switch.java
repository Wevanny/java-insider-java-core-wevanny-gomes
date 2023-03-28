package switch1;
@SuppressWarnings("all")
public class Switch {
    public static void main(String[] args) {

        int month = 13;
        int days;

        switch (month) {
            case 1:
                days = 31;
                System.out.println(1);
                break;
            case 2:
                days = 28;
                System.out.println(2);
                break;
            case 3:
                days = 31;
                System.out.println(3);
                break;
            case 4:
                days = 30;
                System.out.println(4);
                break;
            default:
                days = 0;
                System.out.println("Inválido");
        }

        System.out.println(days + " days");
    }
}
