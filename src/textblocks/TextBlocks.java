package textblocks;

public class TextBlocks {
    public static void main(String[] args) {

        System.out.println("Olá,\ntudo\nbem");

        System.out.println("Olá,\n  tudo\n    bem");

        String s = """
                Olá,
                    tudo,
                        bem?""";
        System.out.println(s);

        String s2 = """
                Olá,
                    tudo,
                        bem?
             """;
        System.out.println(s2);
    }
}
