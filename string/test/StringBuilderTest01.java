package string.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Bruno";
        System.out.println(nome);

        nome = nome.concat(" Poltosi");
        System.out.println(nome);
        StringBuilder stringBuilder = new StringBuilder("Evelyn Abade");
        stringBuilder.append(" Poltosi");
        System.out.println(stringBuilder);
        String substringZeroCinco = nome.substring(0,5);
        System.out.println(substringZeroCinco);

        System.out.println("-----------------");
        System.out.println(stringBuilder.reverse());

        System.out.println("-----------");
        StringBuilder nomeMinusculos = new StringBuilder(nome.toLowerCase());
        String nomeMinusculosReverso = new String(nomeMinusculos.reverse());

        System.out.println(nomeMinusculosReverso);
    }
}
