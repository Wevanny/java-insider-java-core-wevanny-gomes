package variablenames;
@SuppressWarnings("all")
public class VariableNames {
    public static void main(String[] args) {
        int abc;
        //int 0abc; errado
        int abc42;
        int $var;
        int _var;
        int va$r;
        int var__;
        //int #var; errado
        //int class; errado
        //int package; errado

        int House;
        int house; //Follows convention
        int HOUSE; // Constants convention

        int numberOfYears; //Camel-case
        int number_of_years; //Out of convention
    }
}
