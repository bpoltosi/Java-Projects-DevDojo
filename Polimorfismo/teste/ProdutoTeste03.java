package Polimorfismo.teste;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.serviço.CalculadoraImposto;

public class ProdutoTeste03 {
    static void main(String[] args) {
        Produto produto = new Computador("Ideiapad", 3000);
        Tomate tomate = new Tomate("Tomate rosa", 50);
        tomate.setDataValidade("18/10/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
