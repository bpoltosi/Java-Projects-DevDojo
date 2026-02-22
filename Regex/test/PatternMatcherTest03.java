package Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// "\d" = todos os digitos
// "\D" = tudo que nao for digitos
// "\s""\n""\t""\f""\r" = todos os espacoes em branco
// "\S" = todos os caracteres excluindo os brancos
// "\w" = todos de a-ZA-Z, digitos e "_"
// "\W" = tudo que nao for incluso no "\w"
// "[]" = range
// "?" = zero ou uma
// "*" = zero ou mais
// "+" = uma ou mais
// "+" = uma ou mais
// "{n,m}" = de n até m
// "(n,m)" = agrupamento
// "|" = 'ou'
// "$" = final da linha

public class PatternMatcherTest03 {
    static void main(String[] args) {
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
