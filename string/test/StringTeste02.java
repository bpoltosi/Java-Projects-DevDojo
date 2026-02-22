package string.test;

public class StringTeste02 {
    static void main(String[] args) {
    String nome = "     Bruno     ";
    String nums = "123456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("u", "e"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nums.substring(1));
        System.out.println(nome.trim());
    }
}
