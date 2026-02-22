package aulasmeio.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(50 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public int divideDoisNumeros2(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else return (num1 / num2);
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num3, int num4) {
        num3 = 99;
        num4 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num3 " + num3);
        System.out.println("Num4 " + num4);

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}