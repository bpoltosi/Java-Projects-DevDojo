package Polimorfismo.teste;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    static void main(String[] args) {
        Produto produto = new Computador("Ideiapad", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("------------");

        Produto produto2 = new Computador("Macbook", 9000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }

}
