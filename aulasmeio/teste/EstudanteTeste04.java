package aulasmeio.teste;

import aulasmeio.dominio.Estudante2;

public class EstudanteTeste04 {
    static void main(String[] args) {
        Estudante2 estudante1 = new Estudante2();
        Estudante2 estudante2 = new Estudante2();
        Estudante2 estudante3 = new Estudante2();

        estudante1.nome = "Bruno";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Evelyn";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        estudante3.nome = "Lilian";
        estudante3.idade = 40;
        estudante3.sexo  = 'F';

        estudante1.imprime();
        estudante2.imprime();
        estudante3.imprime();

    }
}