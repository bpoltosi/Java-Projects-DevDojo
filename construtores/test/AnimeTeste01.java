package construtores.test;

import construtores.domain.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime("Evelyn", 17, "Amor", "Romance", "Taiane");
        Anime anim2 = new Anime("Bruno", 18, "Momo", "Romantico", "Liliane");
        anime.imprime();
        System.out.println("------------");
        anim2.imprime();
    }
}