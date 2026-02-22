package sobrecargametodos.teste;
import sobrecargametodos.dominio.*;
public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Nome: Luna ", 97, "Modo de exibição: TV ");
        anime.init("Nome: Luna ", 97, "Modo de exibição: TV ", "Gênero de: Comédia");
        anime.imprime();
    }
}
