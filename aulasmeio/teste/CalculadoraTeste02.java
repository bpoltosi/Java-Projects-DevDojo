package aulasmeio.teste;

import aulasmeio.dominio.Calculadora;

public class CalculadoraTeste02 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.divideDoisNumeros2(190, 2);
        System.out.println(result);
        calculadora.imprimeDivisaoDeDoisNumeros(86.5,2);
    }
}
