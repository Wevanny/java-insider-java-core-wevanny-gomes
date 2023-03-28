package debuganddocs;

/**
 * Classe do meu programa.
 * @author Wevanny Gomes
 * @version 3.0
 * @since 1.0
 */
@Deprecated(since = "v2.0", forRemoval = true)
public class Javadoc {
    /**
     * Método main.
     * @param args Parâmetros de linha de comando.
     */
    public static void main(String[] args) {
        n1(10);

    }

    /**
     * Este é um método.
     * @param x O booleano.
     */
    private static void n1(int x) {

    }

    /**
     * Este é outro método.
     * @param n1 Número 1.
     * @param n2 Número 2.
     * @return Por enquanto, true.
     */
    private static boolean n2(double n1, double n2) {
        return true;
    }
}
