package associacao.test;

import associacao.domain.Aluno;
import associacao.domain.Local;
import associacao.domain.Professor;
import associacao.domain.Seminario;

public class AssociacaoTeste01 {
    static void main(String[] args) {
        Local local = new Local("Iguatemi Shopping");
        Aluno aluno = new Aluno("Bruno", 18);
        Professor professor = new Professor("Ednei", "Investimentos");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como investir", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
