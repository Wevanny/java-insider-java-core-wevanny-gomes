package exdayofweek;
@SuppressWarnings("all")
public class ExDayOfWeek {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        String day = " ";

        System.out.print("Number: ");
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1:
                day = "Sunday/Domingo";
                break;
            case 2:
                day = "Monday/Segunda-feira";
                break;
            case 3:
                day = "Tuesday/Terça-feira";
                break;
            case 4:
                day = "Wednesday/Quarta-feira";
                break;
            case 5:
                day = "Thursday/Quinta-feira";
                break;
            case 6:
                day = "Friday/Sexta-feira";
                break;
            case 7:
                day = "Saturday/Sábado";
                break;
            default:
                System.out.println("Invalid day!");
        }

        System.out.println("The day of the week is: " + day);
    }
}
