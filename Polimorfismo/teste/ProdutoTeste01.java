package Polimorfismo.teste;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.serviço.CalculadoraImposto;

public class ProdutoTeste01 {
    static void main(String[] args) {
        Computador computador = new Computador("MacBook", 10000);
        Tomate tomate = new Tomate("Tomate Vermelho", 10);
        Televisao televisao = new Televisao("LG", 1800);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
