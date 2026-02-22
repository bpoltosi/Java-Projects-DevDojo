package Polimorfismo.teste;

import Polimorfismo.repositorio.Repositorio;
import Polimorfismo.serviço.RepositorioBancoDeDados;
import Polimorfismo.serviço.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Bruno");
        list.add("Evelyn");
        list.add("Ednei");
        list.add("Lilian");
        System.out.println(list);
    }
}
