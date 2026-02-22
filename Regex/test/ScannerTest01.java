package Regex.test;

public class ScannerTest01 {
    static void main(String[] args) {
        String texto = "Bruno, Evelyn, Lilian, true, 200";
        String[] nomes = texto.split(" ");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
