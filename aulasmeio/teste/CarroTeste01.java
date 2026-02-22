package aulasmeio.teste;

import aulasmeio.dominio.*;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        ImpressoraCarro impressoraCarro = new ImpressoraCarro();

        carro1.nome = "Corolla";
        carro1.ano = 2024;
        carro1.modelo = "Hybrid";

        carro2.ano = 2018;
        carro2.nome = "Jetta";
        carro2.modelo = "GLI";

        carro3.ano = 2025;
        carro3.nome = "Doplhin";
        carro3.modelo = "BYD";

        impressoraCarro.imprime(carro1);
        System.out.println("-----------");
        impressoraCarro.imprime(carro2);
        System.out.println("----------------");
        impressoraCarro.imprime(carro3);
    }
}