package ifelse;

public class IfElse {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Hour: ");
        int hour =  Integer.parseInt(scanner.nextLine());

        if (hour >= 0 && hour < 12) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Good afternoon");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening");
        } else {
            System.out.println("Is not a valid hour!");
        }
    }
}
