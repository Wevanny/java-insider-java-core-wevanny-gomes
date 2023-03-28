package exaverage;

public class ExAverage {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Nota 1: ");
        double grade1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota 2: ");
        double grade2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Nota 3: ");
        double grade3 = Double.parseDouble(scanner.nextLine());

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("A média é: " + average);
    }
}
