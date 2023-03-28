package exdayofweekcarlos;
@SuppressWarnings("all")
public class ExDayOfWeekCarlos {
    public static void main(String[] args) {

        int n = 8;

        String dow = switch (n) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Inválido";
        };

        System.out.println(dow);
    }
}
