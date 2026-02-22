package ClassesAbstratas.test;

import ClassesAbstratas.domain.Desenvolvedor;
import ClassesAbstratas.domain.Funcionario;
import ClassesAbstratas.domain.Gerente;
import ClassesAbstratas.domain.Productor;

public class FuncionarioTeste01 {
    static void main(String[] args) {
    Gerente gerente = new Gerente("Evelyn", 3000);
    Desenvolvedor desenvolvedor = new Desenvolvedor("Bruno", 2000);
    Productor productor = new Productor("Ednei", 1000);
        gerente.imprime();
        System.out.println(gerente);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
        productor.imprime();
        System.out.println(productor);
    }
}
