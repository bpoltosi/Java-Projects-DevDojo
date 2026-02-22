package aulasmeio.teste;

import aulasmeio.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("DentroDaCalculadoraTeste03");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}
