package switchexpressions;
@SuppressWarnings("all")
public class SwitchExpressions {
    public static void main(String[] args) {

        /*int month = 1;
        int days = switch (month) {
            case 1 -> 31;
            case 2 -> 28;
            case 3 -> 31;
            case 4 -> 30;
            default -> 0;
        };*/

        /*int month = 1;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };*/

        int month = 2;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Invalid");
                yield 0;
            }
        };

        System.out.println(days + " days");
    }
}



