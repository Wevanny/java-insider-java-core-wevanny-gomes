package extemperature;

public class ExTemperature {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Temperature in Fahrenheit: ");
        double tF = Double.parseDouble(scanner.nextLine());

        double tC = (tF - 32) /9 *5;

        System.out.println("The temperature in Celsius is: " + tC);
    }
}
