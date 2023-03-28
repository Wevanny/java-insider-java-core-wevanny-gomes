package exvehicle;
@SuppressWarnings("all")
public class ExVehicle {
    public static void main(String[] args) {

        //Up to 100 km/h -> + 7km/h;
        //Above 100 km/h -> + 10%;
        //Fine R$10,00 for each kilometer above the considered speed that exceeds the permitted .

        double allowed = 100;
        double current = 101;
        double considered = 0;
        double fine = 0;

        if (allowed < current) {

            if (current < 100) {
                considered = current + 7;
            } else if (current > 100) {
                considered = current + (int)(current * 0.1);
            }

            if (considered > allowed) {
                fine = 10 * (considered - allowed);
            }

        } else {
            fine = 0;
        }

        System.out.println("The fine is: R$" + fine);
    }

}

