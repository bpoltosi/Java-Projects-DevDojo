package aulasmeio.teste;

import aulasmeio.dominio.Calculadora;

public class CalculadoraTeste04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {23, 26, 35, 31, 55};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(66, 32, 12, 2);
    }
}