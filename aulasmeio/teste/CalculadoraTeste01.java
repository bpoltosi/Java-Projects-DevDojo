package aulasmeio.teste;

import aulasmeio.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2, 3);
        calculadora.divideDoisNumeros(70, 5);
        System.out.println("Método finalizado");
    }
}
