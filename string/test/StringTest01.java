package string.test;

public class StringTest01 {
    static void main(String[] args) {
        String nome = "Bruno";
        String nome2 = "Bruno";
        nome = nome.concat(" Poltosi");
        System.out.println(nome == nome2);
        String nome3 = new String("Bruno");
        System.out.println(nome2 == nome3.intern());
    }
}