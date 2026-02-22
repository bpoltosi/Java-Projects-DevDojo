package aulasmeio.teste;

import aulasmeio.dominio.Funcionario;

public class FuncionarioTeste01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Bruno");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{760, 1572.50, 0, 1000});

        funcionario.imprime();
        funcionario.getMedia();

        System.out.println("Media: " + funcionario.getMedia());
    }
}
