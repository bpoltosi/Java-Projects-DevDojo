package associacao.test;

import associacao.domain.Jogador;
import associacao.domain.Time;

public class JogadorTeste03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Ednei");
        Jogador jogador2 = new Jogador("Marco");
        Time time = new Time("Gremio");
        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println(" --- Jogador --- ");
        jogador.imprime();
        jogador2.imprime();
        System.out.println(" --- time --- ");
        time.imprime();
    }
}
