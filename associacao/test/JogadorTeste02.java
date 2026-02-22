package associacao.test;

import associacao.domain.Jogador;
import associacao.domain.Time;

public class JogadorTeste02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bruno");
        Time time = new Time("Brazil");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
