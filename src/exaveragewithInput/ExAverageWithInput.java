package exaveragewithInput;
@SuppressWarnings("unused")
public class ExAverageWithInput {
    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        int n = 1;
        double sum = 0.0;

        while(true) {
            System.out.print("Enter your grade " + n + ": ");

            String line = scanner.nextLine();

            //É melhor usar a função abaixo no lugar do line.equals:
            //line.isBlank()
            /*if(line.equals("")) {
                n--;
                break;
            }*/

            if(line.isBlank()) {
                n--;
                break;
            }

            sum += Double.parseDouble(line);
            n++;
            //System.out.println(sum);
        }
        double avg = sum / n;
        System.out.println(n + " grades provided.");
        System.out.println("The average is: " + avg);
    }
}
