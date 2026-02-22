package modificadorFinal.test;

import modificadorFinal.domain.Carro;
import modificadorFinal.domain.Ferrari;

public class CarroTeste01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Velocidade Limite: " + Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Bruno");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Roma");
        ferrari.imprime();

    }
}
