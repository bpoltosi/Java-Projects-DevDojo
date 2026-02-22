package associacao.test;

import associacao.domain.Escola;
import associacao.domain.Professor;

public class EscolaTeste01 {
    static void main(String[] args) {
        Professor professor1 = new Professor ("Ednei");
        Professor professor2 = new Professor ("Bruno");
        Professor [] professores = {professor1 , professor2};
        Escola escola = new Escola("Mondrian", professores);

        escola.imprime();
    }
}
