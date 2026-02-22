package associacao.test;

import associacao.domain.Jogador;


public class JogadorTeste01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bruno");
        Jogador jogador2 = new Jogador("Ednei");
        Jogador jogador3 = new Jogador("Igor");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
