package aulasmeio.teste;

import aulasmeio.dominio.Professor;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "DevDojo";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
