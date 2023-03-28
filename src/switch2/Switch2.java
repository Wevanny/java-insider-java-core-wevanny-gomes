package switch2;
@SuppressWarnings("all")
public class Switch2 {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Month: ");
        int month = Integer.parseInt(scanner.nextLine());

        int days = 1;

        System.out.print("Year: ");
        int yearInput = Integer.parseInt(scanner.nextLine());

        int year = Integer.parseInt(String.valueOf(yearInput));

        String answer = leapYear(year);

        switch (month) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
              days = 31;
              break;
           case 2:
               if (answer.equals("Leap Year")) {
                   days = 29;
               } else if (answer.equals("Is not Leap Year")) {
                   days = 28;
               }
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               days = 30;
               break;
           default:
               days = 0;
               System.out.println("Invalid!");
        }
        /*scanner.close(); -> Sugestão do Tadeu para zerar os warnings. Não surtiu efeito.*/
        System.out.println(days + " days");
    }

    static String leapYear (int year) {
        String answer;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            answer = "Leap Year";
        } else {
            answer = "Is not Leap Year";
        }
        return answer;
    }
}
