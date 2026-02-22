package aulasmeio.teste;

import aulasmeio.dominio.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Evelyn");
        pessoa.setIdade(17);

//        pessoa.imprimirDados();

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}