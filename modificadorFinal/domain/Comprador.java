package modificadorFinal.domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador do Carro: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
