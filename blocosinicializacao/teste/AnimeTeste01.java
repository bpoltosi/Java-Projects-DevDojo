package blocosinicializacao.teste;

import blocosinicializacao.domain.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime("Evelyn");

        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio+ " ");
        }
    }
}
