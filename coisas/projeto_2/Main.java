package projeto_2;

import projeto_2.src.Musicas;
import projeto_2.src.Podcasts;
import projeto_2.src.Preferidas;

public class Main {
    public static void main(String[] args) {
    Musicas musica = new Musicas();
    musica.setTitulo("Cálice");
    musica.setGenero("MPB");
    musica.setAlbum("Calice");
    musica.setArtista("Chico Buarque");


    for(int i = 0; i < 1000; i++) {
    musica.reproduz();
    }
    for(int i = 0; i < 100; i++) {
    musica.curte();
    }

    Podcasts podpa = new Podcasts();
    podpa.setTitulo("Flow Podcast");
    podpa.setHost("Flow");
    podpa.setDescricao("siga o flow no cast");

    for(int i = 0; i < 1000; i++) {
    podpa.reproduz();
    }
    for(int i = 0; i < 100; i++) {
    podpa.curte();
    }

    Preferidas prefere = new Preferidas();
    prefere.inclui(podpa);
    prefere.inclui(musica);
    }
}