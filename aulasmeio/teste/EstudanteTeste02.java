package aulasmeio.teste;
import aulasmeio.dominio.Estudante;

public class EstudanteTeste02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Evelyn";
        Estudante estudante3 = new Estudante();
        estudante3.nome = "Bruno";
        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);
        System.out.println(estudante3.nome);
    }
}
