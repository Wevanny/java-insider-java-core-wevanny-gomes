package exevensumcarlos;
@SuppressWarnings("all")
public class ExEvenSumCarlos {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i <= 100; i++) {
            sum += i % 2 == 0 ? i : 0;
            //sum = i % 2 == 0 ? sum + i : sum;
            /*if(i % 2 == 0) {
                sum = sum + i;
                //sum += i;
            }*/
        }
        System.out.println(sum);
    }
}
