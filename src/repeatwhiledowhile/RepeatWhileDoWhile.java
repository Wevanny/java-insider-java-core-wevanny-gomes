package repeatwhiledowhile;
@SuppressWarnings("all")
public class RepeatWhileDoWhile {
    public static void main(String[] args) {

        System.out.println("WHILE");
        int i = 11;

        while(i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Fim i");

        System.out.println("DO..WHILE");
        int j = 11;

        do {
            System.out.println(j);
            j++;
        } while(j <= 10);
        System.out.println("Fim j");
    }
}
