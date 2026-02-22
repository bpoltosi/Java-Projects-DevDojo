package Herança.teste;

import Herança.dominio.Endereco;
import Herança.dominio.Funcionario;
import Herança.dominio.Pessoa;

public class HerancaTeste01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Barao de Sao Gabriel");
        endereco.setCep("91330-320");
        Pessoa pessoa = new Pessoa("Bruno");
        pessoa.setCpf("04286535029");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("----------------");

        Funcionario funcionario = new Funcionario("Lilian");
        funcionario.setCpf("298575873");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);

        funcionario.imprime();
    }
}
