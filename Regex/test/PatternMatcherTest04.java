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
// "." = '1.3' = 123, 133, 1@3, 1A3

public class PatternMatcherTest04 {
    static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "brunopoltosi@gmail.com, 123evelynabade@hotmail.com, #liliansaldanha@mail.br, paulosaldanha@mail";
        System.out.println("#liliansaldanha@mail.br".matches(regex ));
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
