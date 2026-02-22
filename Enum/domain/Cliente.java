package Enum.domain;
import Enum.domain.TipoCliente;
public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento TipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        TipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", TipoPagamento=" + TipoPagamento +
                '}';
    }
}