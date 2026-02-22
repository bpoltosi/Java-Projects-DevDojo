package aulasmeio.teste;
import aulasmeio.dominio.Estudante;

public class EstudanteTeste01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Bruno";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome +","+ estudante.idade +" anos,"+ estudante.sexo);
    }
}