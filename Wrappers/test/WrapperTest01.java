package Wrappers.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WrapperTest01 {
    static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'B';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'B';
        Boolean booleanW = false;

    int i = intW; // unboxing
    Integer intW2 = Integer.parseInt("1");

        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);

        System.out.println("----------");

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetter('B'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetterOrDigit('-'));

//    int [] intW4 = new int[]{13,22,31,46,57,61,23,521,61,74,642,31};
//        IntStream limit = Arrays.stream(intW4).limit(9);
//        System.out.println(Arrays.stream(intW4).max());
    }
}
