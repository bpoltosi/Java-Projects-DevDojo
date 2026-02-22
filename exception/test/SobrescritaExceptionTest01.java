package exception.test;

import exception.domain.Funcionario;
import exception.domain.LoginInvalidoException;
import exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {
    static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
