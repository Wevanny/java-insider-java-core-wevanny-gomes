package exmathematicstable;

public class ExMathematicsTable {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a number to generate the multiplication table: ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
