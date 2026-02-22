package ClassesAbstratas.domain;

public class Productor extends Funcionario{
    public Productor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario+ this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Productor: " +
                "nome = " + nome+
                ", salario = " + salario;
    }
}
